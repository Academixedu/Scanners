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
  double sal;
  char gender;
  boolean pass;
  public  void via(){
    Scanner in=new Scanner(System.in);

    System.out.println("enter id: ");
    id=in.nextInt();

    in.nextLine();
    System.out.println("enter name: ");
     name=in.next();

    System.out.println("enter sal: ");
     sal=in.nextDouble();

    System.out.println("enter gender: ");
    gender=in.next().charAt(0);

    System.out.println("enter result:");
    pass=in.nextBoolean();
  }


  
public static void main(String[]args){
// Call the varibles in the main method and print them
Variables d=new Variables();
d.via();
System.out.println("id is "+d.id);
System.out.println("name is: "+d.name);
System.out.println("sal is: "+d.sal);
System.out.println("gender is: "+d.gender);
System.out.println("pass or fail: "+d.pass);
}
}
