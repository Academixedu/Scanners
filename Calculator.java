public class Calculator{
  // prepare function with two paramaters and name it as add and return addition of two paramaters as integer
  public int add(int a, int b)
  {
    return a+b;
  }
  // prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
  public int sub(int a,int b)
  {
     return a-b;
  }
  // prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
  public int multi(int a,int b)
  {
    return a*b;
  }
  
  // prepare function with two paramaters and name it as division and return Division of two paramaters as integer
  public int division(int a,int b)
  {
    return a/b;
  }
    public static void main(String[]args){
    // Call that functions
    new Calculator().add(10, 10);
    new Calculator().sub(10, 10);
    new Calculator().multi(10, 10);
    new Calculator().division(10, 10);
    System.out.println("------------------------------------");
    System.out.println(new Calculator().add(10, 10));
    System.out.println(new Calculator().sub(10, 10));
    System.out.println(new Calculator().multi(10, 10));
    System.out.println(new Calculator().division(10, 10));
  
  
   
    } 
  }