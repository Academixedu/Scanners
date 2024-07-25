import java.util.Scanner;

public class Variables{
  // Take each Data Type for Each Variable and Initialize them using scanner here
  // id ->int
  // name ->String
  // sal ->double
  // gender ->char
  // Pass ->boolean
  public static void var(){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the id :");
  int id = sc.nextInt();
  sc.nextLine();
  System.out.println("enter the name :");
  String name = sc.nextLine();
  System.out.println("enter sal : ");
  double sal = sc.nextDouble();
  System.out.println("enter the gender : ");
  char gender = sc.next().charAt(0);
  sc.nextLine();
  System.out.print("Passed: ");
  boolean pass = sc.nextBoolean();
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Salary: " + sal);
    System.out.println("Gender: " + gender);
    System.out.println("Passed: " + pass);
  }
public static void main(String[]args){
// Call the varibles in the main method and print them
var();
}}