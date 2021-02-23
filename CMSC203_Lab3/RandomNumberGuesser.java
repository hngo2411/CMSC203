/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Build an application that will receive a guess and report if your guess is the random number that was generated.  Your application will narrow down the choices according to your previous guesses, and continue to prompt you to enter until you guess correctly.
 * Due: 02/23/2021
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Huynh Minh Quan Ngo
*/

import java.util.Scanner;
// driver class //
public class RandomNumberGuesser {
    public static Scanner scan;
    public static int randNum;
    public static int nextGuess, highGuess, lowGuess;
    public static RNG rang;
    public static void main(String[] args) {
        rang = new RNG();
        String play_decision = "yes";
        while ( play_decision.equals("yes")) {
        	gameInitialize();
        	gamePlay();
            System.out.println("Try again? (yes or no)");
            play_decision = scan.next();
            System.out.println("");
        }
        System.out.println("Thanks for playing...");
    }
    // initialize the game //
    public static void gameInitialize() {
        lowGuess = 1;
        highGuess = 100;
        randNum = RNG.rand();
        RNG.resetCount();
    }
    
    // play the game //
    public static void gamePlay() {
        scan = new Scanner(System.in);
        System.out.println("Enter your first guess");
        nextGuess = scan.nextInt();

        while(nextGuess != randNum) {
            if (!RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
                nextGuess = scan.nextInt();
                continue;
            }

            System.out.println("Number of guesses is "+RNG.getCount());
            if (nextGuess>randNum) {
                highGuess = nextGuess;
                System.out.println("Your guess is too high");
                
            } else {
                lowGuess = nextGuess;
                System.out.println("Your guess is too low");
            }
            System.out.println("Enter your next guess between "+ lowGuess + " and " + highGuess);
            nextGuess = scan.nextInt();
        }
        System.out.println("Number of guesses is "+(RNG.getCount()+1));
        System.out.println("Congratulations, you guessed correctly");
        // print programmer's name //
        System.out.println("Programmer: Huynh Minh Quan Ngo");
    }
}
