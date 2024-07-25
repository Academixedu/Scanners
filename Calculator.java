public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
   public static int add(int a, int b){
     return a+b;
   }
   public static int sub(int a, int b){
    return a-b;
  }
  public static int mul(int a, int b){
    return a*b;
  }
  
  public static int div(int a, int b){
    return a/b;
  }
  public static void main(String[]args){
  // Call that functions
  
  int a ;
  int b ;
  System.out.println("Adding two num: " +  add(2, 3));
  System.out.println("Subtracting two num: " + sub(2, 3));
  System.out.println("Multipling two num: " + mul(2, 3));
  System.out.println("Divding two num: " + div(4, 3));
}}
