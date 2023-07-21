package jUnitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class jUnitTestRunner {

	public static void main(String[] args) {									
	      Result result = JUnitCore.runClasses(AssertTest.class);					
				for (Failure failure : result.getFailures()) {							
	         System.out.println(failure.toString());					
	      }		
}
}