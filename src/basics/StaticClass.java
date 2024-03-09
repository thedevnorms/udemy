package basics;

class Mobile
{
    //First static block execute then constructor
    static String  name;
    String brandName;
    int price;

    public Mobile()
    {
        name = "MyPhone";
        brandName = "myApple";
        price = 0;
        System.out.println("Constructor");
    }

    static {
        name = "SmartPhone01";
        System.out.println("It will execute just once but constructure every time we create object.");
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }

    public void show()
    {
        System.out.println(toString());
    }

    public static void show1(Mobile mobile)
    {
        System.out.println("Mobile{" +
                "name='" + name + '\'' +
                ", brandName='" + mobile.brandName + '\'' +
                ", price=" + mobile.price +
                '}');
    }
}
public class StaticClass {

    public  StaticClass(){

        // to load class without constructor
        //Class.forName("basics.Mobile");
        Mobile mobile1= new  Mobile();
        mobile1.brandName = "Apple";
        mobile1.price = 2000;

        Mobile mobile2= new  Mobile();
        mobile2.brandName = "Android";
        mobile2.price = 1000;
        // Check power of static
        //Mobile.name = "SmartPhone";
        mobile1.show();
        mobile2.show();
        Mobile.show1(mobile2);

    }
}
