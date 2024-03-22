package advanced;

public class ExceptionHandlingClass {

    public ExceptionHandlingClass() {
        int i = 0;
        int j = 0;
        int nums[] = new int[5];
        try {
            int res1 = 18/i; //
            int res2 = nums[5];
        } catch(ArithmeticException e) {
            System.out.println("The Arithmatic Exception is: "+e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The out of index Exception is: "+e);
        }
        catch (Exception e)
        {
            System.out.println("Generic Exception: "+e);
        }
    }
}
