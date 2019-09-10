package dev.fuzzit.examples;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;


@RunWith(JUnitQuickcheck.class)
public class ParseComplexTest {

    @Property public void fuzz(String data) {
        ParseComplex.parse(data);
    }
}
