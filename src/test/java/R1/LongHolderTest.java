package test.java.R1;

import main.java.R1.LongHolder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongHolderTest {

    @Test
    public void NullValueThrowsException(){
        LongHolder l = new LongHolder();

        assertThrows(IllegalArgumentException.class, () -> l.isMultiple(null, (long)3) );
        assertThrows(IllegalArgumentException.class, () -> l.isMultiple((long)2, null ));
    }

    @Test
    public void SecondParameterZeroValueThrows(){
        LongHolder l = new LongHolder();

        assertThrows(IllegalArgumentException.class, () -> l.isMultiple((long)3.0,(long)0) );
    }

    @Test
    public void SecondParameterBiggerThanFirstReturnsFalse(){
        LongHolder l = new LongHolder();

        assertEquals(l.isMultiple((long)2, (long)4), false);
    }

    @Test
    public void NotMultipleValuesReturnFalse(){
        LongHolder l = new LongHolder();

        assertEquals(l.isMultiple((long)5, (long)3), false);
        assertEquals(l.isMultiple( (long)10000, (long)3 ), false);
        assertEquals(l.isMultiple( (long)10000, (long)7 ), false);

    }

    @Test
    public void isMultipleReturnsTrue(){
        LongHolder l = new LongHolder();

        assertEquals(l.isMultiple((long)12, (long)4), true);
        assertEquals(l.isMultiple( (long)10000, (long)1 ), true);
        assertEquals(l.isMultiple( (long)10000, (long)1000 ), true);


    }


}