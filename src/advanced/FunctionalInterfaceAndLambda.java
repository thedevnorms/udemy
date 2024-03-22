package advanced;

@FunctionalInterface
interface FunInterface{
    void show();
}

@FunctionalInterface
interface FunInterface1{
    void show2(int a);
}
@FunctionalInterface
interface FunInterface2{
    void show2(int a,int b);
}
@FunctionalInterface
interface FunInterface3{
    int show3(int a,int b);
}

public class FunctionalInterfaceAndLambda {

    public FunctionalInterfaceAndLambda() {
        FunInterface obj = new FunInterface() {
            @Override
            public void show() {
                System.out.println("Its show message");
            }
        };
        obj.show();
        // Lest replicate above using lambda expression.
        FunInterface obj1 = ()-> System.out.println("Obj 1 Show");
        obj1.show();

        FunInterface obj2 = ()-> {
            System.out.println("Obj 2 Show");
            System.out.println("Obj 2 Show statement 2.");
        };
        obj2.show();

        FunInterface1 obj3 = i-> System.out.println("The Value of I is:"+i);
        obj3.show2(10);

        FunInterface2 obj4 = (i,j)-> System.out.println("The sum is:"+i+j);
        obj4.show2(10,23);

        FunInterface3 obj5 = (i,j) ->  i+j;
        System.out.println(obj5.show3(10,20));
    }

}
