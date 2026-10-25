import java.util.Random;
import java.util.Scanner;

public class Guess {

    private int NoOftrys = 0;

    public Guess(int NoOftrys) {

        this.NoOftrys = NoOftrys;
//        this.guessedNo = guessedNo;
    }

    public void startGame() {
// generating a random number from 1 -100;
        Random random = new Random();
        int rndom = random.nextInt(1, 100);
        System.out.println("choose a number btw 1- 100 ");//-> asking questions
        Scanner sc = new Scanner(System.in);  // initaiting the scanner
        // number of iteration known using forloop
        for (int done = 0; done <= NoOftrys; done++) {
            int count = NoOftrys - done;
            System.out.println("you have " + count + " left");
            System.out.println(rndom);
//            --- un comment for the random number
            // putting in the try and catch error just incase the user inputs a string
            try {
                int input = sc.nextInt();
                if (checkGuess(input, rndom, done, NoOftrys)) {
                    done = NoOftrys;
                }
            } catch (Exception e) {
                System.out.println("Input mismatch  \n try again");
            }
        }
        sc.close();
        System.out.println("Thanks for playing bye !");
    }

    /// creating a logic to check the guessed answer
    private Boolean checkGuess(int input, int random, int done, int NoOftrys) {

        if (input == random) {
            System.out.println("You guessed it!");
            return true;
        } else if (input > random | input < random) {
            if (input > random) {
                System.out.println(input + " too high  \n try again");
            }
            if (input < random) {
                System.out.println("input too low \n try again");
            }
            return false;
        } else {
            System.out.println("Wrong input!");
        }
        return false;
    }
}