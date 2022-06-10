package Abstrakcja;

public class ServiceEmployee extends Employee{

    private String specialization;
    private int repairsDone;

    public ServiceEmployee(String name, String surname, String address, int employeeId, String specialization, int repairsDone) {
        super(name, surname, address, employeeId);
        setSpecialization(specialization);
        setRepairsDone(repairsDone);
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setRepairsDone(int repairsDone) {
        this.repairsDone = repairsDone;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getRepairsDone() {
        return repairsDone;
    }

    @Override
    public int getCustomersServiced() {
        return getRepairsDone();
    }

    @Override
    public String toString() {
        return "ServiceEmployee: [" +
                "Name: " + getName() + ", " +
                "Surname: " + getSurname() + ", " +
                "Address: " + getAddress() + ", " +
                "EmployeeId: " + getEmployeeId() + ", " +
                "Specialization: " + getSpecialization() + ", " +
                "Customers serviced: " + getCustomersServiced() +
                ']';
    }
}
