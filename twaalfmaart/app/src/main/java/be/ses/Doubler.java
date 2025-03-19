package be.ses;

public class Doubler {

    public float doubleCalculator(Calculator calculator, String operation, float x, float y) {
        switch (operation) {
            case "add":
                return calculator.add(x, y) * 2;
            case "subtract":
                return calculator.subtract(x, y) * 2;
            case "multiply":
                return calculator.multiply(x, y) * 2;
            case "divide":
                if (y == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return calculator.divide(x, y) * 2;
            default:
                throw new UnsupportedOperationException("Wrong calculator operation selected");
        }
    }
}    