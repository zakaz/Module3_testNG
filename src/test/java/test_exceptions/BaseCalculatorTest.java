package test_exceptions;

import com.epam.tat.module4.Calculator;
import org.apache.log4j.Logger;
import org.testng.annotations.*;
import java.util.Date;

/**
 * Created by Zakir_Mustafin on 1/22/2017.
 */
public class BaseCalculatorTest {

    protected Calculator calculator;

    protected long firstlong;
    protected long secondlong;
    protected long expectedlong;

    protected double first;
    protected double second;

    protected double expected;
    protected Logger logger;

    @BeforeSuite
    public void beforeSuite() { System.out.println("Before suite"); }

    @BeforeClass
    public void beforeClass() { System.out.println("Before class");}

    @BeforeMethod
    public void beforeMethod() { System.out.println("Before method");}

    @BeforeClass(groups = "config")
    public void setUp() {
        System.out.println("Create instance of Calculator");
        calculator = new Calculator();
    }


    @AfterMethod
    public void afterMethod() { System.out.println("After Method"); }

    @AfterSuite
    public void afterSuite() { System.out.println("After suite"); }

    @AfterClass
    public void afterClass() { System.out.println("After class"); }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}
