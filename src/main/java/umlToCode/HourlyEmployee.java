package umlToCode;

public class HourlyEmployee extends Employee implements IPayable{
    public HourlyEmployee(String name) {
        super(name);
    }

    private double hourlyRate;
    private double hoursWorked;

    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}
