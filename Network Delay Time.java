// You are given a network of n nodes, labeled from 1 to n. You are also given times, a list of travel times as directed edges times[i] = (ui, vi, wi), where ui is the source node, vi is the target node, and wi is the time it takes for a signal to travel from source to target.

// We will send a signal from a given node k. Return the minimum time it takes for all the n nodes to receive the signal. If it is impossible for all the n nodes to receive the signal, return -1.

 class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Create adjacency list
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());
        for (int[] time : times)
            adj.get(time[0]).add(new int[]{time[1], time[2]});

        // Min-heap: {time so far, node}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, k});

        // Distance array: shortest time to each node
        int[] network = new int[n + 1];
        Arrays.fill(network, Integer.MAX_VALUE);
        network[k] = 0;

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int cur_time = top[0], cur_node = top[1];

            // Skip if we already have a shorter path
            if (cur_time > network[cur_node]) continue;

            // Explore neighbors
            for (int[] neighbor : adj.get(cur_node)) {
                int next_node = neighbor[0];
                int next_time = cur_time + neighbor[1];
                if (next_time < network[next_node]) {
                    network[next_node] = next_time;
                    pq.add(new int[]{next_time, next_node});
                }
            }
        }

        // Get the maximum time
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (network[i] == Integer.MAX_VALUE) return -1;
            maxTime = Math.max(maxTime, network[i]);
        }

        return maxTime;
    }
}

 //time complexity
//o(N+E)
//space complexity
//o(N+E)