package basics;

class AnonymousA{
    public void showMe(){
        System.out.println("Anonymous Show A");
    }
}
///Object of Abstract Class

abstract class AnonymousAA{
    public abstract void show();
}

public class AnonymousClass {
    public AnonymousClass(){
        AnonymousA anonymousA = new AnonymousA(){
            @Override
            public void showMe() {
                System.out.println("I am overriding the parent method here.");
                System.out.println("Write code as long you want");
            }
            public void showMe1(){
                System.out.println("Anonymous ShowMe1, this method can be created as anonymous class write only for overide method just once.");
            }
        };
        anonymousA.showMe();
        AnonymousAA anonymousAA = new AnonymousAA() {
            @Override
            public void show() {
                System.out.println("Anonymous Abstract class method.");
            }
        };
        anonymousAA.show();

    }
}
