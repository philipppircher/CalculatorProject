package cc.phil.calculators;

public abstract class BasicCalculator {
    // Methodes
    //
    public static double getSum(double summand1, double summand2) {
        return summand1 + summand2;
    }

    public static double getDifference(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public static double getProduct(double factor1, double factor2) {
        return factor1 * factor2;
    }

    public static double getQuotient(double dividend, double divisor) {
        return dividend / divisor;
    }

    public static double getRoundedResult(double value, int decimalPoints) {
        double d = Math.pow(10, decimalPoints);
        return Math.round(value * d) / d;
    }
}
