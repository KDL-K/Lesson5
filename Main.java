public class Main {

    public static void main(String[] args) {
        Packing SuperStar=new Packing("Vegetable","Radish","Superstar","Producer1",15.5f);
        SuperStar.showPacking();
        Packing SuperStar2=new Packing(SuperStar,7.2f);
        SuperStar2.showPacking();
    }
}
