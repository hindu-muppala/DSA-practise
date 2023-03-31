import java.util.Arrays;

public class DynamicStack extends stack1 {
    public DynamicStack(){
        super();
    }
    // instance variables avi alante modifer unna avi neenu vadachu
    // inherit itayii instance variables not ike methods in modifers except private.
    //  avari cinema valladee // private cannot be inherted
    public DynamicStack(int size){
         this.a=new int[size];
         ptr=-1;
    }
    @Override
    public int add(int val) {
        ptr+=1; 
        if(isFull()){
           size_in();
        }
        ptr+=1;
        this.a[ptr]=val;
        return val;
      
      }
      public void size_in(){
        int[] b=new int[2*(this.a.length)];
        int i=0;
       for(int x:(this.a)){
        b[i]=x;
        i++;
       }
        this.a=b;// new refernce to a

      }
      public static void main(String[] args) {
        DynamicStack j=new DynamicStack(2);
        j.add(1);
        j.add(2);
        j.add(4);
        System.out.print(j.add(5));
    }
  
}
