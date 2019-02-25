package src.programs.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static  void main (String [] args)
    {
        int a[] = new int [4];          //Static Array - Size is fixed.

        // Dynamic Array - Array List
        //1. can contain duplicate values
        //2. maintain insertion order
        //3. Synchronized
        //4. Allows you random access to fetch any element coz it store the values on the basis if indexes


        ArrayList ar = new ArrayList(  );       //Non Generic arrayList
        ar.add( 10 );
        ar.add( 20 );
        ar.add( 30 );

        System.out.println( ar.size() );
        ar.add( 40 );
        ar.add( 50 );
        ar.add( 50 );

        System.out.println( ar.size() );

        System.out.println( ar.get( 4 ) );

        //Print all the values of ArrayList
        //1 - Using for loop
        //2 - Using Iterator

        for (int i = 0;i<ar.size();i++)
        {
            System.out.println( "Value at position " +i +" is " +ar.get( i ));
        }

        //Non Generic vs Generic

        ArrayList <Integer> ar1 = new ArrayList<Integer>(  );       // Generic ArrayList - Accept only integer values

        ar1.add( 100 );
        //ar1.add( "Hi" );          // Through Error
        System.out.println( ar1.get( 0 )) ;

        ArrayList <String> ar2 = new ArrayList<String>(  );         // Accept only String Values
        ar2.add( "HI" );
        ar2.add( "This" );
        ar2.add( "is" );
        ar2.add( "Java" );
        //ar2.add( 100 );             // Through Error

        //Employee class object

        Employee e1 = new Employee( "Mayank",28, "QA" );
        Employee e2 = new Employee( "Tom",27, "Dev" );
        Employee e3 = new Employee( "Peter",29, "Admin" );

        //Create AyyayList
        ArrayList <Employee> ar4 = new ArrayList <Employee> (  );
        ar4.add( e1 );
        ar4.add( e2 );
        ar4.add( e3 );

        // Iterator to get the values
        Iterator<Employee> it = ar4.iterator();
        while (it.hasNext())
        {
            Employee emp = it.next();
            System.out.println( emp.name );
            System.out.println( emp.age );
            System.out.println( emp.dept );
        }

        //****************************************
        System.out.println("******************************" );

        //addall ()     // Merge two arraylist
        ArrayList <String> ar5 = new ArrayList<String>(  );
        ar5.add( "Test" );
        ar5.add( "Selenium" );
        ar5.add( "Qtp" );

        ArrayList <String> ar6 = new ArrayList<String>(  );
        ar6.add( "Dev" );
        ar6.add( "Java" );
        ar6.add( "JavaScript" );

        ar5.addAll( ar6 );

        for (int i = 0;i<ar5.size();i++)
        {
            System.out.println( "Value at position " +i +" is " +ar5.get( i ));
        }

        System.out.println("******************************" );
        //removeall() - Remove values

        ar.removeAll( ar6 );

        for (int i = 0;i<ar5.size();i++)
        {
            System.out.println( "Value at position " +i +" is " +ar5.get( i ));
        }

        System.out.println("******************************" );
        //Retainall () - will return common values

        ArrayList <String> ar7 = new ArrayList<String>(  );
        ar7.add( "Test" );
        ar7.add( "Selenium" );
        ar7.add( "Qtp" );

        ArrayList <String> ar8 = new ArrayList<String>(  );
        ar8.add( "Test" );
        ar8.add( "Java" );

        ar7.retainAll( ar8 );

        for (int i = 0;i<ar5.size();i++)
        {
            System.out.println( "Value at position " +i +" is " +ar7.get( i ));
        }




    }
}
