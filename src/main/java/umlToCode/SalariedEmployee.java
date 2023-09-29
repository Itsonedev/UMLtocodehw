package umlToCode;

public class SalariedEmployee extends Employee implements IPayable {

    public SalariedEmployee(String name) {
        super(name);
    }

    private double salary;

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}
