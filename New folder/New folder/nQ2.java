
import java.util.ArrayList;

public class nQ2 {
    public static void main(String[] args) {
        boolean[][] array2d={{false,false,false,false},{false,false,false,false},{false,false,false,false},{false,false,false,false}};
        queens(array2d, 0,new ArrayList<>()); 
    }
    static int queens(boolean[][] ar,int row,ArrayList<Integer> a1){
        if(row== ar.length-1){
            display(ar);
            return 1;
        }
        for(int c=0;c<(ar[0].length);c++ ){
            boolean po=true;
            for(Integer c1:a1){
                if(c1==c){
                   po=false;
                   break;
                }
                if((c-1)==(a1.get(a1.size()-1)))
                {
                    po=false;
                   break;
                }
                if(po){
                ar[row][c]=true;
                a1.add(c);
                queens(ar, row+1, a1);
                ar[row][c]=false;
                a1.remove(c);
                }
            }

        }
        return 0;
    }
    private static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
        }
    }
}
