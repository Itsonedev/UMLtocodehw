package umlToCode;

public class HireDate {
    private String month;
    private String date;
    private String year;

    public HireDate(String month, String date, String year) {
        this.month = month;
        this.date = date;
        this.year = year;
    }

    public static void printHireDate(Employee employee){
          String fullHireDate = employee.getHireDate().month + "/" + employee.getHireDate().date + "/" + employee.getHireDate().year;
        System.out.println("Hire date: "+ fullHireDate);
    }

    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
}
