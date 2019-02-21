package src.programs.JavaBasics;

import java.util.Hashtable;

public class HashTableConcept
{
        public static void main (String [] args)
        {
            Hashtable h = new Hashtable(  );            // Will accept all types of values
            h.put( "A","This" );
            h.put( "B","Hello" );
            h.put( "C","World" );

            System.out.println( h.size() );

            h.put( 1,100 );
            h.put( 2,200 );

            System.out.println( h.size() );

            System.out.println( h.get( 2 ) );
            System.out.println( h.get( "C" ) );
            System.out.println( h.get( 1 ) );
            System.out.println( h.get( "A" ) );

            h.put( 3,"Tom" );

            Hashtable <Integer,Integer> h1 = new Hashtable <Integer,Integer>(  );            // Will accept only integer key and integer values
            h1.put(1,100);
            //h1.put( 1,"Hi" );               // Not allowed

            Hashtable <Integer,String> h2 = new Hashtable <Integer,String>(  );            // Will accept only integer key and String values
            h2.put( 1,"Hi" );
            h2.put( 2,"This" );
            h2.put( 3,"Hash" );
            h2.put( 4,"Table" );

        }

}
