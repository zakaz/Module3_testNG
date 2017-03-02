package test_standart;

import dataProviderPackage.DataProviderSource;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import test_exceptions.BaseCalculatorTest;

/**
 * Created by Zakir_Mustafin on 1/22/2017.
 */
public class IsPositive extends BaseCalculatorTest {

//    private boolean expected;
//
//    @Factory(dataProvider = "dataForIsPositive")
//    public IsPositive(long first, boolean expected) {
//        this.firstlong = first;
//        this.expected = expected;
//    }



    @Test(description = "Testing correct checking of Positive", dataProvider = "dataForIsPositive", dataProviderClass = DataProviderSource.class)
    public void isNumPositive(long firstlong, boolean expected){
        logger = Logger.getLogger("new logger");
        logger.info("Getting number '" + firstlong + "'. Should be '" + expected + "'.");
//        System.out.println("Getting number '" + first + "'. Should be '" + expected + "'.");
        boolean isPositive = calculator.isPositive(firstlong);
        logger.info("Calculator said that given num is '" + isPositive + "'.");
//        System.out.println("Calculator said that given num is '" + isPositive + "'.");
        Assert.assertNotEquals(isPositive, expected, "Expected value is '" + expected + "'.");
    }

}
