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
public class Sub extends BaseCalculatorTest {

//    @Factory(dataProvider = "dataForSub")
//    public Sub(long first, long second, long expected) {
//        this.firstlong = first;
//        this.secondlong = second;
//        this.expectedlong = expected;
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

    @Test(dataProvider = "dataForSub", dataProviderClass = DataProviderSource.class)
    public void firstMinusSecond(long firstlong, long secondlong, long expectedlong){
        logger = Logger.getLogger("new logger");
        logger.info(firstlong + " - " + secondlong + " = " + expectedlong);
//        System.out.println(first + " - " + second + " = " + expected);
        long sub = calculator.sub(firstlong, secondlong);
        logger.info("Calculator said that " + firstlong + " - " + secondlong + " = " + sub);
//        System.out.println("Calculator said that " + first + " - " + second + " = " + sub);
        Assert.assertEquals(sub, expectedlong, "Expected value is '" + expectedlong + "'.");
    }

//    @Test(expectedExceptions = NumberFormatException.class,
//            expectedExceptionsMessageRegExp = "Attempt to divide by zero"
//    )
//    public void testDivOnZero(){
//        calculator.div(1, 0);
//    }

}
