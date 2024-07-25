import java.util.Scanner;

public class BugFix {
    Scanner in = new Scanner(System.in); 
    int id;
 public static void main(String[] args) {
     BugFix b = new BugFix();
 System.out.print("Enter an ID: ");
        b.id = b.in.nextInt();
 System.out.println("Entered ID: " + b.id);
        b.in.close();
    }
}

