import java.util.Scanner;

public class ScanArr{
// prepare a function with return type int[]
public int[] Arr(){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the lengh");
  int len = sc.nextInt();
  int arr[] = new int[len];
  for(int i=0;i<arr.length;i++){
    System.out.println("enter the value at"+i);
    arr[i] = sc.nextInt(); 
  }
  return arr;
}
  public static void main(String[]args){
// Call the Function here and initialize an Array using scanner
ScanArr a = new ScanArr();
int[] array = a.Arr();
        for(int num : array) {
            System.out.print(num);
        }
  }
}
