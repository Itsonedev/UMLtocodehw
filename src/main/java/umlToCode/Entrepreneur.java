package umlToCode;

public class Entrepreneur extends Person implements IPayable {
    public Entrepreneur(String name) {
        super(name);
    }
    private double revenue;
    private double expenses;

    public double getRevenue() {
        return revenue;
    }
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    public double getExpenses() {
        return expenses;
    }
    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    @Override
    public double calculatePay() {
        return revenue - expenses;
    }
}
