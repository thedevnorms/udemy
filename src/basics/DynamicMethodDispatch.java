package basics;

class AA
{
    public  void  show(){
        System.out.println("Show method A");
    }
}
class BB extends  AA{
    public void show(){
        System.out.println("Show B");
    }
}
class CC extends AA{
    public void show(){
        System.out.println("Show C");
    }
}
public class DynamicMethodDispatch {
    public DynamicMethodDispatch(){
        AA aa = new AA();
        aa.show();
        aa = new BB();
        aa.show();
        aa = new CC();
        aa.show();

    }
}
