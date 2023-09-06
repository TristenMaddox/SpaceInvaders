import java.util.Scanner;

public class Politictsapp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age > 35) {
            System.out.println("Congratulations you can run for congress or the senate");
        } else if (age < 25) {
            System.out.println("Congratulations.  You can run for Congress");
        } else (age > 25) {
            System.out.println("Sorry you can not run for political office.");
        }

    }
}