package src.programs.JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main (String [] args)
    {
        ArrayList ar = new ArrayList(  );
        ar.add( 100 );      // Index = 0
        ar.add( 200 );      //1
        ar.add( 300 );      //2

        System.out.println( ar.size() );

        ar.add( 400 );      //3
        ar.add( 500 );      //4

        System.out.println( ar.size() );

        ar.add( "Tom" );    //5
        ar.add( "Hello" );  //6
        ar.add( 12.33 );    //7
        ar.add( 'M' );      //8
        ar.add( 600 );      //9

        System.out.println( ar.size() );
        ar.remove( 9 );

        System.out.println( ar.size() );

        System.out.println( ar.get( 4 )) ;
        //System.out.println( ar.get( 9 )) ;          //IndexOutOfBoundsException

        for (int i = 0;i<ar.size();i++)
        {
            System.out.println( "Value at position " +i +" is " +ar.get( i ));
        }

        ArrayList <Integer> ar1 = new ArrayList<Integer>(  );       // Accept only integer values

        ar1.add( 100 );
        //ar1.add( "Hi" );          // Through Error
        System.out.println( ar1.get( 0 )) ;


        ArrayList <String> ar2 = new ArrayList<String>(  );         // Accept only String Values
        ar2.add( "HI" );
        ar2.add( "This" );
        ar2.add( "is" );
        ar2.add( "Java" );
        //ar2.add( 100 );             // Through Error

        System.out.println( ar2.get( 0 )) ;
        System.out.println( ar2.get( 1 )) ;

    }

}
