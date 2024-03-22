package basics;

class AA
{
    public  void  show(){
        System.out.println("Show method A");
    }

    public void showAA(){
        System.out.println("Show AA Parent");
    }
}
class BB extends  AA{
    public void show(){
        System.out.println("Show B");
    }
    public void showBB(){
        System.out.println("Its ShowBB Child Class");
    }
}
class CC extends AA{
    public void show(){
        System.out.println("Show C");
    }
}
public class DynamicMethodDispatch {
    public DynamicMethodDispatch(){
        //Upcasting
        AA aaCasting = new BB();
        aaCasting.show();
        //Down casting
        BB subClassObj = (BB) aaCasting;
        subClassObj.showAA();

        /*AA aa = new AA();
        aa.show();
        aa = new BB();
        aa.show();
        aa = new CC();
        aa.show();*/

    }
}
