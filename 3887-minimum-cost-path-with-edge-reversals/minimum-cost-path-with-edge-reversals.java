import java.util.*;

class Solution {
    public int minCost(int n, int[][] edges) {
        
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            
            // normal edge
            graph[u].add(new int[]{v, w});
            
            // reversed edge (cost = 2 * w)
            graph[v].add(new int[]{u, 2 * w});
        }
        
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        
        dist[0] = 0;
        pq.offer(new long[]{0, 0});
        
        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long cost = curr[0];
            int node = (int) curr[1];
            
            if (cost > dist[node]) continue;
            
            for (int[] next : graph[node]) {
                int v = next[0];
                int w = next[1];
                
                if (dist[v] > cost + w) {
                    dist[v] = cost + w;
                    pq.offer(new long[]{dist[v], v});
                }
            }
        }
        
        return dist[n - 1] == Long.MAX_VALUE ? -1 : (int) dist[n-1];
    }
}
