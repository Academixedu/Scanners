import java.util.Scanner;

public class Variables{
  // Take each Data Type for Each Variable and Initialize them using scanner here
  // id ->int
  // name ->String
  // sal ->double
  // gender ->char
  // Pass ->boolean
  int id;
  String name;
  double Sal;
  char gender;
  boolean Pass;

public static void main(String[]args){
   Scanner in=new Scanner(System.in);
   System.out.println("Enter the Id");
   int id=in.nextInt();
   System.out.println("Enter the NAME");
   String name=in.next();
   System.out.println("Enter the Sal");
   double sal=in.nextInt();
   System.out.println("Enter the Gender");
   char gender=in.next().charAt(0);
   System.out.println("Enter the Pass");
   boolean Pass=in.nextBoolean();

  

   System.out.println("ID id "+id+"\n"+"NAME is "+name+"\n"+"SALARY id "+sal+"\n"+"Gender is"+gender+"\n"+"Pass is"+Pass+"\n");




// Call the varibles in the main method and print them
}}
