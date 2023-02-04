import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ThirdSetOfTasks {
    public static int getNumberFromUserWithMessage(String message){
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect;
        int result = 0;
        System.out.println(message);
        do{
            try {
                result = scanner.nextInt();
                isCorrect  = true;
            }catch (Exception e){
                scanner.nextLine();
                System.out.println("NOT A NUMBER, TRY AGAIN.");
                isCorrect = false;
            }
        }while(!isCorrect);
        return result;
    }


    public static int sumOfNumbers(int... numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }

    public static String printStrings(String... strings){
        String result = "";
        for(String sentence: strings){
            result = result.concat(sentence);
        }
        return result;
    }

    public static int numberOfElementsInTheArrays(int[]... arrays){
        int counterOfElements = 0;
        for(int[] array: arrays){
            counterOfElements += array.length;
        }
        return counterOfElements;
    }

    public static void taskOne(){
        System.out.println("SUM OF NUMBERS: " + sumOfNumbers(1,2,3,4,5,6,7,8,9,0));
    }

    public static void taskTwo(){
        System.out.println("STRINGS: " + printStrings("Ala"," ","ma"," ","kota"));
    }

    public static void taskThree(){
        Random random = new Random();
        int[] arrayOne = new int[random.nextInt(5)+1];
        int[] arrayTwo = new int[random.nextInt(5)+1];
        int[] arrayThree = new int[random.nextInt(5)+1];
        System.out.println("NUMBER OF ELEMENTS IN ARRAYS: " + numberOfElementsInTheArrays(
                arrayOne,
                arrayTwo,
                arrayThree));
    }

    public static int maxNumberFromNumbers(int... numbers){
        int max = Integer.MIN_VALUE;
        for(int number: numbers){
            max = Math.max(max,number);
            //max = (max < number) ? number : max;
            /*if(max < number){
                max = number;
            }*/
        }
        return max;
    }

    public static void taskFour(){
        System.out.println("MAX FORM NUMBERS: " + maxNumberFromNumbers(1,2,3,155,515,154,13,9));
    }

    public static double addNumbers(double a, double b){
        return a + b;
    }

    public static double subtractNumbers(double a, double b){
        return a - b;
    }

    public static double multipleNumber(double a, double b){
        return a * b;
    }

    public static double divideNumbers(double a, double b){
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static ArrayList<Integer> readIntegersFromFile(String fileName){
        File file = new File(fileName);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                integerArrayList.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return integerArrayList;
    }

    public static void taskFive(){
        String fileName = "src/inputForFive.txt";
        ArrayList<Integer> integerArrayList = readIntegersFromFile(fileName);
        int result = getNumberFromUserWithMessage(
                "WHAT YOU WANT TO DO WITH INPUT: \n1. ADD \n2. SUBTRACT \n3. MULTIPLE \n4. DIVIDE");
        double a, b;
        for(int i = 0; i < integerArrayList.size(); i = i + 2){
            a = integerArrayList.get(i);
            b = integerArrayList.get(i + 1);
            System.out.print("LINE " + (i / 2) + ": ");
            switch (result){
                default -> System.out.print(a + " " + b);
                case 1 -> System.out.print(a + " + " + b + " = " +  addNumbers(a, b));
                case 2 -> System.out.print(a + " - " + b + " = " +  subtractNumbers(a, b));
                case 3 -> System.out.print(a + " * " + b + " = " +  multipleNumber(a, b));
                case 4 -> System.out.print(a + " / " + b + " = " +  divideNumbers(a, b));
            }
            System.out.println();
        }
    }

    public static void taskSix(String fileName){
            File file = new File(fileName);
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()){
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
    }

    public static int taskSeven(String fileName){
        File file = new File(fileName);
        int wordCounter = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                scanner.next();
                wordCounter++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return wordCounter;
    }

    public static void taskEight(String fileName, String word){
        File file = new File(fileName);
        String line;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                line = scanner.nextLine();
                if(line.contains(word)){
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(String fileName, String... dane){
        try{
            FileWriter fileWriter = new FileWriter(fileName);
            for (int i = 0; i < dane.length; i++) {
                if(i == dane.length - 1){
                    fileWriter.write(dane[i] + "");
                }else{
                    fileWriter.write(dane[i] + "\n");
                }
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void taskTen(){
        int x = getNumberFromUserWithMessage("X OF POINT 1");
        int y = getNumberFromUserWithMessage("Y OF POINT 1");
        Point pointOne = new Point(x,y);
        x = getNumberFromUserWithMessage("X OF NUMBER 2");
        y = getNumberFromUserWithMessage("Y OF NUMBER 2");
        Point pointTwo = new Point(x,y);
        writeToFile("files/output.txt", String.valueOf(pointTwo.distanceBetweenPoints(pointOne)));
    }

    public static void taskNine(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        boolean isDone = false;
        String result;
        System.out.println("SAFE WORD: DEAD-BEEF");
        do{
            result = scanner.next();
            stringArrayList.add(result);
            if(result.contains("DEAD-BEEF")){
                isDone = true;
            }
        }while (!isDone);
        writeToFile("src/outputTwo.txt", stringArrayList.toArray(new String[0]));
    }

    public static void taskEleven(){
        Scanner scanner = new Scanner(System.in);
        boolean isDone = false;
        int result;
        int sum = 0;
        System.out.println("ENTER 0 TO EXIT");
        int counter = 0;
        do{
            result = getNumberFromUserWithMessage("ENTER " + counter + " NUMBER: ");
            sum += result;
            counter++;
            if(result == 0){
                isDone = true;
            }
        }while (!isDone);
        double average = (double) sum / counter;
        writeToFile("src/outputThree.txt", String.valueOf(average));
    }


    public static void main(String[] args) {
//        taskOne();
//        taskTwo();
//        taskThree();
//        taskFour();
//        taskFive();
//        String fileName = "src/inputForFive.txt";
//        taskSix(fileName);
//        System.out.println("WORDS IN FILE: " + taskSeven(fileName));
//        taskEight(fileName, "1");
//        taskNine();
        taskEleven();
    }
}
