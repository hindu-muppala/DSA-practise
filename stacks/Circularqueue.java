

public class Circularqueue {
    // qenerally tail is also stored
    // but in interview tail is not used
 Boolean init=true;
   private int f=1;
   private int e=0;
   private int size;
   private int[] a;
   private int DEFAULT_SIZE=10;
   Circularqueue(){
      this.a= new int[DEFAULT_SIZE];
      size=a.length;
   }
   public static void main(String[] args) throws Exception {
    Circularqueue data=new Circularqueue();
    System.out.print(data.add(2));
    System.out.print(data.add(2));
    System.out.print(data.add(90));
    System.out.print(data.add(2));
    System.out.print(data.add(2));
    System.out.print(data.add(90));
    System.out.print(data.add(2));
    System.out.print(data.add(2));
    System.out.print(data.add(90));
    System.out.print(data.add(90));
   }
   public int add(int v) throws Exception{
    e+=1;
     if(isFull()){
        throw new Exception("queue is full");
     }
     a[(e)%(size)]=v;
     return v;
   }

   public int out() throws Exception{
    if(isEmpty()){
        throw new StackException("Queue is Empty");
    }
    f+=1;
    return a[(f-1)%(size)];
   }
   public boolean isFull(){
    if(init){
        return false;
    }
    if((e)%size==((f)%size)){
       init=!init;
    }
    return false;
   }
   public Boolean isEmpty(){
    if(init){
        return true;
    }
    if((e)%size==(f)%(size)){
        init=!init;
    }
    return false;
   }
   public  int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return a[f];
   }
   // dispay
}

