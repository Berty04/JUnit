package junit;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

	@Override
	public void testRunStarted(Description description) throws java.lang.Exception {
		System.out.println("Test cases to execute : " + description.testCount());
	}

	@Override
	public void testRunFinished(Result result) throws java.lang.Exception {
		System.out.println("Test cases executed : " + result.getRunCount());
	}

	@Override
	public void testStarted(Description description) throws java.lang.Exception {
		System.out.println("Execution Started : " + description.getMethodName());
	}

	@Override
	public void testFinished(Description description) throws java.lang.Exception {
		System.out.println("Execution Finished : " + description.getMethodName());
	}

	@Override
	public void testFailure(Failure failure) throws java.lang.Exception {
		System.out.println("Execution Failure : " + failure.getException());
	}

	@Override
	public void testIgnored(Description description) throws java.lang.Exception {
		System.out.println("Execution Ignored : " + description.getMethodName());
	}

	@Override
	public void testAssumptionFailure(Failure failure) {
		System.out.println("Assumption Failure : " + failure.getMessage());
	}
}
