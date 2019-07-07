public class Packing {
    private static int code=0;
    private final int width=80;// mm
    private final int height=150;// mm
    private String vegetableOrFlower;
    private String crop;//watermelon,vegetable marrow,carrot,etc.
    private String name;
    private String producer; // Producer1 or Producer2
    private float amount;//thousands

    public Packing(Packing obj,float amount){
        setVegetableOrFlower(obj.vegetableOrFlower);
        setCrop(obj.crop);
        setName(obj.name);
        setProducer(obj.producer);
        setAmount(amount);
        setCode();
    }
    public Packing(String vegetableOrFlower, String crop, String name, String producer, float amount){
        setVegetableOrFlower(vegetableOrFlower);
        setCrop(crop);
        setName(name);
        setProducer(producer);
        setAmount(amount);
        setCode();
    }

    private static void setCode(){
        code++;
    }
    public static int getCode(){
        return code;
    }

    public String getVegetableOrFlower() {
        return vegetableOrFlower;
    }

    public void setVegetableOrFlower(String vegetableOrFlower) {
        this.vegetableOrFlower = "";
        if(vegetableOrFlower.equals("Vegetable") || vegetableOrFlower.equals("vegetable")||vegetableOrFlower.equals("Vegetable seeds")) {
            this.vegetableOrFlower="Vegetable seeds";
        }
        if(vegetableOrFlower.equals("Flower") || vegetableOrFlower.equals("flower")||vegetableOrFlower.equals("Flower seeds")) {
            this.vegetableOrFlower="Flower seeds";
        }
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount=0;
        if(amount>0) {
            this.amount = amount;
        }
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public void showPacking(){
        System.out.println("\nThe package has width "+ getWidth()+" mm height "+getHeight()+" mm");
        System.out.println(getVegetableOrFlower());
        System.out.println(getCrop());
        System.out.println(getName());
        System.out.println("Code: "+getCode());
        System.out.println("Producer is "+getProducer());
        System.out.println("Amount to produce: "+getAmount()+" thousands");
    }

}
