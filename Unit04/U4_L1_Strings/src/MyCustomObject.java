public class MyCustomObject {

    private int number;

    public MyCustomObject(int i) {
        this.number = i;
    }

    @Override
    public boolean equals(MyCustomObject obj) {
        return this.number == obj.number;
    }
}
