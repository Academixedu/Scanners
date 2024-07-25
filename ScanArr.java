import java.util.Scanner;

public class ScanArr{
// prepare a function with return type int[]
public int[] method1()
{
  Scanner aobj=new Scanner(System.in);
  System.out.println("-----------------------------------------------");
  System.out.print("Enter the Size of Array = ");
  int abc=aobj.nextInt();
  int[] array=new int[abc];
  System.out.println("Enter the element = ");
  for(int i=0;i<array.length;i++)
  {
    array[i]=aobj.nextInt();
  }
  return array;
}
  public static void main(String[]args){
// Call the Function here and initialize an Array using scanner
    ScanArr aobj2=new ScanArr();
    int[] array=aobj2.method1();
    System.out.println("/////////////////////////// ");
    System.out.println("The array element is:");
    for (int i : array) 
    {
      System.out.println(i);
    }
  }
}