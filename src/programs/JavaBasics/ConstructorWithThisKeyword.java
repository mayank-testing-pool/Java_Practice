package src.programs.JavaBasics;

public class ConstructorWithThisKeyword {
    //this keyword is user to initialize to class variable with the current value of constructor if both variable are having same name.

    // Class variables
    static String name;
    static int age;

    public static void main (String [] args)
    {
        ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);
        name = "Peter";
        age= 25;
        System.out.println( name );
        System.out.println( age );

    }

    public ConstructorWithThisKeyword (String name,int age)
    {
        this.name = name;
        this.age = age;
        System.out.println( name );
        System.out.println( age );
    }
}
