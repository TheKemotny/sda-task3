import java.util.Random;

public class OneDimensionalArrays {

    public static void printArray(int[] arrayToPrint){
        for(int number: arrayToPrint){
            System.out.print(number + "\t");
        }
        System.out.println();
    }

    public static int[] generateRandomArray(int sizeOfArray, int lowerRangeOfNumbers, int upperRangeOfNumber){
        int[] arrayToReturn = new int[sizeOfArray];
        Random random = new Random();
        for(int i = 0; i < arrayToReturn.length; i++){
            arrayToReturn[i] = random.nextInt(upperRangeOfNumber - lowerRangeOfNumbers + 1) + lowerRangeOfNumbers;
        }
        return  arrayToReturn;
    }

    public static void taskOne(){
        int[] array = generateRandomArray(10,0,25);
        printArray(array);
    }

    public static void taskTwo(){
        int[] array = generateRandomArray(10,0,25);
        printArray(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static int findMaxInArray(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static void taskThree(){
        int[] array = generateRandomArray(10,0,50);
        int max = findMaxInArray(array);
        printArray(array);
        System.out.println("The maximum number in the array is " + max);
    }

    public static int findMinInArray(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static void taskFour(){
        int[] array = generateRandomArray(10, 0, 50);
        int min = findMinInArray(array);
        printArray(array);
        System.out.println("The minimum number in the array is " + min);
    }

    public static int countOfNumberInTheArray(int number, int[] array){
        int countOfNumber = 0;
        for(int numberInTheArray: array){
            if(numberInTheArray == number){
                countOfNumber++;
            }
        }
        return countOfNumber;
    }

    public static void taskFive(){
        int[] array = generateRandomArray(10,0,50);
        int max = findMaxInArray(array);
        int countOfMax = countOfNumberInTheArray(max,array);
        printArray(array);
        System.out.println("The maximum number in the array is " + max + " and their count is " + countOfMax);
    }

    public static void taskSix(){
        int[] array = generateRandomArray(10, 0,50);
        int min = findMinInArray(array);
        int countOfMin = countOfNumberInTheArray(min, array);
        printArray(array);
        System.out.println("The minimum number in the array is " + min + " and their count is " + countOfMin);
    }

    public static void taskSeven(){
        int[] array = generateRandomArray(10, 0, 50);
        int max = findMaxInArray(array);
        int secondMax = findMinInArray(array);
        for(int i = 1; i < array.length; i++){
            if(secondMax < array[i] && max > array[i]){
                secondMax = array[i];
            }
        }
        printArray(array);
        System.out.println("The maximum number in the array is " + max + " and second biggest is " + secondMax);
    }

    public static void taskEight(){
        int[] array = generateRandomArray(10, 0, 50);
        int min = findMinInArray(array);
        int secondMin = findMaxInArray(array);
        for(int i = 1; i < array.length; i++){
            if(secondMin > array[i] && min < array[i]){
                secondMin = array[i];
            }
        }
        printArray(array);
        System.out.println("The minimum number in the array is " + min + " and second lowest is " + secondMin);
    }

    public static int[] raiseArrayToPower(int[] array, int power){
        int[] returnArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            returnArray[i] = (int) Math.pow(array[i],power);
        }
        return returnArray;
    }

    public static void taskNine(){
        int[] array = generateRandomArray(10, 0, 10);
        printArray(array);
        int[] powerOf2Array = raiseArrayToPower(array,2);
        printArray(powerOf2Array);
    }

    public static void taskTen(){
        int[] array = generateRandomArray(10,0,5);
        printArray(array);
        int[] powerOf3Array = raiseArrayToPower(array,3);
        printArray(powerOf3Array);
    }

    public static void taskEleven(){
        int[] array = generateRandomArray(10, 0, 50);
        printArray(array);
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] + 1;
        }
        printArray(array);
    }

    public static void taskTwelve(){
        int[] array = generateRandomArray(10,0,50);
        printArray(array);
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] * 2;
        }
        printArray(array);
    }

    public static void printNumbersDividedByModulo(int modulo, int... numbers){
        for(int number: numbers){
            if(number % modulo == 0){
                System.out.print(number + "\t");
            }
        }
        System.out.println();
    }

    public static void taskThirteen(){
        int[] array = generateRandomArray(10, 0, 50);
        printArray(array);
        printNumbersDividedByModulo(2,array);
    }

    public static void taskFourteen(){
        int[] array = generateRandomArray(10, 0, 50);
        printArray(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0) {
                System.out.print(array[i] + "\t");
            }
        }
        System.out.println();
    }

    public static void taskFifteen(){
        int[] array = generateRandomArray(10, 0, 50);
        printArray(array);
        printNumbersDividedByModulo(3,array);
    }

    public static void taskSixteen(){
        int[] array = generateRandomArray(10,0,50);
        printArray(array);
        for(int number: array){
            if(number >= 4 && number < 15){
                System.out.print(number + "\t");
            }
        }
        System.out.println();
    }

    public static void taskSeventeen(){
        int[] array = generateRandomArray(10, 0, 50);
        printArray(array);
        int number;
        int lastDigitOfNumber = -1;
        boolean isAllDigitsEven = true;
        for (int i = 0; i < array.length; i++) {
            number = array[i];
            do{
                lastDigitOfNumber = number % 10;
                number /= 10;
                if(lastDigitOfNumber % 2 != 0){
                    isAllDigitsEven = false;
                }
            }while(number!=0);
            if(isAllDigitsEven){
                System.out.print(array[i] + "\t");
            }
            isAllDigitsEven = true;
        }
        System.out.println();
    }

    public static void taskEighteen(){
        int[] array = generateRandomArray(10, 0, 50);
        printArray(array);
        int number;
        int lastDigitOfNumber;
        int sumOfDigits;
        for (int i = 0; i < array.length; i++) {
            sumOfDigits = 0;
            number = array[i];
            do{
                lastDigitOfNumber = number % 10;
                sumOfDigits += lastDigitOfNumber;
                number /= 10;
            }while(number!=0);
            if(sumOfDigits == 1){
                System.out.print(array[i] + "\t");
            }
        }
        System.out.println();
    }

    public static void taskNineteen(){
        int[] array = generateRandomArray(10,0,50);
        printArray(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                array[i] += 100;
            }
        }
        printArray(array);
    }

    public static void taskTwenty(){
        int[] array = generateRandomArray(10,-20, 50);
        printArray(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                array[i] = 0;
            }
        }
        printArray(array);
    }

    public static void taskTwentyOne(){
        int[] array =generateRandomArray(10, 0, 50);
        printArray(array);
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                System.out.print(array[i] + "\t");
            }
        }
        System.out.println();
    }

    public static boolean isNumberInTheArray(int[] array, int number){
        boolean isInTheArray = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                isInTheArray = true;
            }
        }
        return isInTheArray;
    }


    public static void taskTwentyTwo(){
        int[] array = generateRandomArray(10, 0, 50);
        printArray(array);
        int[] arrayOfIndexToPowerOfTwo = new int[array.length];
        for(int i = 0; i < arrayOfIndexToPowerOfTwo.length; i++){
            arrayOfIndexToPowerOfTwo[i] = (int) Math.pow(i,2);
        }
        for(int i = 0; i < array.length; i++){
            if(isNumberInTheArray(arrayOfIndexToPowerOfTwo, i)){
                System.out.print(array[i] + "\t");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {

    }
}
