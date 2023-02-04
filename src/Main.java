import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] graph = {{0, 10, 15, 20}, {10, 0, 35, 25}, {15, 35, 0, 30}, {20, 25, 30, 0}};
        TSP tsp = new TSP();
        System.out.println("Minimum Travel Cost: " + tsp.minTravelCost(graph));
    }
}

