package strings;

public class Strings {
    public void stringsExamples(){

        String fPassw = "AxelGabber";

        // Check if the two variables point to the same object in memory.
        if (fPassw == "axelgabber") {
            System.out.println("First test passed");
        } else {
            System.out.println("First test failed");
        }

        String USER_DATA = "3AS2s471DYG8Q25J";

        // The equals() method is used when comparing the contents of Strings.
        if (fPassw.equals(USER_DATA)) {
            System.out.println("Second test passed");
        } else {
            System.out.println("Second test failed");
        }

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

        if (name.equals("Admin") || name.equals( "admin")) {
            System.out.printf("Incorrect user %n");
        } else if (age >= 18 && age <= 24) {
            System.out.printf("User allowed %n");
        }

        switch (name) {
            case "Axel":
                System.out.println("Welcome Axel");
                break;
            case "Yesid":
                System.out.println("Welcome Yesid");
                break;
            default:
                System.out.println("Staff only.");
        }
    }
}
