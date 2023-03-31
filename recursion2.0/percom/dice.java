package percom;

import java.util.ArrayList;

public class dice {
    static int a[]= {1,2,3,4,5,6,7};
    static int sum=6;
    public static void main(String[] args) {
      //  fun(new ArrayList<>(), 0,0);
      dice2("",5);
    }
    static void fun(ArrayList<Integer> p,int j,int sum2){
        for(int i=j;i<((dice.a).length);i++){
            if(sum2>(dice.sum)){
                break;
            }
            ArrayList<Integer> o=new ArrayList<>(p);
            o.add(dice.a[i]);
            if(sum2==(dice.sum)){
                System.out.print(p);
                return;
            }
            else{
                fun(o,i,sum2+a[i]);// reference ko mind me rakoo
            }
        }
    }
    public static void dice2(String p,int target){
        if( target == 0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target;i++){
            dice2(p+i,target-i);
        }
    }
}
