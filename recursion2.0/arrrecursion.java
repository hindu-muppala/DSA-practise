import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class arrrecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int b[]=new int[n];
    for(int i=0;i<n;i++){// for two duplicates only it will work
        b[i]=in.nextInt();// sort the b array for duplicates
    }
    WITH_DUPLICATE(b);
}
    static void WITHOUT_DUPLICATE(int[] b){
    List<List<Integer>> outer =new ArrayList<>();
    outer.add(new ArrayList<>());
    for(int num:b){

        int  n2=outer.size();
        for(int i=0;i<n2;i++){
            List<Integer> internal =new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
    }
    System.out.print(outer);
}
static void WITH_DUPLICATE(int[] b){
    List<List<Integer>> outer =new ArrayList<>();
    outer.add(new ArrayList<>());
    int y=-1;
    int previous=b[0]+1; // check if the b is not having any elements
    for(int num:b){
        int  n2=outer.size();
       if(previous==num){
            y+=1;
        
        for(int i=((n2/2)+y);i<n2;i++){
            List<Integer> internal =new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
       }
       else{
        y=-1;
        for(int i=0;i<n2;i++){
            List<Integer> internal =new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
    }
       previous=num;
    }
    System.out.print(outer);
}
    }
