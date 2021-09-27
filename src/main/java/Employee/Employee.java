package Employee;

public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private double salary;
    static int count = 0;

    public Employee(int id, String first_name, String last_name, double salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
        count++;
    }

    public Employee(Employee e) {
        this.id = e.id;
        this.first_name = e.first_name;
        this.last_name = e.last_name;
        this.salary = e.salary;
        count++;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getName() {
        return(first_name + " " + last_name);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double s) {
        this.salary = s;
    }

    public double getAnnualSalary() {
        return(12 * salary);
    }

    public double raiseSalary(double percentage) {
        this.salary = this.salary + (percentage/100*this.salary);
        return(this.salary);
    }

    public String toString() {
        return(getName() + " has a salary of " + this.salary + " and we got" + count + " Employee");
    }
}
