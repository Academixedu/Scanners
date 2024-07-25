import java.util.Arrays;
import java.util.Scanner;
public class ScanArr{
// prepare a function with return type int[]
public static int[] fun(){
  Scanner in=new Scanner(System.in);
  System.out.println("enter the array");
  int len=in.nextInt();
  int[] sd=new int[len];
  for(int i=0;i<sd.length;i++){
    System.out.println("enter the value"+i);
    sd[i]=in.nextInt();
  }
  return sd;
}
  public static void main(String[]args){
// Call the Function here and initialize an Array using scanner
    ScanArr ds=new ScanArr();
    int[] a=ds.fun();
    System.out.println("enter value");
    for (int j : a) {
      System.out.println(j);
      System.out.println("array value"+Arrays.toString(a));
      
    }
  }
}
