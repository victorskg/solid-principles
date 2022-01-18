package main.java.com.github.victorskg.open_closed_principle.good;

public class LaborLaws extends Employee {

    @Override
    public double payment() {
        // Cálcula todos os descontos e adiciona as horas extras do funcionário
        return 3800D;
    }

}
