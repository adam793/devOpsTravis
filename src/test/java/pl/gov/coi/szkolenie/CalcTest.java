package pl.gov.coi.szkolenie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    @Test
    public void add() throws Exception {
        Calc calc = new Calc();
        int result = calc.add(2, 3);
        assertEquals(result, 5);
    }

}