public class Calculator
{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer

public int add(int a,int b)
{
  return a+b;
}
public int mul(int a,int b)
{
  return a*b;
}
public int sub(int a, int b)
{
      return a-b;
}
public int div(int a,int b)
{
  return a/b;
}

public static void main(String[]args)
  {
  // Call that functions
  Calculator obj=new Calculator();
 System.out.println("The addition : "+obj.add(5, 7)); 
 System.out.println("The Multiplication : "+obj.mul(5, 4)); 
 System.out.println("The substraction : "+obj.sub(10, 4)); 
  System.out.println("The division : "+obj.div(25, 5));
  } 
}
