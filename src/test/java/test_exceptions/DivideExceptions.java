package test_exceptions;

import org.testng.annotations.Test;

/**
 * Created by Zakir_Mustafin on 1/22/2017.
 */
public class DivideExceptions extends  BaseCalculatorTest {

    @Test(groups = "exceptions", expectedExceptions = NumberFormatException.class,
            expectedExceptionsMessageRegExp = "Attempt to divide by zero"
    )
    public void testDivOnZero(){
        long divide = calculator.div(4, 0);
    }

}
