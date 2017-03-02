package test_standart;

import dataProviderPackage.DataProviderSource;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import test_exceptions.BaseCalculatorTest;

/**
 * Created by Zakir_Mustafin on 1/22/2017.
 */
public class Divide extends BaseCalculatorTest {

//    @Factory(dataProvider = "dataForDivide")
//    public Divide(long first, long second, long expected) {
//        this.firstlong = first;
//        this.secondlong = second;
//        this.expectedlong = expected;
//    }



    @Test(description = "Testing Division", dataProvider = "dataForDivide", dataProviderClass = DataProviderSource.class)
    public void firstDivideSecond(long firstlong, long secondlong, long expectedlong){
        long divide = calculator.div(firstlong, secondlong);
        Assert.assertEquals(divide, expectedlong);
    }

//    @Test(expectedExceptions = NumberFormatException.class,
//            expectedExceptionsMessageRegExp = "Attempt to divide by zero"
//    )
//    public void testDivOnZero(){
//        long divide = calculator.div(4, 0);
//    }

}
