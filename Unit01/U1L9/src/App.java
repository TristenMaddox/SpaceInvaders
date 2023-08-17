public class App {

    private static int number = 3;

    private static double aDouble = 6;

    public static void main(String[] args) {
        int c = 5;
        System.out.println(c);
        System.out.println(number);
        System.out.println(aDouble);

        if(true){ //do not need if statement
            int d = c = 6;
        }

        System.out.println(d);
    }
}
