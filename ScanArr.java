import java.util.Scanner;
public class ScanArr{
// prepare a function with return type int[]
public int[] arr(int a[]){
  return a;

}
  public static void main(String[]args){
    // Call the Function here and initialize an Array using scanner
    
    Scanner s=new Scanner(System.in);
    ScanArr obj=new ScanArr();
    
    int a[]=new int[5];
    for(int i=0;i<5;i++){
    
    System.out.println("enter value of index :"+i);
    a[i]=s.nextInt();
   
  }
  int result[]=obj.arr(a);
  
  for(int j:result){
    System.out.println( +j);
  }


  
    

  
    
  }
}
