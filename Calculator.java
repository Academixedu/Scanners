public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
public static int add(int a,int b){
  return a+b;
}
public static int sub(int a,int b){
  return a-b;
}
public static int multi(int a,int b){
  return a*b;
}
public static int div(int a,int b){
  return a/b;
}



  public static void main(String[]args){
  // Call that functions
  Calculator cl=new Calculator();
  cl.add(4, 9);
  System.out.println( cl.add(4, 9));
  cl.sub(4, 2);
  System.out.println( cl.sub(4, 2));
  cl.multi(5, 7);
  System.out.println( cl.multi(5, 7));
  cl.div(2, 20);
  System.out.println( cl.div(2, 20));
  
  } 
}
