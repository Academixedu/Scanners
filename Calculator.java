import java.util.Scanner;

public class Calculator{
// prepare function with two paramaters and name it as add and return addition of two paramaters as integer
// prepare function with two paramaters and name it as sub and return Multiplication of two paramaters as integer
// prepare function with two paramaters and name it as multi and return Substraction of two paramaters as integer
// prepare function with two paramaters and name it as division and return Division of two paramaters as integer

public int add(int a,int b){
    return a+b;
}
public int sub(int a,int b){
  return a-b;
}
public int multi(int a,int b){
  return a*b;
}
public int division(int a,int b){
  return a/b;
}
  public static void main(String[]args){
  // Call that functions
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a value");
  int a=sc.nextInt();
  System.out.println("enter b value");
  int b=sc.nextInt();
  // int a=10;
  // int b=10;
  Calculator c=new Calculator();
  System.out.println("addtion:"+c.add(a, b));
  System.out.println("subtraction:"+c.sub(a, b));
  System.out.println("multiplication:"+c.multi(a, b));
  System.out.println("division:"+c.division(a, b));
  } 
}
