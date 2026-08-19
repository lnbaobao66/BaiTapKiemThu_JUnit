package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testStatementCoverage() {
        App app = new App();
        assertEquals(1, app.countEvenNumbers(2));
    }
}
