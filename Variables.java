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
  int id =sc.nextInt();
  System.out.println("enter name:");
  String name =sc.next();
  System.out.println("enter salary:");
  double salary=sc.nextDouble();
  System.out.println("enter gender:");
  char gender=sc.next().charAt(0);
  System.out.println("enter pass:");
  boolean pass =sc.hasNextBoolean();
  }


  
public static void main(String[]args){
// Call the varibles in the main method and print them
Variables f = new Variables();
f.var();
System.out.println("id is "+f.id);
System.out.println("name is is "+f.name);
System.out.println("salary is "+f.salary);
System.out.println("gender  is "+f.gender);
System.out.println("pass is "+f.pass);
}
}
  
