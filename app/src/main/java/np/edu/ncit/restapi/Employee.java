package np.edu.ncit.restapi;

public class Employee {
    private int id;
    private String employee_name;
    private double employee_salary;
    private int employee_age;
    private String profile_image;

    public Employee(int id, String employee_name, double employee_salary, int employee_age, String profile_image) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.profile_image = profile_image;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public double getEmployeeSalary() {
        return employee_salary;
    }

    public int getEmployeeAge() {
        return employee_age;
    }

    public String getProfileImage() {
        return profile_image;
    }
}
