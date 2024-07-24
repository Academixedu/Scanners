public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
public int add(int a, int b)
{
  return a + b;
}

public int sub(int c,int d)
{
  return c * d;
}

public int multi(int e, int f)
{
  return e - f;
}

public int division(int g, int h)
{
  return g / h;
}
  public static void main(String[]args){
  // Call that functions
    Calculator cal = new Calculator();
    int add=cal.add(2, 3);
    int mul=cal.sub(5,5);
    int sub=cal.multi(6, 2);
    int div=cal.division(10, 5);
    System.out.println("Addition is "+add);
    System.out.println("Product is "+mul);
    System.out.println("Subraction is "+sub);
    System.out.println("Division is "+div);
  } 
}
