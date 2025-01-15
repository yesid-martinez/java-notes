/*import strings.Strings;
import casting.Casting;
import input.Inputs;
import challenges.guessinggame.GuessingGame;
import memory.Product;
import modifiers.AccessModifiers;
import arrays.arraylist.Lists;*/
import arrays.hashmaps.HashMaps;

public class Main {
    public static void main(String[] args) {
/*        Strings strEx = new Strings();
        strEx.stringsExamples();

        Casting casting = new Casting();
        casting.implicitConversionExamples();
        casting.explicitConversionExamples();

        Inputs inputs = new Inputs();
        inputs.scannerInputs();

        GuessingGame guessingGame = new GuessingGame();
        guessingGame.playGame();

        Product product = new Product();
        product.manageProduct();*/

        /* AccessModifiers.staticExamples();
        AccessModifiers.accessExamples(); */

        /* User user = new User("Yesid Martinez", 20, 3215844, 777777);
        String name = user.name; */
        // Error: 'name' is not public in 'modifiers.User'. Cannot be accessed from outside package

        // SubUser subUser = new SubUser("Axel Yesid", 33, 305811, 888888);
        // long id = subUser.id; // Error: 'id' has protected access in 'modifiers.User'
        // subUser.protectedAccess();

        // AccessModifiers.privateAccessExample();

        // Lists.arraysExamples();

        HashMaps.hashExamples();
    }
}