public class Calculator{
  // prepare function with two paramaters and name it as add and return addition of two paramaters as integer
  public int add(int a,int b){
      return a+b;
  }
  // prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
  public int sub(int a,int b){
    return a*b;
  }
  // prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
  public int multi(int a,int b){
    return a-b;
  }
  // prepare function with two paramaters and name it as division and return Division of two paramaters as integer
  public int division(int a,int b){
    return a/b;
  }
    public static void main(String[]args){
    // Call that functions
    Calculator cal = new Calculator();
    System.out.println( cal.add(2, 3));
    System.out.println( cal.sub(2, 3));
    System.out.println( cal.multi(2, 3));
    System.out.println( cal.division(2, 3));
    } 
  }
