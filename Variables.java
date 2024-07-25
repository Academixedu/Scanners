import java.util.Scanner;

public class Variables {
    
    int id;        
    String name;  
    double sal;    
    char gender;   
    boolean pass;  
 public void IinitializeVariables() {
        
    Scanner scanner =new Scanner(System.in);
    
        System.out.print("Enter ID (int): ");
        id = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter Name (String): ");
        name = scanner.nextLine();

        System.out.print("Enter Salary (double): ");
        sal = scanner.nextDouble();

        System.out.print("Enter Gender (char): ");
        gender = scanner.next().charAt(0);

        System.out.print("Enter Pass Status (true/false): ");
        pass = scanner.nextBoolean();
        scanner.close();
    }

    public void printVariables() {
        
        System.out.println("\nVariable Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
        System.out.println("Gender: " + gender);
        System.out.println("Pass: " + pass);
    }
}

