package cc.phil.calculators;

public abstract class GeoCalculator extends BasicCalculator{
    // Methodes
    //
    public static double getSquarePerimeter(double a_Side) {
        return getProduct(a_Side, 4.0);
    }

    public static double getRectanglePerimeter(double a_Side, double b_Side) {
        double result = getSum(a_Side, b_Side);
        return getProduct(result, 2.0);
    }

    public static double getTrianglePerimeter(double a_Side, double b_Side, double c_Side) {
        double result = getSum(a_Side, b_Side);
        return getSum(result, c_Side);
    }

    public static double getCirclePerimeter(double radius) {
        double result = getProduct(2.0, radius);
        return getProduct(result, Math.PI);
    }

    public static double getSquareArea(double a_Side) {
        return getProduct(a_Side, a_Side);
    }

    public static double getRectangleArea(double a_Side, double b_Side) {
        return getProduct(a_Side, b_Side);
    }

    public static double getTriangleArea(double a_Side, double b_Side, double c_Side) {
        double decimalPoints = 0.0;

        //s = (a + b + c )/2
        double s = getSum(a_Side, b_Side);
        s = getSum(s, c_Side);
        s = getQuotient(s, 2.0);

        //A = √(s·(s-a)·(s-b)·(s-c)) = √(8,6·(8,6-4)·(8,6-6)·(8,6-7,2)) = √(8,6 · 4,6 · 2,6 · 1,4) = √143,9984 = 11,9999333331481... ~ 12.
        double part1 = getDifference(s, a_Side);
        double part2 = getDifference(s, b_Side);
        double part3 = getDifference(s, c_Side);
        double result = getProduct(s, part1);
        result = getProduct(result, part2);
        result = getProduct(result, part3);
        result = Math.sqrt(result);
        return getRoundedResult(result, 2);
    }

    public static double getCircleArea(double radius) {
        double result = getProduct(radius, radius);
        return getProduct(result, Math.PI);
    }
}
