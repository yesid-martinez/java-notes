import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        /* The Scanner class is used to read input data
         This data can be read from various input sources: files, input streams, strings and user keyboard inputs...*/
        Scanner input = new Scanner(System.in);
        // Takes as its source the standard input stream of the system (Keyboard)

        System.out.printf("Ingrese el nombre de su película favorita: %n");
        String movie = input.nextLine();
        // nextLine(): Reads a complete line of text (until Enter is pressed).

        System.out.printf(movie + " movie is all we need on a dark night: %n");

        System.out.printf("Indíca cuántas veces la has visto: %n");

        int times;

        try {
            times = input.nextInt();

            if (times >= 3) {
                System.out.print("That's amazing, you'r a big fan dude!");
                // It is good practice to close the Scanner object when it is no longer needed to free up resources
            }

            if (0 < times && times < 3) {
                System.out.println("Okay, that's good!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, ingresa un número válido.");
        } finally {
            input.close();
        }

        /*next(): Reads the next token (a word or text separated by spaces)
        hasNext(), hasNextInt(), etc..: Checks if more input of a specific type is available*/

        MemoryManagement.memoryExample();
    }
}