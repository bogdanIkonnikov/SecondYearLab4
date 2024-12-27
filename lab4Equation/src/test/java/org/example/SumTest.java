package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest {
    LinearFunction linearFunction = new LinearFunction(1, 2, 5, 10);
    RealFunction realFunction = new RealFunction(1, 2, 1, 2, 5, 10);
    SinFunction sinFunction = new SinFunction(1, 1, 0, Math.PI);
    ExpFunction expFunction = new ExpFunction(1, 1, 1, 1);
    SumOfLimits<FunctionOnInterval> sumOfLimits = new SumOfLimits<>();

    @Test
    public void linearTest() {
        Assertions.assertEquals(28.5, sumOfLimits.apply(linearFunction));
    }
    @Test
    public void realTest() {
        Assertions.assertEquals(3, sumOfLimits.apply(realFunction));
    }
    @Test
    public void sinTest() {
        Assertions.assertEquals(1, Math.round(sumOfLimits.apply(sinFunction)));
    }
    @Test
    public void expTest() {
        Assertions.assertEquals(Math.exp(1) * 3 + 3, sumOfLimits.apply(expFunction));
    }
}
