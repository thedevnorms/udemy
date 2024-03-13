import basics.*;

import java.rmi.ConnectIOException;

public class Main {
    public static void main(String[] args) {
        //VariablesCastingPromotion variablesCastingPromotion = new VariablesCastingPromotion();
        //Operators operators = new Operators();
        //ConditionalStatement conditionalStatement = new ConditionalStatement();
        //Loops loops = new Loops();
D
        //MethodOverloading methodOverloading = new MethodOverloading();
        //System.out.println(methodOverloading.addNumbers(2,3));
        //System.out.println(methodOverloading.addNumbers(2,3,4));
        //Arrays arrays = new Arrays();
        // Strings Mutable vs Immutable.
       /* String str = new String("Hello"); //Its equivalent to String str = "Hello";
        System.out.println(str.charAt(1)+str.concat(" Mohsin"));
        main(null,"Main Static Method is Overrided");*/
        //JavaStrings javaStrings = new JavaStrings();
        //StaticClass staticClass = new StaticClass();
        MyEncapsulationClass myEncapsulationClass = new MyEncapsulationClass();
        MethodOverloading methodOverloading = new MethodOverloading();
      // System.out.println(methodOverloading.addNumbers(2,3));
       // System.out.println(methodOverloading.addNumbers(2,3,4));
        Arrays arrays = new Arrays();
        //main(null,"abc");
    }

    public static  void main(String[] args , String abc)
    {
        System.out.println(abc);
        System.out.println("helllo");
    }
}