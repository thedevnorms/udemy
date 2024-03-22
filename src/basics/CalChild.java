package basics;

public class CalChild extends  CalParent{
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }


    public void sameName(String param1,String param2){
        System.out.println("I am cal parent");
    }
}
