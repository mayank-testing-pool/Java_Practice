/* Find second highest number in as Integer array*/
package src.programs.Assignments;

public class findSecondHighestNubInArray {

    public static void main (String [] args)
    {
        //int intArray[] = new int[10];
        int intArray[] = {10,45,87,95,26,74,36,46,56,63};
        int first,second;
        first = 0;
        second = 0;
        for (int i = 0;i<intArray.length;i++)
        {
                if (first < intArray[i] )
            {
                second = first;
                first = intArray[i];
            }
            else if (second < intArray[i] )
            {
                second = intArray[i];
            }
        }

        System.out.println ("Highest number = "+first);
        System.out.println ("Second Highest number = "+second);

    }

}
