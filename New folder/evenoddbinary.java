import java.util.Scanner;
public class evenoddbinary {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=in.nextInt();
    }
    System.out.print(BINARY_OE(a,n));
  }
  static int BINARY_OE(int[] a,int n){
    int low=0;
    int high=(n-1);
    int mid=(low+high)/2;
    while(low<high){
        if(mid%2==0){
            if(a[(mid-1)]==a[mid]){
                high=(mid-1);
            }
            else if(a[(mid+1)]==a[mid]){
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        else{
            if(a[(mid-1)]==a[mid]){
                low=mid+1;
            }
            else if(a[(mid+1)]==a[mid]){
                high=(mid-1);
            }
            else{
                return mid;
            }
        }
        mid=(low+high)/2;
    }
    return mid;
  }
}
