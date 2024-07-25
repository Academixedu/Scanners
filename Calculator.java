public class Calculator{
  public  int add(int a,int b){
    return a+b;
  }
  public  int sub(int a,int b){
    return a-b;

  }
  public  int multi(int a,int b){
    return a*b;
  }
  public   int division(int a,int b){
    return a/b;
  }
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer
  public static void main(String[]args){
    Calculator c=new Calculator();
   System.out.println(c.add(22,33)); 
    System.out.println(c.sub(30,20));
    System.out.println(c.multi(20,10));
    System.out.println(c.division(300,10));
    



  // Call that functions
  } 
}
