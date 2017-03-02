package test_standart;

import dataProviderPackage.DataProviderSource;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import test_exceptions.BaseCalculatorTest;

/**
 * Created by Zakir_Mustafin on 1/22/2017.
 */
public class IsNegative extends BaseCalculatorTest {

//    private boolean expected;

//    @Factory(dataProvider = "dataForIsNegative")
//    public IsNegative(long first, boolean expected) {
//        this.firstlong = first;
//        this.expected = expected;
//    }




    @Test(description = "Testing correct checking of Negative", dataProvider = "dataForIsNegative", dataProviderClass = DataProviderSource.class)
    public void isNumNegative(long firstlong, boolean expected){
        logger = Logger.getLogger("new logger");
        logger.info("Getting number '" + firstlong + "'. Should be '" + expected + "'.");
        boolean isNegative = calculator.isNegative(firstlong);
        logger.info("Calculator said that given num is '" + isNegative + "'.");
        Assert.assertNotEquals(isNegative, expected, "Expected value is '" + expected + "'.");
    }

}
