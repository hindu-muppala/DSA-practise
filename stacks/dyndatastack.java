public class dyndatastack <item>{
    protected  item[] a;
    private final  int DEFAULT_SIZE=10;
    // instance variables always used in inheritance
   protected int ptr; //  declaration top and initailization down
    dyndatastack(){ // prefer default 
     a=(item[])new Object[DEFAULT_SIZE];
     this.ptr=-1;// using constructor i can instantiate the values
     // bining values
    }
    public item add(item val) throws Exception{
      ptr+=1; 
      if(isFull()){
         throw new StackException("Stack is Empty");
      }
      a[ptr]=val;
      return val;
    }
    public item out() throws Exception{
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
    public item peek() throws Exception{
     if(isEmpty()){
         throw new StackException("Now value is not added");
     }
     return a[ptr];
    }
 public static void main(String[] args) throws Exception {
     // Stack<Integer> stack =new Stack<>();
     // stack.push(34);
     // stack.push(45);
     // System.out.println(stack.pop());
     // System.out.println(stack.pop());
     // Deque<Integer> deque=new ArrayDeque<>();
   //    creating dynamic stacks
   dyndatastack<String> d=new dyndatastack<>();
  System.out.print(d.add("hindu"));
  System.out.print(d.add("hindu@dev"));
 }
}
