import java.util.Scanner;
public class Variables{
    int id;
    String name;
    double sal;
    char gender;
    boolean pass;
    public void Datatypes() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID (int): ");
        id = sc.nextInt();

        System.out.print("Enter Name (String): ");
        sc.nextLine(); 
        name = sc.nextLine();

        System.out.print("Enter Salary (double): ");
        sal = sc.nextDouble();

        System.out.print("Enter Gender (char): ");
        gender = sc.next().charAt(0);

        System.out.print("Enter Pass (boolean): ");
        pass = sc.nextBoolean();
    }
    public static void main(String[] args) {
        Variables variables = new Variables();
        variables.Datatypes();
        System.out.println("ID: " + variables.id);
        System.out.println("Name: " + variables.name);
        System.out.println("Salary: " + variables.sal);
        System.out.println("Gender: " + variables.gender);
        System.out.println("Pass: " + variables.pass);
    }
}
