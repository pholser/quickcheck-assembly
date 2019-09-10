package dev.fuzzit.examples;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runners.AllTests;

public class QuickCheckMain {

    public static void main(String[] args) {
        System.out.println("Running tests!");
        // Create a JUnit Request
        Request testRequest = Request.method(ParseComplexTest.class, "fuzz");

        // Instantiate a runner (may return an error)
        Runner testRunner = testRequest.getRunner();

        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(testRunner);
    }

}
