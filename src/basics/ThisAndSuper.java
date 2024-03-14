package basics;

class A{
    public int add(int a, int b){
        return a+b;
    }
    public A()
    {
        System.out.println("In A Class default constructor");
    }
    public A(String str){
        System.out.println("In A class parametrized constructor " + str);
    }
}
class B extends A{
    public B()
    {
        System.out.println("In B Class default constructor");
    }
    public  int add(int a, int b){
        return a+b*2;
    }
    public B(String str){
        this();
        System.out.println("In B class parametrized constructor " + str);
    }
}
public class ThisAndSuper {

    public ThisAndSuper(){
        B b = new B("Its B ");
        System.out.println(b.add(10,10));
    }
}
