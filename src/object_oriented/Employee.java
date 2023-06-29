package object_oriented;

public class Employee {

    private int EmployeeId;
    private String EmpName;
    private double SumMonth;
    static int WorksNum=0;

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public double getSumMonth() {
        return SumMonth;
    }

    public void setSumMonth(int sumMonth) {
        SumMonth = sumMonth;
    }

    public Employee(String empName, int sumMonth) {
        EmpName = empName;
        SumMonth = sumMonth;
    }

    public  Employee(String empName, double sumMonth){
        this.EmployeeId=WorksNum;
    }
    public static int AnotherWorkers(){
        return WorksNum++;
    }

}