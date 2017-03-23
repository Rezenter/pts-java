package term02.m04_d27.functions;

public interface Function {

    final public static double EPS = 1e-6;

    public double getValue(double argument);

    public Function getDerivative();

}