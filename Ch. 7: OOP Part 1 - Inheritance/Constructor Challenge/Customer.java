public class Customer {

    private String name = null;

    private double creditLimit = 0;

    private String email = null;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
    public Customer() {
        this("nobody", "nobody@email.com");
    }
    public Customer(String name, String email) {
        this(name, 1000, email);
    }
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

}
