/*This challenge requires you to create a solution only based on the input and output to your function.

        The examples below show you how to write function accum:

        Examples:

        Input String	Output String
        "abcd"	"A-Bb-Ccc-Dddd"
        "RqaEzty"	"R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        "cwAt"	"C-Ww-Aaa-Tttt"
        The parameter of accum is a string which includes only letters from a..z and A..Z.*/

package src.programs.Assignments;

public class Accumul {

    public static void main(String[] args) {
        String str = "fDfGg";
        Accumul obj = new Accumul();
        String str2 = obj.accum(str);
        System.out.println(str2);

    }

    public static String accum(String s) {
        String out_string = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    out_string = out_string + Character.toString(Character.toUpperCase(s.charAt(i)));
                } else {
                    out_string = out_string + Character.toString(Character.toLowerCase(s.charAt(i)));
                }
            }
            if (i!=s.length()-1)
            out_string = out_string + "-";

        }
            return out_string;
        }
    }
