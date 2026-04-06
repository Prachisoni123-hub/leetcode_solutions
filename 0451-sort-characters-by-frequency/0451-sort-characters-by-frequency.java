

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // convert to list
        List<Character> list = new ArrayList<>(map.keySet());

        // sort based on frequency
        list.sort((a, b) -> map.get(b) - map.get(a));

        // build result
        StringBuilder result = new StringBuilder();

        for (char ch : list) {
            int freq = map.get(ch);
            while (freq-- > 0) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}