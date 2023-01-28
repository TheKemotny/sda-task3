import java.util.Random;

public class TwoDimensionalArrays {
    public static void print2DArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generate2DArray(int numberOfRows, int numberOfColumns, int lowerRangeOfNumbers, int upperRangeOfNumbers){
        int[][] array = new int[numberOfRows][numberOfColumns];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(upperRangeOfNumbers - lowerRangeOfNumbers + 1)+lowerRangeOfNumbers;
            }
        }
        return array;
    }

    public static void taskOne(){
        int[][] array = generate2DArray(5,5,0,10);
        print2DArray(array);
    }

    public static void taskTwo(){
        int[][] arrayA = generate2DArray(5,5,0,10);
        print2DArray(arrayA);
        int[][] arrayB = new int[arrayA.length][arrayA[0].length];
        for(int i = 0; i < arrayB.length; i++){
            for (int j = 0; j < arrayB[i].length; j++) {
                arrayB[i][j] = arrayA[i][j];
            }
        }
        print2DArray(arrayB);
    }

    public static void taskThree(){
        int[][] arrayA = generate2DArray(5,5,0,10);
        print2DArray(arrayA);
        System.out.println();
        int[][] arrayB = new int[arrayA.length][arrayA[0].length];
        for(int i = 0; i < arrayB.length; i++){
            for (int j = 0; j < arrayB[i].length; j++) {
                arrayB[i][j] = arrayA[i][arrayA[i].length-j-1];
            }
        }
        print2DArray(arrayB);
    }

    public static void taskFour(){
        int[][] array = generate2DArray(5,5,0,10);
        print2DArray(array);
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of all elements in the array: " + sum);
    }

    public static void taskFive(){
        int[][] arrayA = generate2DArray(5,5,0,10);
        print2DArray(arrayA);
        System.out.println();
        int[][] arrayB = new int[arrayA.length][arrayA[0].length];
        for(int i = 0; i < arrayB.length; i++){
            for (int j = 0; j < arrayB[i].length; j++) {
                arrayB[i][j] = arrayA[arrayA.length-i-1][j];
            }
        }
        print2DArray(arrayB);
    }

    public static void taskSix(){
        int[][] array = generate2DArray(5,5,0,10);
        print2DArray(array);
        System.out.println();
        for(int i = 0; i < array[0].length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[j][i] + "\t");
            }
            System.out.println();
        }
    }

    public static void taskSeven(){
        int[][] array = generate2DArray(5,5,0,10);
        int[] sumOfRow = new int[array.length];
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                sumOfRow[i] += array[i][j];
                if(j == (array[i].length - 1)){
                    System.out.print(array[i][j] + " \t");
                }else{
                    System.out.print(array[i][j] + " \t+\t");
                }
            }
            System.out.println("=\t" + sumOfRow[i]);
        }
    }

    public static void taskEight(){
        int[][] array = generate2DArray(5,5,0,10);
        int[] sumOfColumns = new int[array.length];
        print2DArray(array);
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                sumOfColumns[j] += array[i][j];
            }
        }
        System.out.println("Sum of columns: ");
        for (int i = 0; i < sumOfColumns.length; i++) {
            System.out.print(sumOfColumns[i] + "\t");
        }
        System.out.println();
    }

    public static void taskNine(){
        int[][] array = generate2DArray(5,5,0,10);
        print2DArray(array);
        int sum = 0;
        System.out.println();
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if(i == j){
                    System.out.print(array[i][j] + "\t");
                    sum += array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Diagonal sum: " + sum);
    }

    public static void taskTen(){
        int[][] array = generate2DArray(5,5,0,10);
        print2DArray(array);
        int sum = 0;
        System.out.println();
        for(int i = 0; i < array.length; i++){
            int j = array.length - i - 1;
            System.out.print(array[i][j] + "\t");
            sum += array[i][j];
        }
        System.out.println();
        System.out.println("Diagonal sum: " + sum);
    }



    public static void main(String[] args) {
        taskTen();
    }
}
