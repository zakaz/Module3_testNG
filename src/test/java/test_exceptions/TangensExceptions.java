package test_exceptions;

import org.testng.annotations.Test;
import test_exceptions.BaseCalculatorTest;

/**
 * Created by Zakir_Mustafin on 1/23/2017.
 */
public class TangensExceptions extends BaseCalculatorTest {
        @Test(groups = "exceptions", expectedExceptions = NumberFormatException.class)
        public void firstTgException () {
            double tg = calculator.tg(90);
//            Assert.assertNotEquals(tg, 1);
        }

        @Test(groups = "exceptions", expectedExceptions = NumberFormatException.class)
        public void secondTgException () {
            double tg = calculator.tg(270);
//            Assert.assertNotEquals(tg, 1);
        }
}
