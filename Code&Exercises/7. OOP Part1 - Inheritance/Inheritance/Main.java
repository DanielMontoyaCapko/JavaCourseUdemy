public class Main extends Object{
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1987", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "02/05/1990","01/01/2020",35000);
        System.out.println(joe);
        System.out.println("Joe's payment: " + joe.collectPay());

        joe.retire();
        System.out.println("Joe Pension check: " + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Marys Paycheck: " + mary.collectPay());
        System.out.println("Marys Holiday Pay: " + mary.getDoublePay());
    }
}