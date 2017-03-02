import Listeners.MyCustomListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;

/**
 * Created by Zakir_Mustafin on 1/23/2017.
 */
public class Runner {
    public static void main(String[] args){
        TestNG testNG = new TestNG();
        testNG.addListener(new TestListenerAdapter());
        testNG.addListener(new MyCustomListener());

        final XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("Calculator suite");
        xmlSuite.setSuiteFiles(
                new ArrayList<String>(){{
                    add("src/test/resources/suite/exceptions.xml");
                }}
        );

        testNG.setXmlSuites(new ArrayList<XmlSuite>(){{
            add(xmlSuite);
        }});

        testNG.run();
    }
}
