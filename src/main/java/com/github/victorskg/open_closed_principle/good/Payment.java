package main.java.com.github.victorskg.open_closed_principle.good;

public class Payment {

    private final double salary;

    public Payment(Employee employee) {
        this.salary = employee.payment();
    }

    public double getSalary() {
        return salary;
    }

}
