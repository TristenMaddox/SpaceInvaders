public class App {
    String myString1 = "Hello World;";
    String myString2 = "HELLO WORLD";

    String myString3 = "                          Hello World";

    System.out.println(myString.length());
    char myChar = myString.charAt(7);
    System.out.println(myChar);
    int index = myString.index(7);
    System.out.println(index);
    System.out.println(myString.substring(4));
    System.out.println(myString.toLowerCase());
    System.out.println(myString.toUpperCase());
    System.out.println(myString.equals(myString2));
    System.out.println(myString.equalsIgnoreCase(myString));
    System.out.println(myString.startsWith("He"));
    System.out.println(myString.replace( "lo", "l"));
    System.out.println(myString.contain("Hell"));
    System.out.println(myString3.trim());
    System.out.println("\u0007");

}
