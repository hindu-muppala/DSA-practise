import java.util.Scanner;

public class palindrone {
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       String c=in.next();
       queue Q=new queue();
       stack1 s=new stack1();
    //    for(int i=0;i<(c).length();i++){
    //     Q.add(c.getChars(i, i, null, i););
    //     s.add(c[i]);
    //    } 
    //    for(int i=0;i<(c).length()/2;i++){

    //    }
    }
}
 class queue {
    protected char a[];
    private final  int DEFAULT_SIZE=10;
    int end=-1;
    int start=0;
    queue(){
       this.a=new char[DEFAULT_SIZE];
    }
     public char add(char val) throws Exception{
        end+=1;
         if(isFull()){
            throw new Exception("Queue is Full");
         }
         a[end]=val;
         return val;
       }
       public char out() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        start+=1;
        return a[start-1];
       }
       public boolean isFull(){
        if(end==(this.a).length){
            return true;
        }
        return false;
       }
       public Boolean isEmpty(){
        if((end-start)==-1){
            return true;
        }
        return false;
 }
 }
 class stack1{
    protected char a[];
    private final  int DEFAULT_SIZE=10;
    // instance variables always used in inheritance
   protected int ptr; //  declaration top and initailization down
    stack1(){ // prefer default 
     a=new char[DEFAULT_SIZE];
     this.ptr=-1;// using constructor i can instantiate the values
     // bining values
    }
    public int add(char val) throws Exception{
      ptr+=1; 
      if(isFull()){
         throw new StackException("Stack is Empty");
      }
      a[ptr]=val;
      return val;
    }
    public char out() throws Exception{
     if(isEmpty()){
         throw new StackException("Stack is Full");
     }
     ptr-=1;
     return a[ptr+1];
    }
    public boolean isFull(){
     if(ptr==(this.a).length){
         return true;
     }
     return false;
    }
    public Boolean isEmpty(){
     if(ptr==-1){
         return true;
     }
     return false;
    }
    public char peek() throws Exception{
     if(isEmpty()){
         throw new StackException("Now value is not added");
     }
     return a[ptr];
    }}
 
