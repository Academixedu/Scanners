import java.util.Scanner;
public class Varibles{
  // Take each Data Type for Each Variable and Initialize them using scanner here
  // id ->int
  // name ->String
  // sal ->double
  // gender ->char
  // Pass ->boolean

  Scanner sc=new Scanner(System.in);
  int age;
  String name;
  double sal;
  char gender;
  boolean pass;

  
public static void main(String[]args){
// Call the varibles in the main method and print them
  Varibles obj=new Varibles();
  System.out.println("enter age");
  obj.age=obj.sc.nextInt();
  System.out.println("enter name");
  obj.name=obj.sc.next();
  System.out.println("enter salary");
  obj.sal=obj.sc.nextInt();
  System.out.println("gender");
  obj.gender=obj.sc.next().charAt(0);
  System.out.println("boolean");
  obj.pass=obj.sc.nextBoolean();
  System.out.println(obj.age);
  System.out.println(obj.name);
  System.out.println(obj.sal);
  System.out.println(obj.gender);
  System.out.println(obj.pass);


}
}
