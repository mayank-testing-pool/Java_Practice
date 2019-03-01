package src.programs.JavaBasics;

public class ThrowKeyword {
    // Use when throw an exception deliberately
    public static void main (String [] args) {
    //public static void main (String [] args) throws Exception {
        System.out.println( "ABC" );

        try {
            throw new Exception("My own Exception"  );
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println( "PQR" );


        /*throw new Exception("My own Exception"  );
        System.out.println( "PQR" );*/

        String exe_flag = "N";
        if (exe_flag.equals( "N" ))
        {
            try {
                throw new Exception("exe_flag is No"  );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println( "Test" );


    }
}
