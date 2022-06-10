package Abstrakcja;

public abstract class Employee extends Person{

    private String address;
    private int employeeId;

    public Employee(String name, String surname, String address, int employeeId) {
        super(name, surname);
        setAddress(address);
        setEmployeeId(employeeId);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public abstract int getCustomersServiced();
}
