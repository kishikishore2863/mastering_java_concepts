package interface1;

public interface AdvanceCalculator {
    double power(double base, double exponent);
    double sqrt(double number);
    double logarithm(double number);
    double sin(double angleInDegrees);
    double cos(double angleInDegrees);
    double tan(double angleInDegrees);
}

class Calc implements AdvanceCalculator{
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double sqrt(double number) {
        return Math.sqrt(number);
    }

    @Override
    public double logarithm(double number) {
        return Math.log(number);
    }

    @Override
    public double sin(double angleInDegrees) {
        return Math.sin(Math.toRadians(angleInDegrees));
    }

    @Override
    public double cos(double angleInDegrees) {
        return Math.cos(Math.toRadians(angleInDegrees));
    }

    @Override
    public double tan(double angleInDegrees) {
        return Math.tan(Math.toRadians(angleInDegrees));
    }
}