package main.java.com.github.victorskg.liskov_substitution_principle;

public class Square extends GeometricFigure {

    public Square(int sides, int[] sidesSizes) {
        super(sides, sidesSizes);
    }

    @Override
    public Double calculateArea() {
        return Math.pow(sidesSizes[0], 2);
    }

}
