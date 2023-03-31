//import java.util.Deque;
// import java.util.LinkedList;
// import java.util.Queue;

public class queue {
   protected int a[];
   private final  int DEFAULT_SIZE=10;
   int end=-1;
   int start=0;
   queue(){
      this.a=new int[DEFAULT_SIZE];
   }
    public static void main(String[] args) throws Exception {
        // Queue<Integer> queue =new LinkedList<>();
        //  queue.add(3);
        //  queue.add(7);
        //  System.out.print(queue.remove());   
        queue data=new queue();
        System.out.println(data.add(1));
        System.out.println(data.out());
        System.out.println(data.add(3));
        System.out.println(data.add(39));
        System.out.println(data.add(30));
        System.out.println(data.add(3));
        System.out.println(data.add(39));
        System.out.println(data.add(30));
        System.out.println(data.add(3));
        System.out.println(data.add(39));
        System.out.println(data.add(30));
        System.out.println(data.get(8));

    }
    public int add(int val) throws Exception{
       end+=1;
        if(isFull()){
           throw new StackException("Stack is Full");
        }
        a[end]=val;
        return val;
      }
      public int out() throws Exception{
       if(isEmpty()){
           throw new StackException("Stack is Empty");
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
//   public int get(int in) throws Exception{
//     if(in<0){
//         throw new Exception("Index cannot be negative");
//     }
//     if(in>(end-start)){
//         throw new Exception("Index cannot be out of the bound");
//     }
//   return a[end-start];
// }// no need
}
