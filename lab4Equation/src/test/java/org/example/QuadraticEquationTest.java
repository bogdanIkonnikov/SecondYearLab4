package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {
    QuadraticEquation quadraticEquation1 = new QuadraticEquation(1, -2, 1);
    QuadraticEquation quadraticEquation2 = new QuadraticEquation(1, 2, 0);
    QuadraticEquation quadraticEquation3 = new QuadraticEquation(1, 2, 40);


    @Test
    public void Test1() {
        Assertions.assertEquals(1, quadraticEquation1.solve()[0]);
    }

    @Test
    public void Test2() {
        Assertions.assertEquals(0, quadraticEquation2.solve()[0]);
        Assertions.assertEquals(-2, quadraticEquation2.solve()[1]);
    }

    @Test
    public void Test3() {
        Assertions.assertEquals(0, quadraticEquation3.solve().length);
    }

}
