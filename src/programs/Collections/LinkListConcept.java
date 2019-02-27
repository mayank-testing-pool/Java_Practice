package src.programs.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {

    public static void main (String [] args)
    {
        LinkedList<String> ll = new LinkedList<String>(  );

        //Add

        ll.add( "Testing" );
        ll.add( "Java" );
        ll.add( "QTP" );
        ll.add( "Selenium" );
        ll.add( "Jmeter" );
        ll.add( "ALM" );

        System.out.println( "Content of linkedlist: "+ll );
        System.out.println( "******************************" );
        //addfirst
        ll.addFirst( "Manual" );
        System.out.println( "Content of linkedlist: "+ll );
        System.out.println( "******************************" );
        //addlast
        ll.addLast( "Automation" );
        System.out.println( "Content of linkedlist: "+ll );
        System.out.println( "******************************" );

        //get
        System.out.println(ll.get( 0 ) );
        System.out.println( ll.getFirst() );
        System.out.println( ll.getLast() );
        System.out.println( "********************************" );

        //set
        ll.set( 0,"Tom" );

        System.out.println( ll.get( 0 ) );
        System.out.println( "********************************" );

        // Remove first and Last
        ll.removeFirst();
        ll.removeLast();
        System.out.println( "Content of linkedlist: "+ll );
        System.out.println( "********************************" );

        ll.remove( 2 );
        System.out.println(  "Content of linkedlist: "+ll );
        System.out.println( "********************************" );

        //How to print all values of linkedlist

        //For Loop
        System.out.println( "Using for loop " );
        for (int i = 0;i<ll.size();i++)
        {
            System.out.println( "Content of linkedlist: "+ll.get( i ) );
        }
        //advance for loop
        System.out.println( "********************************" );
        System.out.println( "Advance for loop " );
        for ( String str :ll)
        {
            System.out.println( "Content of linkedlist: "+str );
        }

        //iterator
        System.out.println( "********************************" );
        System.out.println( "Using Iterator " );
        Iterator<String> it = ll.iterator();
        while (it.hasNext())
        {
            System.out.println( it.next() );
        }


        //while loop
        System.out.println( "********************************" );
        System.out.println( "Using while loop " );
        int num = 0;
        while (ll.size()>num)
        {
            System.out.println( "Content of linkedlist: "+ll.get( num ) );
            num ++;
        }

    }
}
