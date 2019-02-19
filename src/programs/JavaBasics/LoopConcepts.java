package src.programs.JavaBasics;

/**
 * Created by maheshwari.mayank on 17-02-2019.
 */
public class LoopConcepts {

    public static void main (String [] args)
    {
        // pritn 1 to 10 numbers
        // 1. While Loop
        // disadvantage of while loop - it will generate infinite loop if incremental part is nto defined
        int i = 1;                          //Initialization
        while (i<=10)                       // Conditional part
        {
            System.out.println (i);
            i = i+1;                        // Incremental or Decremental Part
        }
        System.out.println ("---------");
        // 2. For Loop

        for (int j=1;j<=10;j++)     //j++ = j=j+1
        {
            System.out.println (j);
        }
        System.out.println ("---------");
        // print 10 to 1
        for (int k = 10;k>=1;k--)
        {
            System.out.println (k);
        }





    }

}
