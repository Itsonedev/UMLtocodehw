package umlToCode;

public class CheckCashingPlace {
    public static void main(String[] args) {

        SalariedEmployee james = new SalariedEmployee("James");
        HourlyEmployee devon = new HourlyEmployee("Devon");
        HireDate hireDate1 = new HireDate("3","22","2001");
        devon.setHireDate(hireDate1);
        devon.setHourlyRate(15.0);
        devon.setHoursWorked(40.0);
        SalariedEmployee kobe = new SalariedEmployee("Kobe");
        HireDate hireDate2 = new HireDate("5", "22", "1999");
        kobe.setHireDate(hireDate2);
        kobe.setSalary(90000.0);
        Entrepreneur kyrie = new Entrepreneur("Kyrie"); //only entrepreneur, cannot go in Employees array
        kyrie.setRevenue(200000);
        kyrie.setExpenses(50000);
        Employee[] employees = new Employee[]{devon,kobe,james}; //Employee Array
        Person[] people = new Person[]{kyrie,kobe,james,devon}; //Array of people


        //All Human resources methods called on


        HumanResources.printBadge(devon); //Print badge method
        System.out.println("This employee makes: "+ devon.calculatePay() + " per week.");
        HireDate.printHireDate(devon); //Print Hire Date method
        HumanResources.printBadge(kobe);
        HireDate.printHireDate(kobe);
        System.out.println("This employee makes: "+ kobe.calculatePay()+ " per year.");
        System.out.println("The Entrepreneur's name is " + kyrie.getName());
        System.out.println(kyrie.getName()+ " makes "+ kyrie.calculatePay() + " after expenses.");
        HumanResources.issueBadges(employees); //Issue badges to Array of employees method
        HumanResources.printPaymentInfo(kobe); // Print payment info of Salary Employee
        HumanResources.printPaymentInfo(devon); // Print payment info of Hourly Employee
    }
}
