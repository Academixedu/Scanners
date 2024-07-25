import java.util.Scanner;

public class ScanArr {
// prepare a Function with return type int[]

    public static int[] Array(int size) {
        int[] a = new int[size];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter integer values:");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Call the function and initialize the array
        int[] myArr = Array(size);

        System.out.println("The array is:");
        for (int num : myArr) {
            System.out.print(num + " ");
        }
    }
}
