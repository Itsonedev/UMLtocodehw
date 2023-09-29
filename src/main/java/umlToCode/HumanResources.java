package umlToCode;

public class HumanResources {

    public static void printBadge(Employee employee){
        String employeeName = employee.getName();
        System.out.println("Employee name: " + employeeName);
    }
    public static void issueBadges(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
    public static void printPaymentInfo(Employee employee){
        if(employee instanceof SalariedEmployee){
            System.out.println("Payment type: Salary, Salary amount $"+ ((SalariedEmployee) employee).calculatePay());
        } else if (employee instanceof HourlyEmployee) {
            System.out.println("Payment type: Hourly, Weekly amount $"+ ((HourlyEmployee) employee).calculatePay());
        }
    }
}
