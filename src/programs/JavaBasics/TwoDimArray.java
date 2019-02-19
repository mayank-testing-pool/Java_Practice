package src.programs.JavaBasics;

/**
 * Created by maheshwari.mayank on 17-02-2019.
 */
public class TwoDimArray {

    public static void main (String []args)
    {
       String x[][]=new String[3][5];
       System.out.println(x.length);        //Will give total no of rows
       System.out.println(x[0].length);     // will give total no of columns

       // 1st Row
       x[0][0]="A[0][0]";
       x[0][1]="B[0][1]";
       x[0][2]="C[0][2]";
       x[0][3]="D[0][3]";
       x[0][4]="E[0][4]";

       //2nd Row
       x[1][0]="A[1][1]";
       x[1][1]="B[1][2]";
       x[1][2]="C[1][3]";
       x[1][3]="D[1][4]";
       x[1][4]="E[1][5]";

       //3rd Row
       x[2][0]="A[2][1]";
       x[2][1]="B[2][2]";
       x[2][2]="C[2][3]";
       x[2][3]="D[2][4]";
       x[2][4]="E[2][5]";

       System.out.println(x[0][2]);
       System.out.println(x[1][1]);
       System.out.println(x[2][4]);

       //print all the values of 2D Array

        for (int row =0;row<x.length;row++)
        {
            for (int col = 0;col<x[0].length;col++)
            {
                System.out.println(x[row][col]);
            }
            System.out.println("************");
        }

    }
}
