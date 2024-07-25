public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
public static int add(int a,int b)
{
  return a+b;
  
}
public static int sub(int a,int b)
{ 
  return a-b;
  
}
public static int mul(int a,int b)
{
  return a*b;

}
public static int division(int a,int b)
{
  return a/b;
 
}
  public static void main(String[]args)
  {
  // Call that functions
  Calculator b = new Calculator();
      System.out.println("Add value is :" +b.add(2, 2));
      System.out.println("Sub value is :" +b.sub(3, 3));
      System.out.println("Mul value is :" +b.mul(4, 4));
      System.out.println("Div value is :" +b.division(10, 5));
  } 
}
