package src.programs.JavaBasics;

public class FinalizeConcept {
    //Finalize keyword is user to clean up the memory
    //finalize is a method
    public void finalize() {

        System.out.println( "This is finalize method" );
    }

    public static void main (String [] args) {
        FinalizeConcept f1 = new FinalizeConcept();
        FinalizeConcept f2 = new FinalizeConcept();

        f1=null;
        f2=null;

        System.gc();

    }




}
