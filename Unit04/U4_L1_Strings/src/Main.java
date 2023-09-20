public class Main {
public static void main(String[] args){


    MyCustomObject obj1 = new MyCustomObject (2);
    MyCustomObject obj2 = new MyCustomObject (2);
    String myString = "Hi how are you";

    System.out.println(obj1 == obj2);

    int a1 = 3;
    int a2 = 3;
    System.out.println(a1 == a2);

    String myString2 = new String("Hi how are you");

    String myString3 = new String("Hi how are you");

    System.out.println(myString == myString3);

    myString = "Hi";
    System.out.println(myString3);

    System.out.println(myString.equals(myString2));
}
 }