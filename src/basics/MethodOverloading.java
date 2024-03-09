package basics;

public class MethodOverloading {
    int num = 5; // Variable inside a class at global level is instance variable.
    public int addNumbers(int a, int b)
    {
        return a+b;
    }
    public int addNumbers(int a, int b,int c)
    {
        return a+b+c;
    }
    public double addNumbers(double a, double b)
    {
        return a+b;
    }
}
