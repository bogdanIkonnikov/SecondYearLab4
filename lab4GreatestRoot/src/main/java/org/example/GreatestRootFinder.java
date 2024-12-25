package org.example;

public class GreatestRootFinder {
    private QuadraticEquation equation;

    public GreatestRootFinder(QuadraticEquation equation) {
        this.equation = equation;
    }

    public double findRoot() {
        if (equation.solve().length == 2 && equation.solve()[0] > equation.solve()[1]) {
            return equation.solve()[0];
        } else if (equation.solve().length == 2) {
            return equation.solve()[1];
        } else if (equation.solve().length == 1) {
            return equation.solve()[0];
        } else if (equation.solve().length == 0) {
            throw new ArithmeticException("This equation has no roots");
        }

        return 0;
    }
}
