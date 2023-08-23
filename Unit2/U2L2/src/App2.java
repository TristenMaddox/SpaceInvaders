import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     System.out.print("Enter your height: ");
        int feet = input.nextInt();
        int feetInches = feet * 12;

        Scanner newinput = new Scanner(System.in);
        System.out.println("Enter remaining height in inches: ");
        int inches = newinput.nextInt();

        int totalInches = feetInches + inches;

        double meters = totalInches * 0.0254;

        int  height = totalInches + feet;
        System.out.print("Ya Height is: ");
        System.out.print(totalInches);
        System.out.print(" inches");

    }

}