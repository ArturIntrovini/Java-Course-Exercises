public class Main {

    public static void main(String[] args) {

        Customer artur = new Customer();
        System.out.println(artur.getName());
        System.out.println(artur.getCreditLimit());
        System.out.println(artur.getEmail());

        Customer fluor = new Customer("Fluor", 10000, "fluor@mail.com");
        System.out.println(fluor.getName());
        System.out.println(fluor.getCreditLimit());
        System.out.println(fluor.getEmail());

        Customer scout = new Customer("Scout","scout@mail.com");
        System.out.println(scout.getName());
        System.out.println(scout.getCreditLimit());
        System.out.println(scout.getEmail());

    }

}
