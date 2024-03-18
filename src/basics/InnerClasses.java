package basics;

class InnerClassA{

    public  void show(){
        System.out.println("InnerClass Show");
    }

    static class InnerClassB{
        public void show(){
            System.out.println("Inner class b");
        }
        public void config(){
            System.out.println("B Config.");
        }
    }
}
public class InnerClasses {
    public InnerClasses(){
        InnerClassA innerClassA = new InnerClassA();
        innerClassA.show();
        InnerClassA.InnerClassB innerClassB1 = new InnerClassA.InnerClassB();
        innerClassB1.show();
        /*In case the class in not static
        InnerClassA.InnerClassB innerClassB = innerClassA.new InnerClassB();
        innerClassB.config();
        innerClassB.show();*/
    }
}
