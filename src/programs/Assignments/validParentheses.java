/* Problem: Write a function, Valid Parantheses, that takes a string of parentheses, and determines if the order of
the parentheses is valid. This function should return true if the string is valid, and false if it's invalid. All
input strings will be nonempty, and will only consist of open parentheses "(" and/or closed parentheses ")".
 */

package src.programs.Assignments;

public class validParentheses {
    public static void main(String[] args) {
        String exp = "(()()()())";
        validParentheses obj = new validParentheses();
        boolean flag =obj.validateParentheses(exp);
        if (flag==true)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
   public boolean validateParentheses(String paran)
    {
        int opn_flag = 0;
        int cls_flag = 0;
        int emp_flag = 0;
        int inv_flag = 0;
        if (paran.length() == 0) {
            System.out.println("Empty String");
            emp_flag++;
        }
        else if (paran.length()%2 !=0)
        {
                //System.out.println("Not Balanced");
                return false;
        }
        else
        {
            for (int i=0;i<paran.length();i++)
            {
                if (paran.charAt(i)=='(') {
                    opn_flag ++;
                }
                else if (paran.charAt(i)==')')
                    cls_flag++;
                else
                    //System.out.println("Invalid String");
                    inv_flag++;
                    //cls_flag++;
            }
        }
        if (opn_flag==cls_flag && inv_flag ==0)
            return true;
            //System.out.println("Balanced");
        else if (opn_flag==cls_flag && inv_flag !=0)
            return false;
            //System.out.println("Not Balanced");
        else
            return false;

    }

}

