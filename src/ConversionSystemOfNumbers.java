public class ConversionSystemOfNumbers {
    public static String fromDecimalToBinary(int number){
        String result = "";
        int restAfterDivision;
        do{
            restAfterDivision = number % 2;
            result = String.valueOf(restAfterDivision).concat(result);
            number /= 2;
        }while(number!=0);
        return result;
    }

    public static String fromDecimalToOctal(int number){
        String result = "";
        int restAfterDivision;
        do{
            restAfterDivision = number % 8;
            result = String.valueOf(restAfterDivision).concat(result);
            number /= 8;
        }while(number!=0);
        return result;
    }

    public static String fromDecimalToHexadecimal(int number){
        String result = "";
        int restAfterDivision;
        do{
            restAfterDivision = number % 16;
            if(restAfterDivision >= 0 && restAfterDivision <= 9){
                result = String.valueOf(restAfterDivision).concat(result);
            }else{
                restAfterDivision += 55;
                result = String.valueOf((char) restAfterDivision).concat(result);
            }
            number /= 16;
        }while(number!=0);
        return result;
    }

    private static int parseToIntFromChar(char character){
        return Integer.parseInt(String.valueOf(character));
    }

    private static int parseToIntFromHexadecimalChar(char character){
        return Integer.parseInt(String.valueOf(character - 'A' + 10));
    }

    private static boolean isNotBinary(String number){
        int tmpNumber;
        for(int i = 0; i < number.length(); i++){
            try{
                tmpNumber = parseToIntFromChar(number.charAt(i));
                if (tmpNumber != 0 && tmpNumber != 1) {
                    return true;
                }
            }catch (Exception e){
                return true;
            }
        }
        return false;
    }

    public static int fromBinaryToDecimal(String number){
        if(isNotBinary(number)){
            return -1;
        }
        int bitInWord;
        int wordCounter = 0;
        int valueOfBit;
        int sum = 0;
        for(int i = number.length() - 1; i >= 0; i--){
            bitInWord = parseToIntFromChar(number.charAt(i));
            valueOfBit = bitInWord * ((int) Math.pow(2,wordCounter++));
            sum += valueOfBit;
        }
        return sum;
    }

    public static String fromBinaryToOctal(String number){
        if(isNotBinary(number)){
            return "-1";
        }
        int inDecimal = fromBinaryToDecimal(number);
        return fromDecimalToOctal(inDecimal);
    }

    public static String fromBinaryToHexadecimal(String number){
        if(isNotBinary(number)){
            return "-1";
        }
        int inDecimal = fromBinaryToDecimal(number);
        return fromDecimalToHexadecimal(inDecimal);
    }

    private static boolean isNotOctal(String number){
        int tmpNumber;
        for(int i = 0; i < number.length(); i++){
            try{
                tmpNumber = parseToIntFromChar(number.charAt(i));
                if (tmpNumber < 0 || tmpNumber > 7) {
                    return true;
                }
            }catch (Exception e){
                return true;
            }
        }
        return false;
    }

    public static int fromOctalToDecimal(String number){
        if(isNotOctal(number)){
            return -1;
        }
        int bitInWord;
        int wordCounter = 0;
        int valueOfBit;
        int sum = 0;
        for(int i = number.length() - 1; i >= 0; i--){
            bitInWord = parseToIntFromChar(number.charAt(i));
            valueOfBit = bitInWord * ((int) Math.pow(8,wordCounter++));
            sum += valueOfBit;
        }
        return sum;
    }

    public static String fromOctalToBinary(String number){
        if(isNotOctal(number)){
            return "-1";
        }
        int inDecimal = fromOctalToDecimal(number);
        return fromDecimalToBinary(inDecimal);
    }

    public static String fromOctalToHexadecimal(String number){
        if(isNotOctal(number)){
            return "-1";
        }
        int inDecimal = fromOctalToDecimal(number);
        return fromDecimalToHexadecimal(inDecimal);
    }

    public static boolean isInTheArray(char[] array,char charToFind){
        for (char c : array) {
            if (c == charToFind) {
                return true;
            }
        }
        return false;
    }


    private static boolean isNotHexadecimal(String number){
        char tmpChar;
        char[] hexadecimalChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        for(int i = 0; i < number.length(); i++){
            try{
                tmpChar = number.charAt(i);
                if(!isInTheArray(hexadecimalChars, tmpChar)){
                    return true;
                }
            }catch (Exception e){
                return true;
            }
        }
        return false;
    }

    public static int fromHexadecimalToDecimal(String number){
        if(isNotHexadecimal(number)){
            return -1;
        }
        int bitInWord;
        int wordCounter = 0;
        int valueOfBit;
        int sum = 0;
        for(int i = number.length() - 1; i >= 0; i--){
            bitInWord = parseToIntFromHexadecimalChar(number.charAt(i));
            valueOfBit = bitInWord * ((int) Math.pow(16,wordCounter++));
            sum += valueOfBit;
        }
        return sum;
    }

    public static String fromHexadecimalToBinary(String number){
        if(isNotHexadecimal(number)){
            return "-1";
        }
        int numberInDecimal = fromHexadecimalToDecimal(number);
        return fromDecimalToBinary(numberInDecimal);
    }

    public static String fromHexadecimalToOctal(String number){
        if(isNotHexadecimal(number)){
            return "-1";
        }
        int numberInDecimal = fromHexadecimalToDecimal(number);
        return fromDecimalToOctal(numberInDecimal);
    }

    public static void main(String[] args) {
        int number = 67230;
        String octal = fromDecimalToOctal(number);
        String binary = fromDecimalToBinary(number);
        String hexadecimal = fromDecimalToHexadecimal(number);
        System.out.println("Number: " + number);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }
}

