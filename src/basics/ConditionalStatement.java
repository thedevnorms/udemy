package basics;

public class ConditionalStatement {
    //Its all about if else
    public ConditionalStatement()
    {
        int num = 10;
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);

        String num2 = "Mon";

        switch (num2)
        {
            case "Mon":
                   System.out.println("Monday");
                   break;
            case "Tue":
                System.out.println("Tuesday");
                break;
            case "Wed":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Default Case.");
        }
    }
}
