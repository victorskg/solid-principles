package main.java.com.github.victorskg.liskov_substitution_principle;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        var square = new Square(4, new int[]{ 5 });
        var rectangle = new Rectangle(4, new int[]{ 5, 4 });
        var areaCalculatorService = new AreaCalculatorService();

        // Objetos podem ser substituídos por seus subtipos sem que isso afete a execução correta do programa.
        areaCalculatorService.calculateAllAreas(square);
        areaCalculatorService.calculateAllAreas(rectangle);

        areaCalculatorService.calculateSquareAreas(square);
        areaCalculatorService.calculateSquareAreas(rectangle);
    }

}
