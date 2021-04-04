package com.asgarov.patterns.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.time.Duration;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@Tag("first_category")
class CalculatorTest {

    public CalculatorTest(TestInfo testInfo, TestReporter reporter) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getTags());

        System.out.println();

        reporter.publishEntry("Hello you! Constructor initialization completed");
    }

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Smith";

    @RepeatedTest(value = 5, name =
            "{displayName} - repetition {currentRepetition}/{totalRepetitions}")
    void add(TestInfo testInfo) {
        System.out.println(System.getProperty("os.name"));
        assumeTrue(System.getProperty("os.name").equalsIgnoreCase("windows 10"));
        assertTimeout(Duration.ofMillis(8), () -> {
            long h = 0;
            for (int i = 0; i < 1000000; i++) {
                h += i;
            }
        });
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "ac", "adc"})
    void checkThatNumbersAreEven(String word) {
        assertEquals(word.length(), 2);
    }

    @Test
    public void calc() {
        List<String> values = List.of("abc", "ab", "ac");
        assertThat(values, hasSize(3));
        assertThat(values, hasItem(anyOf(equalTo("abc"))));
    }
}