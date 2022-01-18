package main.java.com.github.victorskg.open_closed_principle.bad;

public class Payment {

    private final double salary;

    public Payment(Object employee) {
        if (employee instanceof LaborLaws) {
            salary = ((LaborLaws) employee).salary();
        } else if (employee instanceof Intern) {
            salary = ((Intern) employee).financialAid();
        } else {
            throw new IllegalArgumentException("O objeto enviado não pode receber pagamento.");
        }
    }

    public double getSalary() {
        return salary;
    }

}
