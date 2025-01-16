package challenges.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public void playGame() {
        int quant = 100;
        int rand = new Random().nextInt(quant);
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <= 4; i++) {
            System.out.println("Enter a number between 0 to " + quant);
            int choice = input.nextInt();
            if (choice == rand){
                System.out.println("You guessed correctly!");
                return;
            }
            if (choice > rand){
                System.out.println("Selected number is too high.");
            } else if (choice < rand){
                System.out.println("Selected number is too low.");
            }
        }
        System.out.println("The correct answer is " + rand);
        input.close();
    }
}
