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
  boolean Pass;
  

public static void main(String[]args){
// Call the varibles in the main method and print them
Scanner s= new Scanner(System.in);
System.out.println("Enter Id:");
int id=s.nextInt();

System.out.println("Enter name:");
String name=s.next();

System.out.println("Enter salary:");
double sal=s.nextDouble();

System.out.println("Enter gender:");
char gender=s.next().charAt(0);                        

System.out.println("Enter pass:");
boolean Pass=s.nextBoolean();

System.out.println("id:"+id);
System.out.println("Name:"+name);
System.out.println("salary:"+sal);
System.out.println("Gender:"+gender);
System.out.println("Pass:"+Pass);

}
}
