import java.util.Scanner;
public class BugFix{
static Scanner in=new Scanner(System.in);
  int id;
  public static void main(String[]args){
    BugFix b=new BugFix();
    System.out.println("Enter ID:");
    b.id=in.nextInt();
    System.out.println("The Entered ID is:"+b.id);
  }
}
