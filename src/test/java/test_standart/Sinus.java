package test_standart;

import dataProviderPackage.DataProviderSource;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import test_exceptions.BaseCalculatorTest;

import java.text.DecimalFormat;

/**
 * Created by Zakir_Mustafin on 1/22/2017.
 */
public class Sinus extends BaseCalculatorTest {
//
//    private double first;
//
//    private double expected;
//    private Logger logger;


//    @Factory(dataProvider = "dataForSin")
//    public Sinus(double first, double expected) {
//        this.first = first;
//        this.expected = expected;
//    }



    @Test(dataProvider = "dataForSin", dataProviderClass = DataProviderSource.class)
    public void firstSin(double first, double expected){
        logger = Logger.getLogger("new logger");
        logger.info("Getting test_standart.Sinus of '" + first + "'. Should be '" + expected + "'.");
        DecimalFormat df = new DecimalFormat("#.##########");
        double sin = calculator.cos(Math.toRadians(first));
        logger.info(sin + " number formated to " + df.format(sin));
        Assert.assertEquals(df.format(sin), df.format(expected), "Expected value is '" + expected + "'.");
    }
}
