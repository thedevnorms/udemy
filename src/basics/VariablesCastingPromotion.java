package basics;

public class VariablesCastingPromotion {

    public VariablesCastingPromotion()
    {
        //Variables and String Literals
        byte b = -127;
        int i = 10_000_000; //Int literal
        double ii = 1e2; // double literal
        short s = 4455;
        long l = 8999999999000000000L;
        double d = 999999999+999999999;
        float f = 99999999999999999999999999999999999999.3333f;
        char c = 'S';
        c++; // char literal as char can be treated as integer.
        boolean bb = true;
        //Conversion and Casting/Implicit/Explicit
        byte bVar = 127;
        int iVar = 456;
        iVar=bVar; //Its Conversion as smaller value assigned to bigger one and value is within range.

        byte bVar1 = 127;
        int iVar1 = 257;
        bVar1 = (byte) iVar1; //Its casting as the bigger variable is assigned to smaller one as the bigger variable’s value was in range of smaller variable.

        //Type Promotion
        byte bVar2 = 10;
        byte bVar3 = 20;
        int result = bVar2*bVar3;; //as the result is 300 which is bigger than byte so we can store value in int and this concept is called Type Promotion.

        System.out.println("Implicit Conversion "+bVar1);
    }
}
