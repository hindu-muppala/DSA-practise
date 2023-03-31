import java.util.ArrayList;

public class practise {
    public static void main(String[] args) {
      
      ArrayList<ArrayList<Integer>> k=new ArrayList<>();
      ArrayList<ArrayList<Integer>> ki=new ArrayList<>();
      k.add(new ArrayList<>());
      (k.get(0)).add(200);
      ki.addAll(k);
     ArrayList<Integer> o=new ArrayList<>((k.get(0)));// passing the constructor 
     // here we are doing the copy
     // IN ADDALL METHOD THERE IS NO COPY OF OBJECT
     System.out.print(o);
     (k.get(0)).add(201);
     System.out.println(o);
     System.out.println(ki);// since in addall method object is passed..
    }// IF WE CHANGE ONE OTHER WILL AUTO CHANGE
}
