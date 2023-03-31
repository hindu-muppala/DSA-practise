package recusion;
import java.util.Arrays;
import java.util.Scanner;
public class mergesort {
    static int[] a;
           public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            int n=in.nextInt();
            mergesort.a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            } 
          System.out.print(Arrays.toString(merge(0,(mergesort.a).length-1)));
        } 
    static int[] merge2(int a[],int b[]){
        int i=a.length;
        int j=b.length;
        int[] c=new int[i+j];
        int l=0,m=0;
        while(l!=i && m!=j){
            if(a[l]<b[m]){
                c[l+m]=a[l];
                //System.out.print(c[l+m]);
                l+=1;
                continue;
            }
            else {
                c[l+m]=b[m];
               // System.out.print(c[l+m]);
                m+=1;
            }
        }
        // merging remaining elements
        if(l==i){
            // Add b elements to array
            //System.out.print("Ya");
            for(int k=(l+m);k<(i+j);k++){
                c[k]=b[m];
                m+=1;
              //  System.out.println(c[k]);
            }
        }
        else{
            // Add c elements to array
            for(int k=(l+m);k<(i+j);k++){
                c[k]=a[l];
                l+=1;
                //System.out.println(c[k]);
            }
        }
        System.out.println(Arrays.toString(c));
        return c;
    }
    static int[] merge(int s,int e){
        if(s==e){
            System.out.println("I created new array"+a[s]);
            int a[]={mergesort.a[s]};
            return a ;
        }
        return merge2(merge(s, ((s+e)/2)),merge(((s+e)/2)+1,e));
    }

}
