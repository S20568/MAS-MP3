package Overlapping;

import java.util.EnumSet;

public class Person {
    //Pola klasy Osoba
    private String name, surname;
    //Pola klasy Pracownik
    private int employeeId;
    //Pola klasy Klient
    private String login; //unique
    private String email;
    private int loyaltyPoints;

    private EnumSet<PersonType> personKind = EnumSet.of(PersonType.Person);


    public Person(EnumSet<PersonType> personKind, String name, String surname, int employeeId, String login, String email, int loyaltyPoints) {
        setPersonKind(personKind);
        setName(name);
        setSurname(surname);
        setEmployeeId(employeeId);
        setLogin(login);
        setEmail(email);
        setLoyaltyPoints(loyaltyPoints);
    }

    public int hasEmployeeId() throws Exception {
        if(personKind.contains(PersonType.Employee))
            return employeeId;
        throw new Exception(name + " " + surname + " is not an employee, so he does not have employee id");
    }

    public int hasLoyaltyPoints() throws Exception {
        if(personKind.contains(PersonType.Client))
            return loyaltyPoints;
        throw new Exception(name + " " + surname +  " is not a client, so he does not have loyalty points");
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnumSet<PersonType> getPersonKind() {
        return personKind;
    }

    public void setPersonKind(EnumSet<PersonType> personKind) {
        this.personKind = personKind;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeId=" + employeeId +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                ", personKind=" + personKind +
                '}';
    }
}
