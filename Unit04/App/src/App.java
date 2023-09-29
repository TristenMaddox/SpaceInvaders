public class App {
    public static <CustomObject> void main(String[] args) {
        CustomObject obj1 = new CustomObject();

        CustomObject obj2 = new CustomObject();

        String myString = "How is it going?";
        String myOtherString = "How is it going?";

        System.out.println(myString == myOtherString);
        System.out.println(obj1 == obj2);


        String myString2 = "How is it going?";
        String myOtherString2 = new String("How is it going?");

        System.out.println(myString2.equals(myOtherString2));

        if(obj1 == obj2){
            System.out.println(myString2.equals(myOtherString2));
        }
    }
}