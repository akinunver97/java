public class Main {
    public static void main(String[] args) {

        Account akinsAccount = new Account("12345",0.00,
                "Akin Unver","akin@akin.com",
                "987654321");

        /*
        Account defaultAccount = new Account();
        System.out.println(defaultAccount.getCustomerName());
        System.out.println(defaultAccount.getCustomerEmailAddress());
         */

        System.out.println(akinsAccount.getCustomerName());
        System.out.println(akinsAccount.getCustomerEmailAddress());
        System.out.println(akinsAccount.getCustomerPhoneNumber());

        akinsAccount.deposit(200);
        akinsAccount.withdrawal(50);

        akinsAccount.deposit(150);

    }
}
