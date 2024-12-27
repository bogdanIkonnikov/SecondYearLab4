package org.example;

public class ExpFunction implements FunctionOnInterval {
    private final double A, B, upperLimit, lowerLimit;

    public ExpFunction(double a, double b, double lowerLimit, double upperLimit) {
        A = a;
        B = b;
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
    }

    @Override
    public double solve(double x) {
        if (x > upperLimit || x < lowerLimit) {
            throw new IllegalArgumentException("argument x is not in range");
        } else {
            return A * Math.exp(x) + B;
        }
    }

    @Override
    public double getUpperLimit() {
        return upperLimit;
    }

    @Override
    public double getLowerLimit() {
        return lowerLimit;
    }
}
