// Last updated: 9/3/2025, 10:07:55 AM
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < times.length; i++) {
            adj.get(times[i][0]).add(new int[] { times[i][1], times[i][2] });
        }

        int[] dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[] { k, 0 });
        dis[k] = 0;
        while (!pq.isEmpty()) {
            int[] node = pq.poll();
            for (int[] nei : adj.get(node[0])) {
                int d = nei[1] + node[1];
                if (dis[nei[0]] > d) {
                    pq.add(new int[] { nei[0], d });
                    dis[nei[0]] = d;
                }
            }
        }
        pq = null;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if (dis[i] == Integer.MAX_VALUE) {
                return -1;
            }
            if (dis[i] > max) {
                max = dis[i];
            }
        }
        return max;
    }
}