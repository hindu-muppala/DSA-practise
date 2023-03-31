package backtracking;
public class back1 {
    static int r=2;
 static int c=2;
 static int count=0;
 public static void main(String[] args) {
    fun(0,0);
    System.out.print(count);
 }
 static void fun(int r,int c){
    if(r==(back1.r) && c==(back1.c)){
       count+=1;
       return;
    }
    if(c<(back1.c)){
     fun(r,c+1);
    }
    if(r<(back1.r)){
      fun(r+1,c);
    }
 }

}
