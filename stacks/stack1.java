

// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.Stack;

public class stack1{
   protected int a[];
   private final  int DEFAULT_SIZE=10;
   // instance variables always used in inheritance
  protected int ptr; //  declaration top and initailization down
   stack1(){ // prefer default 
    a=new int[DEFAULT_SIZE];
    this.ptr=-1;// using constructor i can instantiate the values
    // bining values
   }
   public int add(int val) throws Exception{
     ptr+=1; 
     if(isFull()){
        throw new StackException("Stack is Empty");
     }
     a[ptr]=val;
     return val;
   }
   public int out() throws Exception{
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
   public int peek() throws Exception{
    if(isEmpty()){
        throw new StackException("Now value is not added");
    }
    return a[ptr];
   }
public static void main(String[] args) {
    // Stack<Integer> stack =new Stack<>();
    // stack.push(34);
    // stack.push(45);
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // Deque<Integer> deque=new ArrayDeque<>();
  //    creating dynamic stacks
  stack1 d=new stack1();
  d.isEmpty();
}
}