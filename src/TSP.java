import java.util.ArrayList;

public class TSP {

    int minTravelCost(int[][] graph) {
        int V = graph.length;
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        ArrayList<Integer> path = new ArrayList<>();
        int start = 0;
        path.add(start);
        visited[start] = true;
        int count = 1;
        while (count < V) {
            int index = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < V; i++) {
                if (graph[start][i] > 0 && !visited[i]) {
                    if (graph[start][i] < min) {
                        min = graph[start][i];
                        index = i;
                    }
                }
            }
            path.add(index);
            visited[index] = true;
            start = index;
            count++;
        }
        int cost = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            cost += graph[path.get(i)][path.get(i + 1)];
        }
        cost += graph[path.get(path.size() - 1)][0];
        return cost;
    }
}
