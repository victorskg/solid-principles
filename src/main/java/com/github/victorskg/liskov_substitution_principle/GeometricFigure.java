package main.java.com.github.victorskg.liskov_substitution_principle;

public abstract class GeometricFigure {
    public int sides;
    public int[] sidesSizes;

    public GeometricFigure(int sides, int[] sidesSizes) {
        this.sides = sides;
        this.sidesSizes = sidesSizes;
    }

    public abstract Double calculateArea();
}
