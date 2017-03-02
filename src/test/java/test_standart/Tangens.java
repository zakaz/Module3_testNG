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
public class Tangens extends BaseCalculatorTest {

//    @Factory(dataProvider = "dataForTg")
//    public Tangens(double first, double expected) {
//        this.first = first;
//        this.expected = expected;
//    }




    @Test(dataProvider = "dataForTg", dataProviderClass = DataProviderSource.class)
    public void firstTg(double first, double expected){
        logger = Logger.getLogger("new logger");
        logger.info("Getting tangens of '" + first + "'. Should be '" + expected + "'.");
        DecimalFormat df = new DecimalFormat("#.##########");
        double tg = calculator.tg(Math.toRadians(first));
        logger.info(tg + " number formated to " + df.format(tg));
        Assert.assertEquals(df.format(tg), df.format(expected), "Expected value is '" + expected + "'.");
    }
}
