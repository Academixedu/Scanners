public class Calculator{
  public int add(int num1,int num2){
    return num1+num2;
  }
  public int sub(int num1,int num2){
    return num1-num2;
  }
  public int multi(int num1,int num2){
    return num1*num2;
  }
  public int division(int num1,int num2){
    if(num2==0){
      System.out.println("Not Divisible by zero");
    }
    return num1/num2;
  }
  public static void main(String[]args){
  Calculator calculator = new Calculator();
  System.out.println("Addition of two Numbers: "+calculator.add(2,3));
  System.out.println("Subtraction of 2 Numbers: "+calculator.sub(4,5));
  System.out.println("Multiplication of 2 Numbers: "+calculator.multi(7,5));
  System.out.println("Division of 2 Numbers: "+calculator.division(8,9));
  } 
}
