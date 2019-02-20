package src.programs.OOPConcepts;

public class WraperClassConcept {

    public static void main (String [] args)
    {
        String x = "100";
        System.out.println( x+20 );                 //10020

        //Data Conversion: String to Integer
        int i = Integer.parseInt( x );
        System.out.println( i+20 );                 // 120

        // Integer, Double, Character, Boolean Wrapper class

        //String to Double
        String y = "23.32";
        System.out.println( y+20 );                 //23.3220
        double d = Double.parseDouble( y );
        System.out.println( d+20 );                 //43.32

        //String to Boolean
        String k = "true";
        System.out.println( k );                    //true
        boolean b = Boolean.parseBoolean( k );
        System.out.println( b);                     //true

        //Int to String conversion
        int j = 200;
        System.out.println( j+20 );     //220
        String s = String.valueOf( j );
        System.out.println( s+20 );     //20020

        String u = "100A";
        int z = Integer.parseInt( u );      // It will through NumberFormatException as provided value is not integer value.
        System.out.println( z );


    }
}
