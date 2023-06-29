package object_oriented;

public class ManagersOff extends Employee {

    private String role;
    protected int salary;
    Employee [] array=new Employee[WorksNum];

//    public object_oriented.ManagersOff(String empName, double sumMonth,) {
//        super(empName, sumMonth);
//    }

    public ManagersOff(String empName, int sumMonth, String role, int salary, Employee[] array) {
        super(empName, sumMonth);
        this.role = role;
        this.salary = salary;
        this.array = array;
    }

    public ManagersOff(String empName, double sumMonth, String role, int salary, Employee[] array) {
        super(empName, sumMonth);
        this.role = role;
        this.salary = salary;
        this.array = array;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee[] getArray() {
        return array;
    }

    public void setArray(Employee[] array) {
        this.array = array;
    }

    public boolean FuncWork(Employee [] arr, int salary){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i].getSumMonth();
        }
        if(salary>(sum/arr.length))
            return true;
        return false;
    }

}

