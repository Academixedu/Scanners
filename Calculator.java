public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
public int add(int a, int b){
  return a+b;
}
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
public int sub(int a, int b){
  return a-b;
}
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
public static int multi(int a,int b){
  return a*b;
}
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
public static int div(int a, int b){
  return a/b;
}
  public static void main(String[]args){
  // Call that functions
  int a= 20;
  int b = 45;

  Calculator cal= new Calculator();

  System.out.println("sum of intigers is : "+cal.add(a, b));
  System.out.println("substraction of intigers is : "+cal.sub(a, b));
  System.out.println("multiple of intigers is : "+cal.multi(a, b));
  System.out.println("division of intigers is : "+cal.div(a, b));




  } 
}
