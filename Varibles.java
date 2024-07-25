import java.util.Scanner;
public class Varibles{
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

public static void main(String[]args){
// Call the varibles in the main method and print them
  Scanner s=new Scanner(System.in);
  Varibles obj=new Varibles();
  System.out.println("enter id");
  obj.id=s.nextInt();
  System.out.println("enter name");
  obj.name=s.next();
  System.out.println("enter salary");
  obj.sal=s.nextDouble();
  System.out.println("enter gender");
  obj.gender=s.next().charAt(0);
  System.out.println("enter True or false");
  obj.pass=s.nextBoolean();
  System.out.println(obj.id);
  System.out.println(obj.name);
  System.out.println(obj.sal);
  System.out.println(obj.gender);
  System.out.println(obj.pass);
  




}}
