public class Main {
    public static void main(String[] args) {
        String name = "Yesid";
        byte age = 20;
        int balance = 50000000;

        // format() method create a formatted string
        // The resulting string can be assigned to a variable;
        String formattedText = String.format("Your balance is %,d", balance);

        System.out.println(formattedText);

        //Text block (Java 12-13)
        System.out.println("""
               Hello %s, you have %d years old and your current balance is $%,d 
                """.formatted(name, age, balance));
        // The `formatted` method is a newer method introduced in Java 13 that provides the same functionality
        // as `format`, but returns a new formatted string directly, instead of requiring an explicit variable.
        // It can be used directly in method calls, making the code more concise.

        // Key format specifiers
        // %d, %f, %s %c, %b, %n...
        // %+d, %-d, %,d, %.2f...

        Casting.implicitConversionExamples();
        Casting.explicitConversionExamples();
    }
}