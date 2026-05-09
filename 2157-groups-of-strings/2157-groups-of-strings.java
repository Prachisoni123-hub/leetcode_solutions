import java.util.*;

class Solution {
    int[] parent;
    int[] size;

    public int[] groupStrings(String[] words) {
        int n = words.length;

        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int mask = getMask(words[i]);

            if (map.containsKey(mask)) {
                union(i, map.get(mask));
            } else {
                map.put(mask, i);
            }
        }

        for (int i = 0; i < n; i++) {
            int mask = getMask(words[i]);

            // Add or remove one character
            for (int j = 0; j < 26; j++) {
                int newMask = mask ^ (1 << j);

                if (map.containsKey(newMask)) {
                    union(i, map.get(newMask));
                }
            }

            // Replace one character
            for (int j = 0; j < 26; j++) {
                if ((mask & (1 << j)) != 0) {
                    int removed = mask ^ (1 << j);

                    for (int k = 0; k < 26; k++) {
                        if ((removed & (1 << k)) == 0) {
                            int replaced = removed | (1 << k);

                            if (map.containsKey(replaced)) {
                                union(i, map.get(replaced));
                            }
                        }
                    }
                }
            }
        }

        int groups = 0;
        int maxSize = 0;

        for (int i = 0; i < n; i++) {
            if (parent[i] == i) {
                groups++;
                maxSize = Math.max(maxSize, size[i]);
            }
        }

        return new int[]{groups, maxSize};
    }

    private int getMask(String word) {
        int mask = 0;

        for (char ch : word.toCharArray()) {
            mask = mask | (1 << (ch - 'a'));
        }

        return mask;
    }

    private int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        parent[x] = find(parent[x]);
        return parent[x];
    }

    private void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);

        if (parentA == parentB) {
            return;
        }

        if (size[parentA] < size[parentB]) {
            parent[parentA] = parentB;
            size[parentB] += size[parentA];
        } else {
            parent[parentB] = parentA;
            size[parentA] += size[parentB];
        }
    }
}