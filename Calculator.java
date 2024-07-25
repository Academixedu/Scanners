public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
public static int add(int a, int b)
{
  return a+b;
}
public static int mul(int a, int b)
{
  return a*b;
}
public static int sub(int a, int b)
{
  return a-b;
}
public static int div(int a, int b)
{
  return a/b;
}

  public static void main(String[]args){
  // Call that functions
  Calculator c = new Calculator();
  System.out.println(c.add(4,5));
  System.out.println(c.mul(11,5));
  System.out.println(c.sub(1009,2356));
  System.out.println(c.div(88,12));
  } 
}
