package cc.phil.calculators;

public abstract class CurrencyCalculator extends BasicCalculator {
    // Methodes
    //
    private static double getCurrencyCalculated(double fromToValue, double amount){
        double exchangedFromToTargetCurrency = getProduct(fromToValue, amount);
        return getRoundedResult(exchangedFromToTargetCurrency, 2);
    }

    public static double getEURToUSD(double amount) {
        double EURisWorthUSD = 1.0848;
        return getCurrencyCalculated(EURisWorthUSD, amount);
    }

    public static double getUSDToEUR(double amount) {
        double USDToEUR =  0.9221;
        return getCurrencyCalculated(USDToEUR, amount);
    }

    public static double getEURToCHF(double amount) {
        double EURToCHF = 1.05339;
        return getCurrencyCalculated(EURToCHF, amount);
    }

    public static double getCHFToEUR(double amount) {
        double CHFToEUR = 0.94935;
        return getCurrencyCalculated(CHFToEUR, amount);
    }

    public static double getCHFToUSD(double amount) {
        double CHFToUSD = 1.02435;
        return getCurrencyCalculated(CHFToUSD, amount);
    }

    public static double getUSDToCHF(double amount) {
        double USDToCHF = 0.976227;
        return getCurrencyCalculated(USDToCHF, amount);
    }
}
