package basics;

public class Arrays {

    public  Arrays()
    {
        //When you already know the values
        int arr1[] = {2,3,4,5};
        System.out.println(arr1[1]);
        // to assign value to any specific index
        arr1[0] = 50;
        System.out.println(arr1[0]);
        //If you don't know the values but know the exact number to values i.e. array size
        int arr2[] = new int[3];
        arr2[0]=10;
        arr2[1]=20;
        arr2[2]=30;
        for(int i=0; i<=2; i++)
            System.out.println(arr2[i]);

        System.out.println("//////Multi-Dimensional Array");
        //2 dimensional array

        int arr3[][] = new int[5][5];
        // Lets assign values dynamically to arrays.
        for(int i=0; i<5; i++)
        {
            for (int j=0; j<=i; j++)
                arr3[i][j] = i+j;
        }

        /*for(int i=0; i<5; i++)
        {
            for (int j=0; j<=i; j++)
                System.out.println("*");
        }*/
        //Enhanced for loop
        for(int n[]:arr3)
        {
            for(int m:n) {
                System.out.println(m);
            }
            System.out.println();
        }
        System.out.println("//////////Jagged Arrays//////////////");
        int arr4 [][] = new int[3][];
        arr4[0] = new int[2];
        arr4[1] = new int[3];
        arr4[2] = new int[5];
        for(int i=0; i<arr4.length; i++)
        {
            for (int j=0; j<arr4[i].length; j++)
                arr4[i][j] = i+(int)Math.random()+100;
        }

        for(int arr[]:arr4)
        {
            for (int n:arr)
                System.out.print(" "+n);
            System.out.println(" ");
        }




/*

        int n = 10; // Number of rows for the diamond (you can change this value for a larger or smaller diamond)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }




        for(int i=0; i<10; i++)
        {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=10; i>=0; i--)
        {
            for (int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }*/
    }
}
