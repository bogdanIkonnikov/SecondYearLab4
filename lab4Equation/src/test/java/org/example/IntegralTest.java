package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegralTest {
    LinearFunction linearFunction = new LinearFunction(-1, 10, 5, 10);
    RealFunction realFunction = new RealFunction(2, 1, 0, 1, 5, 10);
    SinFunction sinFunction = new SinFunction(0, 2 * Math.PI, 0, 20);
    ExpFunction expFunction = new ExpFunction(1, 0, 1, 1);
    FunctionIntegral functionIntegral = new FunctionIntegral<>(6,9);

    @Test
    public void linearTest() {
        Assertions.assertEquals(8, Math.round(functionIntegral.apply(linearFunction)));
    }
    @Test
    public void realTest() {
        Assertions.assertEquals(48, Math.round(functionIntegral.apply(realFunction)));
    }
    @Test
    public void sinTest() {
        Assertions.assertEquals(0, functionIntegral.apply(sinFunction));
    }
    @Test
    public void expTest() {
        Assertions.assertThrows( IllegalArgumentException.class, () -> functionIntegral.apply(expFunction));
    }
}
