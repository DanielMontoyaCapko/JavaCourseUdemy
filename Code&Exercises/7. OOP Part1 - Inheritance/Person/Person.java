public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    private String firstName = null;
    private String lastName = null;
    private int age = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0)
            this.age = 0;
        else {
            this.age = age;
        }
    }

    public boolean isTeen(){
        return (age > 12 && age < 20);
    }

    public String getFullName(){
        if (firstName.isEmpty()) return (lastName);
        else if (lastName.isEmpty()) return (firstName);
        else if (firstName.isEmpty() && lastName.isEmpty()) return ("");
        else return (firstName + " " + lastName);
    }
}
