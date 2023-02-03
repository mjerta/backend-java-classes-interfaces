public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Frodo", "Balings", new MasterCard(0), new EmailContactInfo("frodo@novi.nl"));
        customer.getCreditCard().pay(100);
        customer.printName();
        customer.getContactInfo().sendMessage();
        System.out.println(customer.getCreditCard().getDebt());


        Customer customer2 = new Customer("Samwise", "Gamgee", new VisaCard(0), new SmsContactInfo("0612345678"));
        customer2.getCreditCard().pay(100);

        customer2.printName();
        customer2.getContactInfo().sendMessage();
        System.out.println(customer2.getCreditCard().getDebt());

    }
}
