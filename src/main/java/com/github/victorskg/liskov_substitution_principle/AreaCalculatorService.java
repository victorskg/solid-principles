package main.java.com.github.victorskg.liskov_substitution_principle;

public class AreaCalculatorService {

    public void calculateAllAreas(GeometricFigure geometricFigure) {
        System.out.println(geometricFigure.calculateArea());
    }

    public void calculateSquareAreas(Square square) {
        System.out.println(square.calculateArea());
    }

}
