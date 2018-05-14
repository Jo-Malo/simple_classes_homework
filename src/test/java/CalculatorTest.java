import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

   @Before
    public void before(){
       calculator = new Calculator(6, 4);
   }

   @Test
    public void getNum1(){
       assertEquals(6, calculator.getNum1());
   }

   @Test
    public void getNum2(){
       assertEquals(4, calculator.getNum2());
   }

   @Test
    public void getAddition(){
       assertEquals(10, calculator.getAddition());
   }
   @Test
    public void getSubtraction(){
       assertEquals(2, calculator.getSubtraction());
   }
   @Test
    public void getMultiply(){
       assertEquals(24, calculator.getMultiply());
   }
   @Test
    public void getDivide(){
       assertEquals(1, calculator.getDivide());
   }
}
