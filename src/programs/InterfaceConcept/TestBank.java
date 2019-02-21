package src.programs.InterfaceConcept;

public class TestBank {

    public static void main (String [] args)
    {
        //System.out.println( min_bal );
        System.out.println( USBank.min_bal );

        HSBCBank hs = new HSBCBank();
        hs.debit();
        hs.credit();
        hs.transfermoney();
        hs.educationloan();
        hs.carloan();

        //dynamic polymorphism:
        //child class object can be referred by parent interface referenced variable

        USBank b = new HSBCBank();

        b.credit();
        b.debit();
        b.transfermoney();

    }
}

