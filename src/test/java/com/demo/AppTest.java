package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    
    @Test
    public void testStatementCoverage() {
        App app = new App();
        assertEquals(1, app.countEvenNumbers(2));
    }
    
    @Test
    public void testPathCoverage_NoLoop() {
        App app = new App();
        assertEquals(0, app.countEvenNumbers(0));
    }

    @Test
    public void testPathCoverage_LoopOnce_Odd() {
        App app = new App();
        assertEquals(0, app.countEvenNumbers(1));
    }

    @Test
    public void testPathCoverage_LoopMultiple_Even() {
        App app = new App();
        assertEquals(1, app.countEvenNumbers(2));
    }
}
