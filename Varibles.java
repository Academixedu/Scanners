import java.util.Scanner;
public class Varibles{
  // Take each Data Type for Each Variable and Initialize them using scanner here
  int id;
  String name;
  double salary;
  char gender;
  boolean pass;
  // id ->int
  // name ->String
  // sal ->double
  // gender ->char
  // Pass ->boolean
public static void main(String[]args){
// Call the varibles in the main method and print them
Scanner g=new Scanner (System.in);
Varibles b=new Varibles();
System.out.println("enter id");
b.id=g.nextInt();
System.out.println("enter name");
b.name=g.next();
System.out.println("enter salary");
b.salary=g.nextDouble();
System.out.println("enter gender");
b.gender=g.next().charAt(0);
System.out.println("pass or fail");
b.pass=g.nextBoolean();
System.out.println("id"+b.id);
System.out.println("name"+b.name);
System.out.println("salary"+b.salary);
System.out.println("gender"+b.gender);
System.out.println("pass or fail"+b.pass);
}
}
