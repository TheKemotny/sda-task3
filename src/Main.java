import java.util.*;

public class Main {
    public static int[][] calculateGraph(ArrayList<Point> points){
        int[][] arrayToReturn = new int[points.size()][points.size()];
        for(int i = 0; i < arrayToReturn.length; i++){
            for (int j = 0; j < arrayToReturn[i].length; j++) {
                arrayToReturn[i][j] = (int) points.get(i).distanceBetweenPoints(points.get(j));
            }
        }
        return arrayToReturn;
    }

    public static void print2DArray(int[][] array2D){
        for(int[] array: array2D){
            for (int number: array){
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        Random random = new Random();
        int numberOfCities = ThirdSetOfTasks.getNumberFromUserWithMessage("HOW MANY CITIES TO CREATE: ");
        for(int i = 0; i < numberOfCities; i++){
            int x = random.nextInt(50);
            int y = random.nextInt(50);
            Point point = new Point(x,y);
            while (points.contains(point)){
                point.moveTo(x + 1, y + 1);
            }
            points.add(point);
        }
        System.out.println(points);
        int[][] graph2 = calculateGraph(points);
        print2DArray(graph2);
        TSP tsp = new TSP();
        System.out.println("Minimum Travel Cost: " + tsp.minTravelCost(graph2));
    }
}

