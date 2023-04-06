public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sam", 2000,"sam@gmail.com");
        System.out.println("Name: " + customer.getName() + "\nCredit limit: " + customer.getCreditLimit() + "\nEmail: " + customer.getEmail());

        Customer secondCustomer = new Customer("Ili","ili@mile.dk");
        System.out.println("Name: " + secondCustomer.getName() + "\nCredit limit: " + secondCustomer.getCreditLimit() + "\nEmail: " + secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}
