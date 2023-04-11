package edu.mde.lab2;

import java.text.NumberFormat;

public class Linear implements Function {
    public static final Linear X = new Linear(1.0) {
        public String toPrettyString(NumberFormat nf) {
            return "x";
        }
    };
    private final double coefficient;

    public Linear(double coefficient) {
        this.coefficient = coefficient;
    }

    public double calculate(double x) {
        return x * coefficient;
    }

    public Function derivative() {
        return new Const(coefficient);
    }

    public String toPrettyString(NumberFormat nf) {
        return String.format("%s*x", nf.format(coefficient));
    }

    public static Linear of(double coefficient) {
        return new Linear(coefficient);
    }
}
