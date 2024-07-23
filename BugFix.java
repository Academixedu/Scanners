import java.util.Scanner;

public class BugFix
{  

   void meth1()
   {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the id : ");
    int id=in.nextInt();
    System.out.println("Entered id is: "+id);
    in.close();
   }
   
  public static void main(String[]args)
  {
    
    BugFix b=new BugFix();
     b.meth1();
  }
  

}
