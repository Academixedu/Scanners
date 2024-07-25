import java.util.Scanner;

public class ScanArr{
  // prepare a function with return type int[]
  public static int[] IntArray() 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int m = sc.nextInt();
    int[] arr = new int[m];  
    System.out.println("Enter the elements:");
    for (int i = 0; i < m; i++) 
    {
      arr[i] = sc.nextInt();  
    }
    return arr; 
  }
  public static void main(String[]args)
  {
  // Call the Function here and initialize an Array using scanner
  int[] array = IntArray();
  System.out.print("Array elements: ");
  for (int num : array) 
  {
    System.out.print(num + " ");
  }
        
      
  }
}