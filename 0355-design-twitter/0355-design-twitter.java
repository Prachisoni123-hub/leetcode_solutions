import java.util.*;

class Twitter {

    // Tweet class
    class Tweet {
        int id;
        int time;

        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    // user -> users they follow
    HashMap<Integer, HashSet<Integer>> followMap;

    // user -> tweets
    HashMap<Integer, List<Tweet>> tweetMap;

    // Global timestamp
    int time;

    public Twitter() {
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
        time = 0;
    }

    // Post a tweet
    public void postTweet(int userId, int tweetId) {

        tweetMap.putIfAbsent(userId, new ArrayList<>());

        tweetMap.get(userId).add(new Tweet(tweetId, time++));
    }

    // Return latest 10 tweets
    public List<Integer> getNewsFeed(int userId) {

        PriorityQueue<Tweet> pq = new PriorityQueue<>(
            (a, b) -> b.time - a.time
        );

        // Add own tweets
        if (tweetMap.containsKey(userId)) {
            pq.addAll(tweetMap.get(userId));
        }

        // Add followed users' tweets
        if (followMap.containsKey(userId)) {

            for (int followee : followMap.get(userId)) {

                if (tweetMap.containsKey(followee)) {
                    pq.addAll(tweetMap.get(followee));
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty() && ans.size() < 10) {
            ans.add(pq.poll().id);
        }

        return ans;
    }

    // Follow a user
    public void follow(int followerId, int followeeId) {

        if (followerId == followeeId)
            return;

        followMap.putIfAbsent(followerId, new HashSet<>());

        followMap.get(followerId).add(followeeId);
    }

    // Unfollow a user
    public void unfollow(int followerId, int followeeId) {

        if (followMap.containsKey(followerId)) {
            followMap.get(followerId).remove(followeeId);
        }
    }
}