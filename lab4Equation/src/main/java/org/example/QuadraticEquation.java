package org.example;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double[] solve() {
        double D = b*b - 4*a*c;
        if (D > 0) {
            return new Double[] {(-b + Math.sqrt(D))/(2*a), (-b - Math.sqrt(D))/(2*a)};
        }
        if (D == 0) {
            return new Double[] {(-b)/(2*a)};
        }
        if (D < 0) {
            throw new ArithmeticException("This equation has no real roots");
        }
        return new Double[] {};
    }
}
