public class Shedapp{
    public static void main(String[] args){
        Mower mower = new Mower(10, 15);

        ToolChest nChest = new ToolChest(2);

        Shelf eShelf = new Shelf(200);

        String mShelf ="Shelf";

        String mMower = "BedSize";

        String nMower ="BladeLength";

        String mChest = "Chest";

        nChest.setNumTools(3);

        mower.setBedSize(6);

        mower.setBladeLength(90);

        eShelf.setMaxWeight(160);

        System.out.println(mower.getBedSize());

        System.out.println(mMower);

        System.out.println(mower.getBladeLength());

        System.out.println(nMower);

        System.out.println(nChest.getNumTools());

        System.out.println(mChest);

        System.out.println(eShelf.getMaxWeight());

        System.out.println(mShelf);


    }

}