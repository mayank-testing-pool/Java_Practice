package src.programs.InterfaceConcept;

public class HSBCBank implements USBank, BrazilBank {       // We are achieving multiple inheritance.
    // "Is-a" relationship
    // If a class is implementing any interface, then its compulsory to define/override all the methods of interface.

    // Overridden from USBank interface
    public void credit() {
        System.out.println( "HSBC --- Credit" );
    }

    public void debit() {

        System.out.println( "HSBC --- Debit" );

    }

    public void transfermoney() {

        System.out.println( "HSBC --- Transfermoney" );

    }


    // HSBC bank own methods
    public  void educationloan()

    {
        System.out.println( "HSBC --- EducationLoan" );
    }

    public void carloan()
    {
        System.out.println( "HSBC --- carloan" );
    }


    // Brazil bank interface method

    public void mutualfund()
    {
        System.out.println( "BrazilBank --- MutualFund" );

    }
}
