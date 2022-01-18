package main.java.com.github.victorskg.open_closed_principle;

import main.java.com.github.victorskg.open_closed_principle.bad.Intern;
import main.java.com.github.victorskg.open_closed_principle.bad.LaborLaws;
import main.java.com.github.victorskg.open_closed_principle.bad.Payment;

import static java.lang.String.format;

public class OpenClosedPrinciple {

    // Objetos ou entidades devem estar abertos para extenção, mas fechados para modificação.
    // Quando novos comportamentos e recursos precisam ser adicionados, devemos EXTENDER e não alterar o código-fonte original.

    public static void main(String[] args) {
        // Bad code
        var laborLawsEmployee = new LaborLaws();
        var internEmployee = new Intern();
        var laborLawsPayment = new Payment(laborLawsEmployee);
        var interPayment = new Payment(internEmployee);
        // var notAValidPayment = new Payment(1);
        System.out.println("Bad Code");
        System.out.printf("LaborLaw: %f. Intern: %f%n", laborLawsPayment.getSalary(), interPayment.getSalary());

        System.out.println();

        // Good Code
        var goodLaborLawsEmployee = new main.java.com.github.victorskg.open_closed_principle.good.LaborLaws();
        var goodInternEmployee = new main.java.com.github.victorskg.open_closed_principle.good.Intern();
        var goodLaborLawsPayment = new main.java.com.github.victorskg.open_closed_principle.good.Payment(goodLaborLawsEmployee);
        var goodInterPayment = new main.java.com.github.victorskg.open_closed_principle.good.Payment(goodInternEmployee);
        System.out.println("Good Code");
        System.out.printf("LaborLaw: %f. Intern: %f%n", goodLaborLawsPayment.getSalary(), goodInterPayment.getSalary());
    }

}
