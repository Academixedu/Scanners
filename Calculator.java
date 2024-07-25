

public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
public static int add(int a,int b){
  int s=a+b;
  return s;

}
public static int sub(int a,int b){
 int s=a-b;
 return s;

}
public static int multi(int a,int b){
  int s= a*b;
  return s;

}
public static int division(int a,int b){
  int s= a/b;
  return s;

}

  public static void main(String[]args){
  // Call that functions
  Calculator c=new Calculator();
   System.out.println(c.add(4,7));
   System.out.println(c.sub(1,6));
   System.out.println(c.multi(1,6));
   System.out.println(c.division(60,6));
  } 
}
