package org.example;

public interface Functional<T extends FunctionOnInterval> {
    double apply(T func);
}
