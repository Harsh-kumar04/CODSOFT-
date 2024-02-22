import java.util.Random;
import java.util.Scanner;

public class number_game {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int num = 0;

        int r;
        Scanner sc = new Scanner(System.in);

        Random number = new Random();

        int Randomnum = number.nextInt(max - min + 1) + min;
        System.out.println("Welcome to the number game....!");
        System.out.println(" ");
        System.out.println("Enter the rounds you want to play: ");
        r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            System.out.println("Enter number you guessed : ");
            num = sc.nextInt();

            if (Randomnum == num) {
                System.out.println(" ");
                System.out.println("Congrats....you guessed correct one!");
                System.out.println("you have guessed number in " + i + "th times.");
                break;
            } else if (Randomnum < num) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }

        }
        if (Randomnum != num) {
            System.out.println("You lost,Your max limit was " + r);
        }
    }
}
