package be.ses;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DoublerTest {
    @Test
    public void gegevenOperationAddX2Y1_wanneerDoubleCalculator_danResultIs6() {
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.add(2f, 1f)).thenReturn(3.0f);
    
        Doubler doubler = new Doubler();
        float result = doubler.doubleCalculator(calculatorMock, "add", 2, 1);
    
        assertThat(result).isEqualTo(6.0f).withFailMessage("result was " + result + " but expected 6.0.");
        verify(calculatorMock).add(2f, 1f);
    }
    
    @Test
    public void gegevenOperationSubtractX2Y1_wanneerDoubleCalculator_danResultIs2() {
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.subtract(2f, 1f)).thenReturn(1.0f);
    
        Doubler doubler = new Doubler();
        float result = doubler.doubleCalculator(calculatorMock, "subtract", 2, 1);
    
        assertThat(result).isEqualTo(2.0f).withFailMessage("result was " + result + " but expected 2.0.");
        verify(calculatorMock).subtract(2f, 1f);
    }
    
    @Test
    public void gegevenOperationMultiplyX2Y1_wanneerDoubleCalculator_danResultIs4() {
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.multiply(2f, 1f)).thenReturn(2.0f);
    
        Doubler doubler = new Doubler();
        float result = doubler.doubleCalculator(calculatorMock, "multiply", 2, 1);
    
        assertThat(result).isEqualTo(4.0f).withFailMessage("result was " + result + " but expected 4.0.");
        verify(calculatorMock).multiply(2f, 1f);
    }
    
    @Test
    public void gegevenOperationDivideX2Y1_wanneerDoubleCalculator_danResultIs4() {
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.divide(2f, 1f)).thenReturn(2.0f);
    
        Doubler doubler = new Doubler();
        float result = doubler.doubleCalculator(calculatorMock, "divide", 2, 1);
    
        assertThat(result).isEqualTo(4.0f).withFailMessage("result was " + result + " but expected 4.0.");
        verify(calculatorMock).divide(2f, 1f);
    }
    
}