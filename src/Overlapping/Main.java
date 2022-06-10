package Overlapping;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person(EnumSet.of(PersonType.Employee), "Jan", "Kowalski", 32, null, null, 0);
        Person p2 = new Person(EnumSet.of(PersonType.Employee, PersonType.Client), "Piotr", "Nowak", 101, "piterek120", "piterek120@gmail.com", 1024);
        Person p3 = new Person(EnumSet.of(PersonType.Client), "Jakub", "Slusarski", 0, "kubslu1", "s20568@pjwstk.edu.pl", 5215);

        try {
            System.out.println(p1.hasEmployeeId());
            System.out.println(p1.hasLoyaltyPoints());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(p2.hasEmployeeId());
            System.out.println(p2.hasLoyaltyPoints());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(p3.hasEmployeeId());
            System.out.println(p3.hasLoyaltyPoints());
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }
}
