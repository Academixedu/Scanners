import java.util.Scanner;

public class Varibles
{
   void meth1()
   {

    Scanner sc=new Scanner(System.in);
 System.out.println("enter th id :");
  int id=sc.nextInt();
  
  System.out.println("Enter the name : ");
  sc.nextLine();
 String name=sc.nextLine();
  System.out.println("Enter th salary");
  double sal=sc.nextDouble(); 
  char M;
 
  boolean pass; 
  System.out.println("Entered id : "+id);
   System.out.println("Entered name : "+name);
   System.out.println("Entered salary : "+sal);
    

   }
  // Take each Data Type for Each Variable and Initialize them using scanner here
   

public static void main(String[]args)
  {
// Call the varibles in the main method and print them
new Varibles().meth1();
   
  }
}
