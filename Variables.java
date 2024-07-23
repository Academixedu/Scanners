public class Varibles{
  // Take each Data Type for Each Variable and Initialize them using scanner here
  // id ->int
  // name ->String
  // sal ->double
  // gender ->char
  // Pass ->boolean
public static void main(String[]args){
// Call the varibles in the main method and print them
}}
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = scanner.nextInt();

        System.out.println("Enter Name:");
        String name = scanner.next();

        System.out.println("Enter Salary:");
        double sal = scanner.nextDouble();

        System.out.println("Enter Gender (M/F):");
        char gender = scanner.next().charAt(0);

        System.out.println("Enter Password (true/false):");
        boolean pass = scanner.nextBoolean();

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
        System.out.println("Gender: " + gender);
        System.out.println("Password: " + pass);
    }
}
