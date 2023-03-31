import java.io.Console;

public class correctqueue {
    protected int a[];
    private final  int DEFAULT_SIZE=10;
    int end=-1;
    correctqueue(){
       this.a=new int[DEFAULT_SIZE];
    }
    public static void main(String[] args) throws Exception {
        correctqueue d=new correctqueue();
        d.add(45);
        d.add(454);
        System.out.print(d.out());
        d.add(45);
        d.add(454);
        d.add(45);
        d.add(454);
        d.add(45);
        d.add(454);
        d.add(45);
        d.add(454);
        d.add(45);
       
    }
    public int add(int val) throws Exception{
        end+=1;
         if(isFull()){
            throw new StackException("Queue is Full");
         }
         a[end]=val;
         return val;
     }
     public int out() throws Exception{
        if(isEmpty()){
            throw new StackException("Queue is Empty");
        }
        int temp=a[0];// o(n) time complexity
       for(int i=0;i<end+1;i++){
        a[0]=a[i+1];
       }
       end--;
        return temp;
       }
       public boolean isFull(){
        if(end==(this.a).length){
            return true;
        }
        return false;
       }
       public Boolean isEmpty(){
        if(end==-1){
            return true;
        }
        return false;
       }
       public  int front() throws Exception{
            if(isEmpty()){
                throw new Exception("Queue is empty");
            }
            return a[0];
       }
       // dispay
}
