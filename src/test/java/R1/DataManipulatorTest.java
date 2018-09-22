package test.java.R1;

import main.java.R1.DataManipulator;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DataManipulatorTest {

    @Test
    public void nullValueThrowsException(){
        DataManipulator m = new DataManipulator();

        assertThrows(IllegalArgumentException.class, ()-> m.isOdd(null));
    }


    @Test
    public void evenNumbersReturnFalse(){
        DataManipulator m = new DataManipulator();

        assertEquals(m.isOdd(-1), false);
        assertEquals(m.isOdd(-3), false);
        assertEquals(m.isOdd(-5), false);
        assertEquals(m.isOdd(1), false);
        assertEquals(m.isOdd(3), false);
        assertEquals(m.isOdd(5), false);
        assertEquals(m.isOdd(121), false);
    }

    @Test
    public void oddNumbersReturnTrue(){
        DataManipulator m = new DataManipulator();

        assertEquals(m.isOdd(-4), true);
        assertEquals(m.isOdd(-2), true);
        assertEquals(m.isOdd(0), true);
        assertEquals(m.isOdd(2), true);
        assertEquals(m.isOdd(4), true);
        assertEquals(m.isOdd(122), true);

    }

}