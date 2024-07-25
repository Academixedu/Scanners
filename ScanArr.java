import java.util.Arrays;
import java.util.Scanner;
public class ScanArr{
  public int[] Array(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array:");
    int len=sc.nextInt();
    int[] arr=new int[len];
    for(int i=0;i<arr.length;i++){
    System.out.println("enter value for index "+i);
     arr[i]=sc.nextInt();
    }
    return arr;
  }
  public static void main(String[]args){
    ScanArr array = new ScanArr();
    int[] a=array.Array();
    System.out.println("Array values:");
    for(int k:a){
      System.out.println(k);
    }
    System.out.println("Array Index:"+Arrays.toString(a));
  }
}
