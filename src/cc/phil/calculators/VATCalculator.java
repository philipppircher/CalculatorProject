package cc.phil.calculators;

public abstract class VATCalculator extends BasicCalculator {
    public static double getValueAddedTaxInPercent(CountryCode countryCode){
        double valueAddedTax = 0.0;
        switch (countryCode){
            case AT:
                valueAddedTax = 0.2;
                break;
            case CH:
                // TODO countinue here
                break;
            case DE:
                break;
            case ES:
                break;
            case FR:
                break;
            case GB:
                break;
            case IT:
                break;
            case RU:
                break;
        }
        return valueAddedTax;
    }
}
