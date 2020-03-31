package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestCalculator1.class, TestCalculator2.class, TestCalculator3.class })
public class TestSuite {
}
