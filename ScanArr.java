import java.util.Scanner;

public class ScanArr{
// prepare a function with return type int[]
public int[] arr(int a[])
{
  return a;
}
  public static void main(String[]args){
// Call the Function here and initialize an Array using scanner
    Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the value of the array");
     int value = scanner.nextInt();
     int[] arr = new int[value];
     for (int i = 0; i < value; i++){
      arr[i] = scanner.nextInt();
         }
         ScanArr s = new ScanArr();
         int[] resultArray = s.arr(arr);
     for (int j: resultArray) {
      System.out.print(j);

}
}
}
