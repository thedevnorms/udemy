package basics;

public class Loops {
    public Loops()
    {
        int i=0;
        while ( i<5) {
            System.out.println(i);
            i++;
        }
        //To Execute at least once
        do{
            System.out.println(i);
        }
        while (i<5);
    }
}
