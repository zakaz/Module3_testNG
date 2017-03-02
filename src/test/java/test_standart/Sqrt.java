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
public class Sqrt extends BaseCalculatorTest {


//    @Factory(dataProvider = "dataForSqrt")
//    public Sqrt(double first, double expected) {
//        this.first = first;
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


    @Test(dataProvider = "dataForSqrt", dataProviderClass = DataProviderSource.class)
    public void firstSqrtSecond(double first, double expected){
        logger = Logger.getLogger("new logger");
        logger.info("test_standart.Sqrt of " + first + " = " + expected);
//        System.out.println("test_standart.Sqrt of " + first + " = " + expected);
        double sqrt = calculator.sqrt(first);
        logger.info("Calculator said that sqrt of " + first + " = " + sqrt);
//        System.out.println("Calculator said that sqrt of " + first + " = " + sqrt);
        Assert.assertEquals(sqrt, expected, "Expected value is '" + expected + "'.");
    }

    @Test
    public void firstSqrtSecondNegative(){
        logger.info("test_standart.Sqrt of 16 should not equal '-4'");
//        System.out.println("test_standart.Sqrt of 16 should not equal '-4'");
        double sqrt = calculator.sqrt(16);
        logger.info("Calculator said that sqrt of 16 = 4");
//        System.out.println("Calculator said that sqrt of 16 = 4");
        Assert.assertNotEquals(sqrt, -4, "Expected value is 4");
    }

}
