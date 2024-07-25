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
  double sal;    
  char gender;   
  boolean pass;  
 public void Initializevar()
 {
  Scanner scanner =new Scanner(System.in);
    
  System.out.print("Enter ID (int): ");
  id = scanner.nextInt();

  scanner.nextLine(); 

  System.out.print("Enter Name (String): ");
  name = scanner.nextLine();

  System.out.print("Enter Salary (double): ");
  sal = scanner.nextDouble();

  System.out.print("Enter Gender (char): ");
  gender = scanner.next().charAt(0);

  System.out.print("Enter Pass Status (true/false): ");
  pass = scanner.nextBoolean();
}
public static void main(String[]args){
// Call the varibles in the main method and print them
Variables a=new Variables();
a.Initializevar();

}}
