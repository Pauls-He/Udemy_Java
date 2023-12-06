import javax.swing.*;

public class Main {
    public static void main(String[] args) {



        Account bobsAccount = new Account("12345", 500.00,
                "Bob Brown", "myemail@bob.com",
                "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFounds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFounds(50);

        bobsAccount.withdrawFounds(200);
        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFounds(45.55);
        bobsAccount.withdrawFounds(54.46);

        bobsAccount.withdrawFounds(54.45);
    }
}
