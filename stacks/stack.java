import java.util.Scanner;
public class stack<T>{
   private int default_size=4; 
   private int red_size=0;
   private int blue_size=0;
   private T[] a;
   stack(){
    this.a=(T[])new Object[default_size];
   }
   public T redPush(T val) throws Exception{
    if(isFull()){
        resize();
      // throw new StackException("Stack is Empty");
    }
    a[red_size]=val;
    this.red_size=this.red_size+1;
    return val;
  }
  public void resize(){
    T[] b=(T[])new Object[2*(this.a.length)];
    for(int i=0;i<red_size;i++){
        b[i]=this.a[i];
    }
    int j=1;
    for(int i=a.length-blue_size;i<a.length;i++,j++)
    {
        b[b.length-j]=this.a[i];
    }
    this.a=b;
  }
  public T bluePush(T val) throws Exception{
    if(isFull()){
        resize();
      // throw new StackException("Stack is Empty");
    }
    a[this.a.length-this.blue_size-1]=val;
    this.blue_size=this.blue_size+1;
    return val;
  }
  public T redPop() throws Exception{
    if(this.red_size==0){
        throw new Exception("Red Stack is empty");
    }
    this.red_size-=1;
    return a[red_size];
   }
   public T bluePop() throws Exception{
    if(this.blue_size==0){
        throw new Exception("Blue Stack is empty");
    }
    this.blue_size-=1;
    return a[blue_size];
   }
   public boolean isFull(){
    if((this.blue_size+this.red_size)==(this.a).length){
        return true;
    }
    return false;
   }
   public void redDisplay(){
    int i;
    System.out.print("Elements in red stack are ");
    for(i=red_size-1;i>=0;i--)
    {
        System.out.print(this.a[i]+" ");
    }
   }
  public void blueDisplay(){
    int i;
    System.out.print("Elements in blue stack are ");
    for(i=a.length-blue_size;i<a.length;i++)
    {
        System.out.print(this.a[i]+" ");
    }
}
   public static void main(String[] args) throws Exception {
    stack<Integer> x=new stack<>();
    while(true)
    {
        System.out.print("\nMenu: \n1.Push-Red stack\n2.Push-Blue stack\n3.Pop-Red stack\n4.Pop-Blue stack\n5.Display-Red stack\n6.Display-Blue stack\n7.Exit");
        System.out.print("\n Enter your choice: ");
        Scanner in =new Scanner(System.in);
        int choice=in.nextInt();
        switch(choice)
        {
            case 1: 
            System.out.print("Enter the value ");
            x.redPush(in.nextInt());
            break;
            case 2: 
            System.out.print("Enter the value ");
            x.bluePush(in.nextInt());
            break;
            case 3: 
            x.redPop();
            break;
            case 4: 
            x.bluePop();
            break;
            case 5: 
            x.redDisplay();
            break;
            case 6: 
            x.blueDisplay();
            break;
            default:
            return;
        }      
    }
   }
}
