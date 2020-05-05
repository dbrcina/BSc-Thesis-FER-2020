package hr.fer.zemris.fthesis.ann.afunction;

public class Tanh implements ActivationFunction {

    @Override
    public double valueAt(double x) {
        return Math.tanh(x);
    }

    @Override
    public double derivativeValueAt(double x) {
        double temp = valueAt(x);
        return 1 - temp * temp;
    }

}
