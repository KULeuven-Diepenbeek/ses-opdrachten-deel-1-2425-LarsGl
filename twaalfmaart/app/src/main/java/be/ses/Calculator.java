package be.ses;

public class Calculator {
    public Calculator() {

    }
  
    public float divide(float teller, float noemer) {
      if (noemer == 0) {
        throw new ArithmeticException("/ by zero");
      }
      return teller / noemer;
    }
    public float multiply(float teller, float noemer) {
        
        return teller * noemer;
    }
    public float add(float teller, float noemer) {
        
        return teller + noemer;
    }
    public float subtract(float teller, float noemer) {
        
        return teller - noemer;
    }
      
}
