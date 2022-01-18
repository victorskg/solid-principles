package main.java.com.github.victorskg.liskov_substitution_principle;

public class Rectangle extends Square {

    public Rectangle(int sides, int[] sidesSizes) {
        super(sides, sidesSizes);
    }

    @Override
    public Double calculateArea() {
        return (double) (sidesSizes[0] * sidesSizes[1]);
    }

}
