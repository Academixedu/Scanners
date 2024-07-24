import java.util.Scanner;

public class ScanArr{
// prepare a function with return type int[]
public int[] arr(int a[])
{
  return a;
}
  public static void main(String[]args){
// Call the Function here and initialize an Array using scanner
    ScanArr sa = new ScanArr();
    sa.arr(null);
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter length of array");
    int length = scanner.nextInt();
    int a[] = new int[length];
    for(int i = 0;i < a.length;i++)
    {
      System.out.println("Enter the elements for index="+i);
      a[i] = scanner.nextInt();
    }

    System.out.println();
    System.out.println("USING FOR LOOP");
    for(int i = 0;i<a.length;i++ )
    {
      System.out.println("elements at index"+i+" is"+a[i]);
    }

    for(int j :a)
    {
      System.out.println(j);
    }
  }
}
