import java.util.Scanner;

public class grade_calculator {

    public static void main(String[] args) {

        System.out.println("Enter your subjects marks");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fist subject marks out of 100 : ");
        int s1 = sc.nextInt();

        System.out.print("Enter second subject marks out of 100 : ");
        int s2 = sc.nextInt();

        System.out.print("Enter third subject marks out of 100 : ");
        int s3 = sc.nextInt();

        System.out.print("Enter fourth subject marks out of 100 : ");
        int s4 = sc.nextInt();

        System.out.print("Enter fifth subject marks out of 100 : ");
        int s5 = sc.nextInt();

        int Total = s1 + s2 + s3 + s4 + s5;

        if (s1 <= 100 && s2 <= 100 && s3 <= 100 && s4 <= 100 && s5 <= 100) {
            System.out.println("");
            System.out.println("first  subject mark - " + s1);
            System.out.println("second subject mark - " + s2);
            System.out.println("third  subject mark - " + s3);
            System.out.println("fourth subject mark - " + s4);
            System.out.println("fifth  subject mark - " + s5);
            System.out.println("   ");
            System.out.println("Total mark of all subjects : " + Total + "/500");

            int per = (s1 + s2 + s3 + s4 + s5) / 5;
            System.out.println("   ");

            System.out.println("Your percentage : " + per + "%");
            System.out.println("   ");

            if (per >= 80) {
                System.out.println("A+ Grade");
            } else if (per > 70) {
                System.out.println("A Garde");
            } else if (per > 50) {
                System.out.println("B+ Grade");
            } else {
                System.out.println("C Grade");
            }
            System.out.println(" ");

        } else {
            System.out.println("  ");
            System.out.println("Please enter correct marks(out of 100)");
        }

    }
}
