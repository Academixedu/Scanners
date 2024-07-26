public class Calculator{
  
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
