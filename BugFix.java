import java.util.Scanner;
public class BugFix{
Scanner in=new Scanner(System.in);
  int id;
  public static void main(String[]args){
  //  Scanner in=new Scanner(System.in);
    BugFix b=new BugFix();
    System.out.println("enter id");
    b.id=b.in.nextInt();
    System.out.println(b.id);
}
}
