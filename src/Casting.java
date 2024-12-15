public class Casting {

    public static void implicitConversionExamples() {
        System.out.println("== Implicit Conversion Examples ==");

        // (Int -> Double)
        int intNum = 42;
        double doubleNum = intNum;
        System.out.printf("Int %d to Double: %.2f%n", intNum, doubleNum);

        // (Float -> Double)
        float floatNum = 3.14f;
        doubleNum = floatNum;
        System.out.printf("Float %.2f to Double: %.2f%n", floatNum, doubleNum);

        // (Char -> Int)
        char character = 'A';
        int asciiValue = character;
        System.out.printf("Char '%c' to Int: %d%n", character, asciiValue);
    }

    public static void explicitConversionExamples() {
        System.out.println("\n== Explicit Conversion Examples ==");

        //  (Double -> Int)
        double doubleNum = 9.99;
        int intNum = (int) doubleNum;
        System.out.printf("Double %.2f to Int: %d%n", doubleNum, intNum);

        //  (Int -> Char)
        int asciiValue = 65;
        char character = (char) asciiValue;
        System.out.printf("Int %d to Char: '%c'%n", asciiValue, character);

        //  (Long -> Short)
        long longNum = 100000;
        short shortNum = (short) longNum; // May cause data loss
        System.out.printf("Long %d to Short: %d%n", longNum, shortNum);

        //  (String -> Int)
        String strNum = "12345";
        intNum = Integer.parseInt(strNum);
        System.out.printf("String \"%s\" to Int: %d%n", strNum, intNum);

        //  (String -> Double)
        String strDouble = "3.14159";
        doubleNum = Double.parseDouble(strDouble);
        System.out.printf("String \"%s\" to Double: %.5f%n", strDouble, doubleNum);

        //  (String -> Boolean)
        String strBool = "true";
        boolean boolValue = Boolean.parseBoolean(strBool);
        System.out.printf("String \"%s\" to Boolean: %b%n", strBool, boolValue);

        //  (Int -> String)
        intNum = 789;
        String strConverted = Integer.toString(intNum);
        System.out.printf("Int %d to String: \"%s\"%n", intNum, strConverted);
    }
}