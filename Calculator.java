public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
public int add(int a ,int b){
 return a+b;
}
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
public int sub(int a ,int b){
  return a-b;
 }
 // prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
 public int mul(int a ,int b){
  return a*b;
 }

 // prepare function with two paramaters and name it as division and return Division of two paramaters as integer
 public int div(int a ,int b){
  return a/b;
 }

  public static void main(String[]args){
    Calculator obj=new Calculator();
     // Call that functions
    System.out.println("addition of 10 and 20 is : "+obj.add(10, 20));
    System.out.println("subtraction of 20 and 10 is : "+obj.sub(20, 10));
    System.out.println("multiplication of 10 and 15 is : "+ obj.mul(10, 15));
    System.out.println("division of 50 and 10 is : "+obj.div(50,10));


 
  } 
}
