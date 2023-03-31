import java.util.Scanner;

public class minarray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.print(min_array(a,n));
    }
    static int min_array(int[] a,int n){
           int low=0;
           int high=(n-1);
           int mid=(low+high)/2;
           while(true){
          
           if(a[mid]==a[low]){
                return (a[low]>a[high])?a[high]:a[low];
            }
            if(a[(mid-1)%n]<a[mid] && a[mid]<a[high]){
                high=mid;
            }
            else{
                low=mid;
            }
            mid=(low+high)/2;
           } 
    }
}


