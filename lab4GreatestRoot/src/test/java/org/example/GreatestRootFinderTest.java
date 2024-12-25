package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestRootFinderTest {
    @Test
    public void FindRootTest1(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,2,0);
        GreatestRootFinder greatestRootFinder = new GreatestRootFinder(quadraticEquation);
        Assertions.assertEquals(0, greatestRootFinder.findRoot());
    }
    @Test
    public void FindRootTest2(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-2,1);
        GreatestRootFinder greatestRootFinder = new GreatestRootFinder(quadraticEquation);
        Assertions.assertEquals(1, greatestRootFinder.findRoot());
    }
    @Test
    public void FindRootTest3(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-2,40);
        GreatestRootFinder greatestRootFinder = new GreatestRootFinder(quadraticEquation);
        Assertions.assertThrows(ArithmeticException.class, () -> greatestRootFinder.findRoot());
    }


}
