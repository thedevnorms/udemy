package basics;


class EncapsulationChildClass
{

    private String name = "Mohsin";
    private int sal;
    private String desig = "SSA";

    public String getName() {
        return name;
    }

    public void setName(String name , int val) {
        if(val==1)
            this.name = name;
        else
            this.name = "Else "+name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal; // this keyword enforce to assign value to current object of class.
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }
}
public class MyEncapsulationClass {
    public MyEncapsulationClass(){
        EncapsulationChildClass encChild = new EncapsulationChildClass();
        System.out.println(encChild.getName());
        encChild.setName("Mohsin Shabbir", 2);
        System.out.println(encChild.getName());

        encChild.setSal(200);
        System.out.println(encChild.getSal());
    }


}


