package test.java.R2;

import main.java.R2.ThreeIntegerChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeIntegerCheckerTest {

    @Test
    public void ConstructorWithNullValueThrowsException(){
        ThreeIntegerChecker c = new ThreeIntegerChecker(1,4,null);

        assertThrows(NullPointerException.class, ()-> c.checkFormula());
    }

    @Test
    public void CorrectValuesForArithmeticButArithmeticOperationSetToFalse(){
        ThreeIntegerChecker c = new ThreeIntegerChecker(2,5,7,false);
        assertEquals(c.checkFormula(), false);
    }

    @Test
    public void ArithmeticOperationReturnTrue(){
        ThreeIntegerChecker c = new ThreeIntegerChecker(2,5,7);
        assertEquals(c.checkFormula(),true);
    }

    @Test
    public void MultiplicationOperationReturnsTrue(){
        ThreeIntegerChecker c = new ThreeIntegerChecker(4,2,8);
        assertEquals(c.checkFormula(), true);

    }

}