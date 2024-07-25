import java.util.Scanner;
public class BugFix{
  Scanner in=new Scanner(System.in);
  int id;


  
  public static void main(String[]args){
    
    System.out.println("enter id");
    BugFix b=new BugFix();
    b.id=b.in.nextInt();
    System.out.println(b.id);
}
}
