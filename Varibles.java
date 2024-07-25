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
Varibles v=new Varibles();


System.out.println("enter id");
int id=s.nextInt();
System.out.println("enter name");
String name=s.next();
System.out.println("enter sal");
double sal=s.nextDouble();
System.out.println("enter gender");
char gender=s.next().charAt(0);
System.out.println("enter");
boolean pass=s.nextBoolean();
System.out.println(id);
System.out.println(name);
System.out.println(sal);
System.out.println(gender);
System.out.println(pass);


}
}
