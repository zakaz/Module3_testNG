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
public class Pow extends BaseCalculatorTest {

//    @Factory(dataProvider = "dataForPow")
//    public Pow(double first, double second, double expected) {
//        this.first = first;
//        this.second = second;
//        this.expected = expected;
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

    @Test(dataProvider = "dataForPow", dataProviderClass = DataProviderSource.class)
    public void firstPowSecond(double first, double second, double expected){
        logger = Logger.getLogger("new logger");
        logger.info(first + " pow to " + second + " = " + expected);
//        System.out.println(first + " pow to " + second + " = " + expected);
        double pow = calculator.pow(first, second);
        logger.info("Calculator said that " + first + " pow to " + second + " = " + pow);
//        System.out.println("Calculator said that " + first + " pow to " + second + " = " + pow);
        Assert.assertEquals(pow, expected, "Expected value is '" + expected + "'.");
    }

//    @Test(expectedExceptions = NumberFormatException.class,
//            expectedExceptionsMessageRegExp = "Attempt to divide by zero"
//    )
//    public void testDivOnZero(){
//        calculator.div(1, 0);
//    }

}
