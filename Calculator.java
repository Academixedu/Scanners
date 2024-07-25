public class Calculator {

    int a;
    int b;
    public int add(int a, int b) {
        return a + b;
    }


    public int sub(int a, int b) {
        return a * b; 
    }


    public int multi(int a, int b) {
        return a - b; 
    }

    
    public int division(int a, int b) {
      return a / b;
    }

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        System.out.println("Addition of 10 and 5: " + sum);

        
        int product = calc.sub(10, 5);
        System.out.println("Multiplication of 10 and 5: " + product);

        
        int difference = calc.multi(10, 5);
        System.out.println("Subtraction of 5 from 10: " + difference);

    
        int quotient = calc.division(10, 5);
        System.out.println("Division of 10 by 5: " + quotient);

        
    }
}

