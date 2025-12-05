package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {
    
    @Test
    public void firstTest() {
        assertEquals(Calc.add(1, 2), 3);
    }

    @Test
    public void secondTest() {
        assertEquals(Calc.subtract(7, 3), 40);
    }
}
