/*Implement a method that accepts 3 integer values a, b, c. The method should return true if a triangle can be
built with the sides of given length and false in any other case.
        (In this case, all triangles must have surface greater than 0 to be accepted).
        Examples
        a	b	c	Output	Comments
        1	2	2	true
        7	2	2	false	These sides can't form a triangle.
*/
package src.programs.Assignments;

public class isTriangle {

    public static void main (String [] args) {
     boolean flag;
        isTriangle obj = new isTriangle();
        //isTriangle obj2 = new isTriangle();
        //flag = obj.validateTriangle(1,2,2);
        flag = obj.validateTriangle(7,2,2);
     if (flag == true)
         System.out.println("These sides can form a triangle.");
     else
         System.out.println("These sides can't form a triangle.");

    }
    public boolean validateTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a)
            return true;
        else
            return false;
    }
}

