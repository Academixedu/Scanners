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
  double salary;
  char gender;
  boolean pass;
  public void var(){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter id:");
  int a =sc.nextInt();
  System.out.println("enter name:");
  String n =sc.next();
  System.out.println("enter salary:");
  double s =sc.nextDouble();
  System.out.println("enter gender:");
  char g =sc.next().charAt(0);
  System.out.println("enter pass:");
  boolean p =sc.hasNextBoolean();
  }


  
public static void main(String[]args){
// Call the varibles in the main method and print them
Variables f = new Variables();
f.var();
}
}