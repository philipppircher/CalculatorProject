package cc.phil.calculators;

public abstract class RangeCalculator extends BasicCalculator{
    // Methodes
    //
    public static double rangeCalculate(double averageConsumption, double fueledFuel){
        double temp = getQuotient(100, averageConsumption);
        temp = getProduct(temp, fueledFuel);
        return getRoundedResult(temp, 2);
    }
}
