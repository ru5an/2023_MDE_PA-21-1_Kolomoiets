package edu.mde.lab2;

import java.text.NumberFormat;

public class Cosh implements Function{
    private final Function fx;

    public Cosh(Function fx) {
        this.fx = fx;
    }

    @Override
    public double calculate(double x) {
        return Math.cosh(fx.calculate(x));
    }

    @Override
    public Function derivative() {
        return new Multiplication(new Sinh(fx),fx.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat nf) {
        return "cosh(" + fx.toPrettyString(nf) + ")";
    }

    public static Cosh of(Function fx){
        return new Cosh(fx);
    }
}
