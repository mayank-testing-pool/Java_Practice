package src.programs.OOPConcepts;

/**
 * Created by maheshwari.mayank on 19-02-2019.
 */
public class FunctionsInJava {

    public static void main (String [] args) {
        FunctionsInJava ob1 = new FunctionsInJava ();
        // one object will be created and obj is the reference variable, referring to this object
        // after creating the object, the copy of all non static method will be given to this object
        ob1.test();
        int x = ob1.pqr();
        System.out.println(x);
        String str = ob1.qa();
        System.out.println(str);
        int y = ob1.division(40,20);
        System.out.println(y);

    }
        //Non static methods
        // void - does not return anything
        public void test()  // No input No output
        {
            System.out.println("Test Method");
        }

        // return integer value
        public int pqr () // No input but some output
        {
            System.out.println("PQR Methods");
            int a = 10;
            int b = 20;
            int c = 30;
            return c;
        }

        public String qa()  //No input but same output
        {
            System.out.println("QA Method");
            String s = "Selenium";
            return s;
        }

        public int division (int x, int y)
        {
            System.out.println("Division Method");
            int d = x/y;
            return d;
        }

    }
