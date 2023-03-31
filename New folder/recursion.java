import java.util.ArrayList;

public class recursion {
    static int[] a={1,2,3,3,5,3,3,6};
    public static void main(String[] args) {
       System.out.print(non_static(3,0));
       
    }
    static ArrayList<Integer> non_static(int target,int i){
        ArrayList<Integer> list=new ArrayList<>();
        if(i==(a.length)){
            return list;
        }
        if(a[i]==target){
           // System.out.print(i);
           list= non_static(target, ++i);
        list.add(i-1);
          return list;
        }
       // System.out.print(i);
       return non_static(target,++i);
    }
}
