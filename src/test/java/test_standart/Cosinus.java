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
public class Cosinus extends BaseCalculatorTest {

//    @Factory(dataProvider = "dataForCos")
//    public Cosinus(double first, double expected) {
//        this.first = first;
//        this.expected = expected;
//    }



    @Test(description = "Testing Cosinus", dataProvider = "dataForCos", dataProviderClass = DataProviderSource.class)
    public void firstCos(double first, double expected){
        logger = Logger.getLogger("new logger");
        logger.debug("Getting test_standart.Cosinus of '" + first + "'. Should be '" + expected + "'.");
//        System.out.println("Getting test_standart.Cosinus of '" + first + "'. Should be '" + expected + "'.");
        DecimalFormat df = new DecimalFormat("#.##########");
        double cos = calculator.cos(Math.toRadians(first));
        logger.debug(cos + " number formated to " + df.format(cos));
//        System.out.println(cos + " number formated to " + df.format(cos));
        Assert.assertEquals(df.format(cos), df.format(expected), "Expected value is '" + expected + "'.");
    }
}
