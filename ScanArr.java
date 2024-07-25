import java.util.Scanner;

public class ScanArr{
// prepare a function with return type int[]
 public int[] arr(int a[]){
  return a;

 }
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    ScanArr obj =new ScanArr();
    int a[]=new int[5];
    for(int i=0;i<5;i++){
      System.out.println("enter value for index :"+i);
      a[i]=s.nextInt();
    }
    int res[]=obj.arr(a);
    for(int j :res){
      System.out.println(j);
    }


// Call the Function here and initialize an Array using scanner
    
  }
}
