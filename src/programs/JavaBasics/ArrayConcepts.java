package src.programs.JavaBasics;

/**
 * Created by maheshwari.mayank on 17-02-2019.
 */
public class ArrayConcepts {
// An Array is collection of variables having similar datatypes
    public static void main (String [] args)
    {

        // lowest index/bound = 0;
        // higher index/bound = size of array -1

        //One Dimensional or 1D array
        //Disadvantages of array
        // 1. Size is fixed - Static Array - to overcome this problem we use collections - ArrayList, HashTable
        //                  - use dynamic array
        // 2. Storing Similar datatypes - to overcome this problem, we use Object Array

        // 1.int Array;
        int i[] = new int [4];
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;

        System.out.println(i[2]);
        System.out.println(i[3]);

        //System.out.println(i[4]);       //ArrayIndexOutOfBoundException
        System.out.println(i.length);       // print size of array

        // Print all the values of array

        for (int a=0;a<i.length;a++)
        {
            System.out.println(i[a]);
        }

        // 2.double array

        double j[]=new double [4];
        j[0]=0.11;
        j[1]=11.11;
        j[2]=22.22;
        j[3]=33.33;

        for (int b=0;b<j.length;b++)
        {
            System.out.println(j[b]);
        }

        // 3.char array

        char k[] = new char [4];
        k[0]='a';
        k[1]='b';
        k[2]='c';
        k[3]='d';

        for (int c=0;c<k.length;c++)
        {
            System.out.println(k[c]);
        }

        // 4.boolen array
        boolean l[]= new boolean[2];
        l[0]=true;
        l[1]= false;

        for (int d=0;d<l.length;d++)
        {
            System.out.println(l[d]);
        }

        // 5.String Array

        String m[]=new String[4];
        m[0]="this";
        m[1]="is";
        m[2]="string";
        m[3]="array";
        System.out.println(m.length);
        System.out.println(m[2]);
        for (int e=0;e<m.length;e++)
        {
            System.out.println(m[e]);
        }

        // 6.Object Array (Object is a class) -- use to store different types of data types

        Object n [] =new Object[6];
        n[0]="Tom";
        n[1]=25;
        n[2]=122.45;
        n[3]="1/1/1990";
        n[4]='M';
        n[5]="London";

        for (int f=0;f<n.length;f++)
        {
            System.out.println(n[f]);
        }
    }
}
