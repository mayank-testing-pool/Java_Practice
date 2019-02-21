package src.programs.InterfaceConcept;

public class HSBCBank implements USBank {
    public void credit() {
        System.out.println( "HSBC --- Credit" );
    }

    public void debit() {

        System.out.println( "HSBC --- Debit" );

    }

    public void transfermoney() {

        System.out.println( "HSBC --- Transfermoney" );

    }

    public  void educationloan()
    {
        System.out.println( "HSBC --- EducationLoan" );
    }

    public void carloan()
    {
        System.out.println( "HSBC --- carloan" );
    }
}
