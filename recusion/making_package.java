package recusion;

public class making_package {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int Size=0;
  public CustomArrayList(){
    this.data =new int[DEFAULT_SIZE];
  }
  public void add(int num){
    if(isFull()){
        resize();
    }
    else{
        this.data[size]=num;
        size+=1;
    }
  }
}
