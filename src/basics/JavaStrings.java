package basics;

public class JavaStrings {

    public JavaStrings(){
        String myString = new String("Mohsin"); // which is equivalent to String myString = "Mohsin";
        System.out.println(myString);
        System.out.println(myString.charAt(1)); //As string is in fact array of characters.

        System.out.println("**********String buffer***********");
        StringBuffer sb = new StringBuffer("Mohsin");
        System.out.println(sb.lastIndexOf("n"));
        System.out.println(sb.append(" Shabbir")); // there are many more methods.
    }

}
