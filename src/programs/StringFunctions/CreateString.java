//String can be define as array of characters
// In Java string is an object thar represent the sequence of characters

package src.programs.StringFunctions;

public class CreateString {
    public static void main (String [] args)
    {
        //String can be create by below two methods
        // 1 - By String Literal. Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
        String str1 = "StringCreate";
        String str2 = "StringCreate"; //it doesn't create new instance

        //2 - By new Keyword
        //In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome"
        //will be placed in the string constant pool. The variable will refer to the object in a heap (non-pool).

        String str3 = new String("StringExample");
        char ch[]={'s','t','r','i','n','g','s'};
        String str4 = new String(ch);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        //In Java, String objects are immutable. Immutable simply means unmodifiable or unchangeable.
        //Once String object is created its data or state can't be changed but a new String object is created.
        String name = "Mayank";
        name.concat("Maheshwari"); //concat() method appends the string at the end
        System.out.println(name); //will print Mayank because strings are immutable objects
        name = name.concat(" Maheshwari");
        System.out.println(name); //will print Mayank Maheshwari as we explicitly assign it to the reference variable




    }
}
