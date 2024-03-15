package basics;

abstract class AbstractClassA {
    public abstract void drive();
    public void show(){
        System.out.println("In Show...");
    }
}
class AbstractClassB extends AbstractClassA{
    public void drive() {
        System.out.println("driving...");
    }
}
public class AbstractKeyword {
    public AbstractKeyword(){
        AbstractClassB abstractClassB = new AbstractClassB();
        abstractClassB.drive();
    }
}
