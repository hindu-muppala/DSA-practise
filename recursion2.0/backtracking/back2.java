package backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class back2 {
    static int r1,c1;
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
     r1=in.nextInt();
     c1=in.nextInt();
   Boolean[][] a=new Boolean[r1][c1];
   for(int i=0;i<r1;i++){
    for(int j=0;j<c1;j++){
       a[i][j]=true;
    }
   }
fine("",a,0,0);
   }
   public static void fine(String p,Boolean[][] a,int r,int c){
    if(r==(r1-1) && c==(c1-1)){
            System.out.print(p+" ");
        return ;
    }
    if( r<r1 && c<c1 && a[r][c] ){
        a[r][c]=false;
        if(r<r1){
            fine(p+"D",copy(a),r+1,c);
        }
        if(c<c1){
            fine(p+"L",copy(a),r,c+1);
        }
        if(r>0){
            fine(p+"U",copy(a),r-1,c);
        }
        if(c>0){
            fine(p+"R",copy(a),r,c-1);
        }
    }
    else{
        return;
    }

   }
   static Boolean[][] copy(Boolean[][] a){
        Boolean[][] b=new Boolean[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                b[i][j]=a[i][j];
            }
        }
        return b;
   }
}
