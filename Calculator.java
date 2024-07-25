public class Calculator{
  // prepare function with two paramaters and name it as add and return addition of two paramaters as integer
    public int add(int a,int b){
      return a+b;

  }
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
    public int sub(int num1,int num2){
      return num1*num2;
    }
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
    public int multi(int n1,int n2){
      return n1-n2;
    }
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
public int division(int v1,int v2){
      return v1/v2;
}
  public static void main(String[]args){
  // Call that functions
  Calculator cal = new Calculator();
  System.out.println("addition is:"+cal.add(2,3));
  System.out.println("substitution is:"+cal.sub(6,3));
  System.out.println("multiplication is:"+cal.multi(2,6));
  System.out.println("division is:"+cal.division(20,2));

  } 
}
