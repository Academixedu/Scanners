public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
public int add(int a,int b ){
  return a+b;
}
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
public int sub(int a,int b ){
  return a-b;
}
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
public int mul(int a,int b ){
  return a*b;
}
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
public int div(int a,int b ){
  return a/b;
}
  public static void main(String[]args){
  // Call that functions
  Calculator b=new Calculator();
  System.out.println(b.add(12, 12));
  System.out.println(b.sub(12,12));
  System.out.println(b.mul(12,12));
  System.out.println(b.div(12,12));
  } 
}
