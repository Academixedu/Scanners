import java.util.Scanner;

public class Variables{
  
  // Take each Data Type for Each Variable and Initialize them using scanner here
  // id ->int
  // name ->String
  // sal ->double
  // gender ->char
  // Pass ->boolean
  String Name;
  int Id;
  double Sal;
  char Gender;
  boolean pass;

  public void initializeVariable() {
    Scanner scan=new Scanner(System.in);

    System.out.println("Enter yout name: ");
     Name = scan.nextLine();
    

    System.out.println("Enter your id: ");
    Id = scan.nextInt();

    System.out.println("Enter you salary: ");
    Sal = scan.nextDouble();
    

    System.out.println("Enter your gender(M/F): ");
    Gender = scan.next().charAt(0);
    
    System.out.println("Enter your (True/False): ");
    pass = scan.nextBoolean();

  }
public static void main(String[]args){
// Call the varibles in the main method and print them
    Variables emp= new Variables();

    emp.initializeVariable();

    System.out.println("Name: "+emp.Name);
    System.out.println("Id: "+emp.Id);
    System.out.println("Salery: "+emp.Sal);
    System.out.println("Gender: "+emp.Gender);
    System.out.println("Pass: "+emp.pass);




}
}
