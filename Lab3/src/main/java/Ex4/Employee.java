public class Employee {
    private String id;
    private String name;
    private String department;
    private int salaryBasic;
    private int salaryExtra;

    public Employee(String id, String name, String department, int salaryBasic, int salaryExtra) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salaryBasic = salaryBasic;
        this.salaryExtra = salaryExtra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(int salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public int getSalaryExtra() {
        return salaryExtra;
    }

    public void setSalaryExtra(int salaryExtra) {
        this.salaryExtra = salaryExtra;
    }
}
