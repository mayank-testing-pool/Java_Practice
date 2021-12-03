package src.programs.Collections.List;
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

        System.out.println("Size of Array list = "+ ar.size() );

        System.out.println("Get the element of 4 position = "+ ar.get( 4 ) );

        //Print all the values of ArrayList
        //1 - Using for loop
        //2 - Using Iterator

        System.out.println("Printing all values of Array List using for loop" );
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

        //Create ArrayList
        ArrayList <Employee> ar4 = new ArrayList <Employee> (  );
        ar4.add( e1 );
        ar4.add( e2 );
        ar4.add( e3 );

        // Iterator to get the values
        System.out.println("Printing all values of ArrayList using for Iterator" );
        Iterator<Employee> it = ar4.iterator();
        while (it.hasNext())
        {
            Employee emp = it.next();
            System.out.println( emp.name );
            System.out.println( emp.age );
            System.out.println( emp.dept );
        }

        System.out.println("******************************" );
        System.out.println("Merge two arraylist using addAll() method" );
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
        System.out.println("arraylist after merging another list" );
        for (int i = 0;i<ar5.size();i++)
        {
            System.out.println( "Value at position " +i +" is " +ar5.get( i ));
        }
        ar5.addAll(2,ar2);
        System.out.println("Array list after merging another list on a specific index" );
        for (int i = 0;i<ar5.size();i++)
        {
            System.out.println( "Value at position " +i +" is " +ar5.get( i ));
        }
        System.out.println("******************************" );
        //removeall() - Remove values

        ar.removeAll( ar6 );
        System.out.println("Array list after removing list frm existing list using removeAll () method" );
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
        System.out.println("Common values into two Arraylist using retailAll() method" );
        for (int i = 0;i<ar7.size();i++)
        {
            System.out.println( "Common Values into two arrayList is at position " +i +" and value is " +ar7.get( i ));
        }
        System.out.println("******************************" );
        //Clear()   WIll clear all the content of arraylist
        ar8.clear();
        System.out.println("Arraylist after clear method"+ar8);
        System.out.println("******************************" );
        //clone()     clone an arryalist into another arrraylist

        ArrayList <String> clonelist = (ArrayList<String>)ar6.clone();
        System.out.println("Clone ArrayList " +clonelist +" of arraylist "+ ar6);

        System.out.println("******************************" );
        //contains()            Return Boolean if value is present in arraylist
        System.out.println("Value Mayank is present in arraylist ar1 "+ar1.contains("Mayank"));
        System.out.println("Value Java is present in arraylist a61 "+ar6.contains("Java"));
        System.out.println("******************************" );
        // indexof ()           // Use to find index of any element in arraylist
        System.out.println("Index of Java in arraylist ar6 is "+ar6.indexOf("Java"));
        ar6.add("C#");
        ar6.add("Dev");
        ar6.add("Java");
        ar6.add("Python");
        ar6.add("Java");
        System.out.println(ar6);
        System.out.println("last index of Java in ar6 is "+ ar6.lastIndexOf("Java"));
        System.out.println("******************************" );
        //remove()      Remove any specific or duplicate elements from arraylist
        System.out.println("arraylist before removing a element "+ar6);
        ar6.remove(7);
        System.out.println("arraylist after removing a element using index "+ar6);
        ar6.remove("Java");
        System.out.println("arraylist before removing a element using value "+ar6);



   }
}
