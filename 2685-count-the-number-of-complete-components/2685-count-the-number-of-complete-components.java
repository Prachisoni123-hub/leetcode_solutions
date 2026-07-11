class Solution {

    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int completeComponents = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] result = new int[2]; // result[0] = nodes, result[1] = degreeSum
                dfs(i, graph, visited, result);

                int nodes = result[0];
                int edgesCount = result[1] / 2;

                if (edgesCount == nodes * (nodes - 1) / 2) {
                    completeComponents++;
                }
            }
        }

        return completeComponents;
    }

    private void dfs(int node, List<Integer>[] graph, boolean[] visited, int[] result) {
        visited[node] = true;
        result[0]++;                     // Count nodes
        result[1] += graph[node].size(); // Sum of degrees

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, result);
            }
        }
    }
}