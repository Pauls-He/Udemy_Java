public class Employee extends Worker{

    private long emplayeeId;
    private String hireDate;

    private static int emplayeeNo = 1;


    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.emplayeeId = Employee.emplayeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emplayeeId=" + emplayeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
