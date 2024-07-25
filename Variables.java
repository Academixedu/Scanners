import java.util.Scanner;

public class Variables{
  // Take each Data Type for Each Variable and Initialize them using scanner here
  // id ->int
  // name ->String
  // sal ->double
  // gender ->char
  // Pass ->boolean
public static void main(String[]args){
// Call the varibles in the main method and print them
     int id ;
     String name ;
     double sal ;
     char gender ;
     boolean pass ;
     Scanner sc = new Scanner(System.in);
     id = sc.nextInt();
     name =sc.next();
     sal = sc.nextDouble();
     gender = sc.next().charAt(0);
     pass = sc.nextBoolean();
     System.out.println("Emp id:   " + id);
     System.out.println("Name of Emp:   " + name);
     System.out.println("Salary of Emp:  " + sal);
     System.out.println("Gender of Emp:   " + gender);
     System.out.println("Emp:  " + pass);

     



     
}}
