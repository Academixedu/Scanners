import java.util.Scanner;;
public class BugFix{
Scanner in=new Scanner(System.in);
  int id;
  public static void main(String[]args){
    BugFix b=new BugFix();
    System.out.println("Enter the Id:");
    int id=b.in.nextInt();
    System.out.println("your ID is: "+id);
}
}
