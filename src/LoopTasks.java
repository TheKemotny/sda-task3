public class LoopTasks {
    public static void printNumbersForLoop(int lowerRange, int upperRange){
        for(int i = lowerRange; i <= upperRange; i++){
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void printNumbersWhileLoop(int lowerRange, int upperRange){
        boolean isDone = false;
        int counter = lowerRange - 1;
        while(!isDone){
            System.out.print(++counter + "\t");
            if(counter == upperRange){
                isDone = true;
            }
        }
        System.out.println();
    }

    public static void taskOneForLoop(){
        printNumbersForLoop(1, 100);
    }

    public static void taskOneWhileLoop(){
        printNumbersWhileLoop(1, 100);
    }

    public static void taskTwoForLoop(){
        printNumbersForLoop(8,50);
    }

    public static void taskTwoWhileLoop(){
        printNumbersWhileLoop(8,50);
    }

    public static void taskThreeForLoop(){
        for(int i = 2; i < 51; i ++){
            if(i % 2 == 0){
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    public static void taskThreeWhileLoop(){
        boolean isDone = false;
        int counter = 1;
        while(!isDone){
            if(++counter % 2 == 0) {
                System.out.print(counter + "\t");
            }
            if(counter == 50){
                isDone = true;
            }
        }
        System.out.println();
    }

    public static void taskFourForLoop(){
        for (int i = 100; i > 0; i--) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void taskFourWhileLoop(){
        boolean isDone = false;
        int counter = 100;
        while(!isDone){
            System.out.print(counter-- + "\t");
            if(counter == 0){
                isDone = true;
            }
        }
        System.out.println();
    }

    public static void taskFiveForLoop(){
        for (int i = 1; i < 101; i++) {
            if(i % 8 == 0){
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    public static void taskFiveWhileLoop(){
        boolean isDone = false;
        int counter = 0;
        while (!isDone){
            if(++counter % 8 == 0) {
                System.out.print(counter + "\t");
            }
            if(counter == 100){
                isDone = true;
            }
        }
        System.out.println();
    }

    public static void taskSixForLoop(){
        for (int i = 1; i < 101; i++) {
            if(i % 3 == 0 || i %  5 == 0){
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    public static void taskSixWhileLoop(){
        boolean isDone = false;
        int counter = 0;
        while (!isDone){
            ++counter;
            if(counter % 3 == 0 || counter % 5 == 0) {
                System.out.print(counter + "\t");
            }
            if(counter == 100){
                isDone = true;
            }
        }
        System.out.println();
    }

    public static void taskSevenForLoop(){
        String resultModulo3ButNot5 = "Podzielna przez 3:\t";
        String resultModulo5ButNot3 = "Podzielna przez 5:\t";
        for(int i = 1; i < 101; i++){
            if(i % 3 == 0 && i % 5 != 0){
                resultModulo3ButNot5 = resultModulo3ButNot5.concat(i + "\t");
            }else if (i % 5 == 0 && i % 3 != 0){
                resultModulo5ButNot3 = resultModulo5ButNot3.concat(i + "\t");
            }
        }
        System.out.println(resultModulo3ButNot5);
        System.out.println(resultModulo5ButNot3);
    }

    public static void taskSevenWhileLoop(){
        String resultModulo3ButNot5 = "Podzielna przez 3:\t";
        String resultModulo5ButNot3 = "Podzielna przez 5:\t";
        boolean isDone = false;
        int counter = 0;
        while (!isDone){
            ++counter;
            if(counter % 3 == 0 && counter % 5 != 0){
                resultModulo3ButNot5 = resultModulo3ButNot5.concat(counter + "\t");
            }else if (counter % 5 == 0 && counter % 3 != 0){
                resultModulo5ButNot3 = resultModulo5ButNot3.concat(counter + "\t");
            }
            if(counter == 100){
                isDone = true;
            }
        }
        System.out.println(resultModulo3ButNot5);
        System.out.println(resultModulo5ButNot3);
    }

    public static void taskEightForLoop(){
        int max = -1;
        int moduloCounter = 0;
        for(int i = 1; i < 2000; i++){
            for(int modulo: new int[]{2, 3, 5, 7}){
                if(i % modulo == 0){
                    moduloCounter++;
                }
            }
            if(moduloCounter == 0 && max < i){
                max = i;
            }
            moduloCounter = 0;
        }
        System.out.println(max);
    }

    public static void taskEightWhileLoop(){
        boolean isDone = false;
        int whileCounter = 0;
        int max = 0;
        int modulosCounter = 0;
        boolean isDivisibleByModulos = false;
        int[] modulos = {2,3,5,7};
        while (!isDone){
            ++whileCounter;
            modulosCounter = 0;
            while (modulosCounter != modulos.length || !isDivisibleByModulos){
                if(whileCounter % modulos[modulosCounter] == 0){
                    isDivisibleByModulos = true;
                }
                modulosCounter++;
            }
            if(!isDivisibleByModulos && max < whileCounter){
                max = whileCounter;
            }
            isDivisibleByModulos = false;
            if(whileCounter == 1000){
                isDone = true;
            }
        }
        System.out.println(max);
    }

    public static void taskNineForLoop(int number){
        String result = "Number " + number + " ";
        if(number % 2 == 0){
            result = result.concat("is even");
        }else {
            result = result.concat("is odd");
        }
        System.out.println(result);
    }

    public static void taskNineWhileLoop(){

    }

    public static void taskTenForLoop(int number){
        int moduloCounter = 1;
        String result = "Number " + number + " is ";
        for(int i = 2; i <= number; i++){
            if(number % i == 0){
                moduloCounter++;
            }
        }
        if(moduloCounter == 2){
            result = result.concat("prime");
        }else{
            result = result.concat("not a prime");
        }
        System.out.println(result);
    }

    public static void taskTenWhileLoop(int number){
        int mudoloCounter = 1;
        int numberCounter = 2;
        String result = "Number " + number + " is ";
        boolean isPrime = true;
        boolean isOutOfNumber = false;
        while(isPrime && !isOutOfNumber){
            if(number % numberCounter == 0){
                mudoloCounter++;
            }
            if(mudoloCounter == 3){
                isPrime = false;
            }
            if(++numberCounter == number){
                isOutOfNumber = true;
            }
        }
        if(isPrime){
            result = result.concat("prime");
        }else{
            result = result.concat("not a prime");
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        taskTenWhileLoop(11);
    }
}
