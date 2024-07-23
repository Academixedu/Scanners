import java.util.Scanner;

public class ScanArr
{
// prepare a function with return type int[]
public int[] meth()
{ 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the length of an array");
  int len=sc.nextInt();
  int []arr=new int[len];
 
  for(int i=0;i<=arr.length-1;i++)
  {
    System.out.println("Enter the value for index : "+i);
    arr[i]=sc.nextInt();
  }
  sc.close(); 
  return arr;
   
  

}
  public static void main(String[]args)
  {
      // Call the Function here and initialize an Array using scanner

       ScanArr obj=new ScanArr();
       int result []=obj.meth();

       System.out.println("The Array is: ");
       for (int j : result)
        {
           System.out.print(j+" ");
        }

    
  }
}
