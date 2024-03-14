package basics;

final class AAA1{
    public  void show(){
        System.out.println("My AAA show by Mohsin");
    }
}
class AAA{
    public final void show(){
        System.out.println("My AAA show by Mohsin");
    }
    public void add(int a , int b){
        System.out.println(a+b);
    }
}
class BBB extends AAA{
    /*public void show(){
        System.out.println("Cannot override parent method.");
    }*/
    public  void sub(int a, int b){
        System.out.println(a-b);
    }
}
public class FinalKeyword {
    public FinalKeyword(){
        final int num = 10;
        BBB bbb = new BBB();
        bbb.sub(20,10);
    }
}
