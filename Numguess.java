import java.util.Scanner;

public class Numguess {
    /*
     * conceptual module - game_engine is a function containing the overall logic of
     * the game
     */
    static void game_engine(int winning_number, Scanner sc) {
        int timeout = 0;
        while (true) {
            timeout++;
            if (timeout == 9) {
                System.out.println("sorry!!, no more attempt left");
                System.out.println("correct number is" + ":" + winning_number);
                break;
            }
            System.out.println("Enter your guess");
            int user_input = sc.nextInt();
            if (user_input < winning_number) {
                System.out.println("your number is too small");
            } else if (user_input > winning_number) {
                System.out.println("your number is too large");
            } else {
                System.out.println("woooh!! correct , your guess is adorable");
                break;
            }

            System.out.println("attempt :" + timeout + "/8");
        }
    }

    public static void main(String[] args) {
        //
        System.out.println("WELCOME TO OUR NUMBER GUESSING GAME !!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 to start");
        int start = sc.nextInt();

        if (start == 1) {
            int winning_number = (int) (Math.random() * 100 + 1);

            game_engine(winning_number, sc);

        } else
            System.out.println("Please Enter valid Input!!!");

    }
}
