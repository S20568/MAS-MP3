package Abstrakcja;

public class ShopEmployee extends Employee{

    private String position;
    private int clientsServiced;

    public ShopEmployee(String name, String surname, String address, int employeeId, String position, int clientsServiced) {
        super(name, surname, address, employeeId);
        setPosition(position);
        setClientsServiced(clientsServiced);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setClientsServiced(int clientsServiced) {
        this.clientsServiced = clientsServiced;
    }

    public String getPosition() {
        return position;
    }

    public int getClientsServiced() {
        return clientsServiced;
    }

    @Override
    public int getCustomersServiced() {
        return getClientsServiced();
    }

    @Override
    public String toString() {
        return "ServiceEmployee: [" +
                "Name: " + getName() + ", " +
                "Surname: " + getSurname() + ", " +
                "Address: " + getAddress() + ", " +
                "EmployeeId: " + getEmployeeId() + ", " +
                "Position: " + getPosition() + ", " +
                "Customers serviced: " + getCustomersServiced() +
                ']';
    }
}
