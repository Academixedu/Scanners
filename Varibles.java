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
Scanner in = new Scanner(System.in);
//System.out.println("enter id here ");
int id = in.nextInt();
//System.out.println("enter name here");
String name= in.next();
//System.out.println("enter salary here");
double sal= in.nextDouble();
//System.out.println("enter  gender here");
char gender= in.next().charAt(0);
//System.out.println("enter pass value here");
boolean pass = in.nextBoolean();
System.out.println("id is "+id);
System.out.println("name is "+name);
System.out.println("salaray is "+sal);
System.out.println("gender is "+gender);
System.out.println("pass is "+pass);


}
}
