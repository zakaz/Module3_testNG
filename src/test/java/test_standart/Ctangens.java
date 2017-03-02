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
public class Ctangens extends BaseCalculatorTest {

//    @Factory(dataProvider = "dataForCtg")
//    public Ctangens(double first, double expected) {
//        this.first = first;
//        this.expected = expected;
//    }




    @Test(description = "Testing Ctangens", dataProvider = "dataForCtg", dataProviderClass = DataProviderSource.class)
    public void firstCtg(double first, double expected){
        logger = Logger.getLogger("new logger");
        logger.info("Getting test_standart.Ctangens of '" + first + "'. Should be '" + expected + "'.");
//        System.out.println("Getting test_standart.Ctangens of '" + first + "'. Should be '" + expected + "'.");
        DecimalFormat df = new DecimalFormat("#.##########");
        double ctg = calculator.ctg(Math.toRadians(first));
        logger.info(ctg + " number formated to " + df.format(ctg));
//        System.out.println(ctg + " number formated to " + df.format(ctg));
        Assert.assertEquals(df.format(ctg), df.format(expected), "Expected value is '" + expected + "'.");
    }
}
