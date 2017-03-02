package test_standart;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import test_exceptions.BaseCalculatorTest;
import dataProviderPackage.DataProviderSource;

/**
 * Created by Zakir_Mustafin on 1/22/2017.
 */
public class Mult extends BaseCalculatorTest {

//    @Factory(dataProvider = "dataForMult")
//    public Mult(long first, long second, long expected) {
//        this.firstlong = first;
//        this.secondlong = second;
//        this.expectedlong = expected;
//    }

//    @DataProvider(name = "dataForMult")
//    public static Object[][] dataForMult(){
//        return new Object[][]{
//                {3, 2, 6},
//                {0, 0, 0},
//                {-1, 1, -1},
//                {1, 0, 0}
//        };
//    }

//    @Test()
//    public void onePlusOne(){
//        long sum = calculator.sum(1, 1);
//        Assert.assertEquals(sum, 2);
//        checkTime();
//        Timeout.sleep(2);
//    }
//
//    @Test()
//    public void onePlusTwo(){
//        long sum = calculator.sum(1, 2);
//        Assert.assertEquals(sum, 3);
//        checkTime();
//        Timeout.sleep(2);
//    }

//    @Test(priority = 0, groups = "big")

    @Test(description = "testing Multiplication", dataProvider = "dataForMult", dataProviderClass = DataProviderSource.class)
    public void firstMultiplySecond(long firstlong, long secondlong, long expectedlong){
        logger = Logger.getLogger("new logger");
        logger.info(firstlong + " * " + secondlong + " = " + expectedlong);
        long mult = calculator.mult(firstlong, secondlong);
        logger.info("Calculator said that " + firstlong + " * " + secondlong + " = " + mult);
        Assert.assertEquals(mult, expectedlong, "Expected value is '" + expectedlong + "'.");
    }

//    @Test(expectedExceptions = NumberFormatException.class,
//            expectedExceptionsMessageRegExp = "Attempt to divide by zero"
//    )
//    public void testDivOnZero(){
//        calculator.div(1, 0);
//    }

}
