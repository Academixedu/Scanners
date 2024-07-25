import java.util.Scanner;

public class ScanArr{
// prepare a function with return type int[]
public int[] arr(int []a){
  return a;
}
  public static void main(String[]args){
// Call the Function here and initialize an Array using scanner
    Scanner in=new Scanner(System.in);
    ScanArr n=new ScanArr();
    int a[]=new int[4];
    for(int i=0;i<a.length;i++){
      System.out.println("enter index values"+i);
      a[i]=in.nextInt();
    }
    int s[]=n.arr(a);
    for(int j:s){
      System.out.println(j);
    }
    
  }
}
