package basics;

interface Computer{
    void code();
}
class Desktop implements Computer{
    public void code() {
        System.out.println("Coding faster.");
    }
}
class Laptop implements Computer{
     public void code() {
         System.out.println("Coding Slower.");
    }
}
interface InterfaceA{
    int num =2; //By default this variable is public and static
    String name ="Mohsin"; //By default this variable is public and static

    public void show();
    public void config();
}
interface InterfaceB{
    void InterfaceBMethod();
}
interface InterfaceC extends InterfaceB{

}
class ClassInterfaceB implements InterfaceA,InterfaceC{
    public void show() {
        System.out.println("Its overrided show.");
    }
    public void config() {
        System.out.println("Its overrided config.");
    }
    public void InterfaceBMethod() {
        System.out.println("Its InterfaceBMethod");
    }
}
public class InterfaceAndClass {
    public InterfaceAndClass(){
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        laptop.code();
        desktop.code();
        //System.out.println(InterfaceA.name);
        //System.out.println(InterfaceA.num);
        InterfaceA interfaceA = new ClassInterfaceB();
        interfaceA.show();
        interfaceA.config();
    }
}
