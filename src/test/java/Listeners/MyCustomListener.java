package Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Created by Zakir_Mustafin on 1/23/2017.
 */
public class MyCustomListener implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite started: " + suite.getName());
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite Finished: " + suite.getName());
    }
}