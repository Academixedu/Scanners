import java.util.Scanner;
public class ScanArr{
// prepare a function with return type int[]
public int function(int a){
  return a;
}
  public static void main(String[]args){
// Call the Function here and initialize an Array using scanner
System.out.println("enter a");
 Scanner b = new Scanner(System.in);
 int a=b.nextInt();
 int Array[]=new int[a];
 for(int i=0;i<Array.length;i++){
  System.out.println("enter array:"+i);
  Array[i]=b.nextInt();
 }    
  }
}
