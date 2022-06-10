package Abstrakcja;

public class Main {
    public static void main(String[] args) {

        ServiceEmployee s1 = new ServiceEmployee("Jan", "Kowalski", "Sloneczna 1, 03-000 Warszawa", 123, "Laptops", 4);
        ShopEmployee s2 = new ShopEmployee("Piotr", "Nowak", "Koszykowa 86, 00-000 Warszawa", 42, "Smartphones", 12);

        System.out.println(s1.getCustomersServiced());
        System.out.println(s2.getCustomersServiced());

        System.out.println(s1);
        System.out.println(s2);
    }
}
