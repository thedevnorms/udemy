package basics;
enum LaptopEnum{
    ThinkPad("A51", 2000),Macbook("X4",2500), HP("E350",1000),Dell("D800",600);
    private String model;
    private int price;
    LaptopEnum(String model, int price) {
        this.model = model;
        this.price = price;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumerationConcept {
    public EnumerationConcept(){
        for(LaptopEnum laptopEnum : LaptopEnum.values())
            System.out.println("Model: "+laptopEnum.getModel() + " Price: "+ laptopEnum.getPrice());
    }
}
