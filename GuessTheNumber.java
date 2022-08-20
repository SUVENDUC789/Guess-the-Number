// Create a class Game, which allows a user to play "Guess the Number" game once.

// Game should have the following methods:
// Constructor to generate the random number
// takeUserInput() to take a user input of number
// isCorrectNumber() to detect whether the number entered by the user is true
// getter and setter for noOfGuesses
// Use properties such as noOfGuesses(int), etc to get this task done!

import java.util.Random;
import java.util.Scanner;

class GenerateRandomNumber {
    private int num;
    private int userinput;
    private int guss=0;

    public GenerateRandomNumber(int num) {
        Random rand = new Random();
        this.num = rand.nextInt(num);
    }

    public void takeUserInput(int guss) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ["+guss+"] = ");
        userinput = sc.nextInt();
    }

    public void isCorrectNumber() {
        if (this.num == this.userinput) {
            System.out.println("Correct choice | No of Guesses are = "+guss);
            System.exit(0);
        } else if (this.num > this.userinput) {
            System.out.println("Input the " + this.userinput + " greater than the number");
        } else {
            System.out.println("Input the " + this.userinput + " less than the number");
        }
    }

    public void noOfGuesses() {
        ++this.guss ;
    }

}

public class GuessTheNumber {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int i=0;
        GenerateRandomNumber g = new GenerateRandomNumber(100);
        while (true) {
            g.noOfGuesses();
            g.takeUserInput(++i);
            g.isCorrectNumber();
        }
        // System.out.println(g.num);
    }
}