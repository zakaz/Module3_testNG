package test_exceptions;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


/**
 * Created by Zakir_Mustafin on 1/23/2017.
 */
public class CtangensExceptions extends BaseCalculatorTest {

        @Test(groups = "exceptions", expectedExceptions = NumberFormatException.class)
        public void firstCtgException () {
            logger = Logger.getLogger("new logger");
            double ctg = calculator.ctg(0);
            logger.info(ctg);
//            System.out.println(ctg);
//            Assert.assertNotEquals(tg, 1);
        }

        @Test(dependsOnMethods ={"firstCtgException"}, alwaysRun = true, groups = "exceptions", expectedExceptions = NumberFormatException.class)
        public void secondCtgException () {
            logger = Logger.getLogger("new logger");
            double ctg = calculator.ctg(180);
            logger.info(ctg);
//            System.out.println(ctg);
//            Assert.assertNotEquals(tg, 1);
        }


    @Test(dependsOnMethods ={"secondCtgException"}, alwaysRun = true, groups = "exceptions", expectedExceptions = NumberFormatException.class)
    public void thirdCtgException () {
        logger = Logger.getLogger("new logger");
        double ctg = calculator.ctg(360);
        logger.info(ctg);
//        System.out.println(ctg);
//            Assert.assertNotEquals(tg, 1);
    }
}
