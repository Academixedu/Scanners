
import java.util.Scanner;
public class Varibles{
  // Take each Data Type for Each Variable and Initialize them using scanner here
  // id ->int
  // name ->String
  // sal ->double
  // gender ->char
  // Pass ->boolean
 public static Scanner scan =new Scanner(System.in);
  public static int id;
  public static String name;
  public static double salary;
  public static char gender;
  public static boolean pass;
public static void main(String[]args){
// Call the varibles in the main method and print them
System.out.println("Enter the id ");
id = scan.nextInt();
System.out.println("Enter the name");
name = scan.next();
System.out.println("Enter the salary");
salary = scan.nextDouble();
System.out.println("Enter the gender");
gender = scan.next().charAt(gender);
System.out.println("Enter the pass value");
pass = scan.nextBoolean();

System.out.println("id is "+id);
System.out.println("name is "+name);
System.out.println("salary is "+salary);
System.out.println("gender is "+gender);
System.out.println("pass value is "+pass);
}
}