package cc.phil.calculators;

public class Main {
    public static void main(String[] args) {
        basicCalculatorTest();
        geoCalculatorTest();
        rangeCalculatorTest();
        currencyCalculatorTest();
    }

    private static void basicCalculatorTest(){
        double basicsAdd = BasicCalculator.getSum(5, 10.5);                                          // 15.5
            double basicsSub = BasicCalculator.getDifference(20.5, 10.5);        // 10.0
        double basicsMult = BasicCalculator.getProduct(5, 2.5);                                     // 12,5
        double basicsDiv = BasicCalculator.getQuotient(10.0, 3.0);                  // 3,333
    }

    private static void geoCalculatorTest() {
        // Perimeter
        double squarePerimeter = GeoCalculator.getSquarePerimeter(10.2);                                 // 40.8
        double rectanglePerimeter = GeoCalculator.getRectanglePerimeter(22.1, 10.1);             // 64.4
        double trianglePerimeter = GeoCalculator.getTrianglePerimeter(5.0, 10.0, 20.0);   // 35.0
        double circlePerimeter = GeoCalculator.getCirclePerimeter(5.7);                                 // 36.0
        // Area
        double squareArea = GeoCalculator.getSquareArea(5.0);
        double rectangleArea = GeoCalculator.getRectangleArea(5.0, 10.0);
        double triangleArea = GeoCalculator.getTriangleArea(4.0, 6.0, 7.2);
        // traingleArea value after Methodecall -> 11.99993...
        double circleArea = GeoCalculator.getCircleArea(5.0);
    }

    private static void rangeCalculatorTest(){
        double rangeCalculation = RangeCalculator.rangeCalculate(30.0, 50.0);
    }

    private static void currencyCalculatorTest(){
        double eurAmount = 10.0;
        double chfAmount = 10.0;
        double usdAmount = 10.0;
        double resultEurToChf = CurrencyCalculator.getEURToCHF(eurAmount);
        double resultChfToEur = CurrencyCalculator.getCHFToEUR(chfAmount);
        double resultEurToUsd = CurrencyCalculator.getEURToUSD(eurAmount);
        double resultUsdToEur = CurrencyCalculator.getUSDToEUR(usdAmount);
        double resultChfToUsd = CurrencyCalculator.getCHFToUSD(chfAmount);
        double resultUsdToChf = CurrencyCalculator.getUSDToCHF(usdAmount);
    }
}
