package be.ses;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

  @Test
  public void gegevenTeller2Noemer1_wanneerDivide_danResult2() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.divide(2, 1);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(2);
  }
  public void gegevenTeller1Noemer3_wanneerDivide_danResultnulpuntdriedrie() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.divide(1, 3);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(0.33f);
  }

  @Test
  public void gegevenTeller2Noemer4_wanneerDivide_danResult0point5() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.divide(2, 4);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(0.5f);
  }

  @Test
  public void gegevenTellerXNoemer0_wanneerDivide_danDivideByZeroException() {
    // when
    Throwable thrown = catchThrowable(() -> {
      // 1. Arrange
      Calculator calculator = new Calculator();

      // 2. Act
      Float result = calculator.divide(2, 0);
    });

    // 3. Assert
    assertThat(thrown)
        .isInstanceOf(ArithmeticException.class)
        .hasMessageContaining("/ by zero");
  }

  @Test
  public void gegeven4and5_wanneerMultiply_danResult20() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.multiply(4, 5);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(20);
  }
  @Test
  public void gegeven0and5_wanneerMultiply_danResult0() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.multiply(0, 5);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(0);
  }
  @Test
  public void gegeven0and0_wanneerMultiply_danResult0() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.multiply(0, 0);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(0);
  }

  @Test
  public void gegeven2and3_wanneerAdd_danResult5() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.add(2, 3);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(5);
  }

  @Test
  public void gegevenMinus2and5_wanneerAdd_danResult3() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.add(-2, 5);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(3);
  }

  @Test
  public void gegeven0and0_wanneerAdd_danResult0() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.add(0, 0);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(0);
  }

  @Test
  public void gegeven5and3_wanneerSubtract_danResult2() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.subtract(5, 3);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(2);
  }

  @Test
  public void gegeven3and5_wanneerSubtract_danResultMin2() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.subtract(3, 5);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(-2);
  }

  @Test
  public void gegeven0and0_wanneerSubtract_danResult0() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.subtract(0, 0);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(0);
  }


}