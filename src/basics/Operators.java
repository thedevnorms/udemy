package basics;

public class Operators {

    public Operators(){

        //Arithmetic
        int num1=10;
        //System.out.println(num1);
        int result = ++num1; // Pre increment, first increment then fetch the value
        System.out.println(result);

        int num2 = 10;
        int result1 = num2++; //post increment, first fetch the value then increment
        System.out.println(result1);

       //Relational (<,>, =, !=,<=, >=
        boolean result2 = num1>num2;
        System.out.println(result2);

        //Logical Operator && || !
        int num3=10;
        boolean result3 = num1>num2 && num2<num3;
        System.out.println(result3);

    }

}
