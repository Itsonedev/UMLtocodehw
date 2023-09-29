package umlToCode;

public abstract class Employee extends Person {

    private HireDate hireDate;
    public Employee(String name) {
        super(name);
        this.hireDate = new HireDate("9", "99","9999");
    }

    public HireDate getHireDate() {
        return hireDate;
    }
    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }
}
