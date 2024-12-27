package org.example;

public class FunctionIntegral<T extends FunctionOnInterval> implements Functional<T> {
    final double lowerLimit, upperLimit;

    public FunctionIntegral(double lowerLimit, double upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    @Override
    public double apply(T func) {
        if (lowerLimit < func.getLowerLimit() || upperLimit > func.getUpperLimit()) {
            throw new IllegalArgumentException("Illegal Range");
        }
        double integral = 0;
        for (double i = lowerLimit; i < upperLimit; i += (upperLimit - lowerLimit) / 1000) {
            integral += func.solve(i) * (upperLimit - lowerLimit) / 1000;
        }
        return integral;
    }
}
