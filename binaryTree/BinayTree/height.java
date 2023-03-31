package BinayTree;

import java.util.ArrayList;

public class height {
    height next1;
    height next2;
    int value;
    height head;
    ArrayList<Integer> h=new ArrayList<>();
    height(int val){
        this.value=val;
        this.next1=null;
        this.next2=null;
    } 
    private height addRecursive(height current, int value) {
        if (current == null) {
            return new height(value);
        }  
        if (value < current.value) {
            current.next1 = addRecursive(current.next1, value);
        } else if (value > current.value) {
            current.next2 = addRecursive(current.next2, value);
        } else {
            // value already exists
            return current;
        }
    
        return current;
    }
    void traverse_InOrder(height a){
        if(a==null){
            System.out.print("null");
            return;
        } 
        traverse_InOrder(a.next1);
        System.out.print(a.value+" ");
        traverse_InOrder(a.next2);
    }
    void FindRoot(height h2,int count){
        if(h2==null){
            this.h.add(count);
            return ;
        }
        count=count+1;
        FindRoot(h2.next1, count);
        FindRoot(h2.next2, count);
        count=count-1;
    }
    int FindHeight(height h2){
        FindRoot(h2, 0);
       int  max=0;
       for(int i:this.h){
        if(i>max){
            max=i;
        }
       }
       return max;
    }
    public static void main(String[] args) {
        height tree=new height(43);
        tree.addRecursive(tree,34);
        tree.addRecursive(tree,45);
       System.out.print(tree.FindHeight(tree));
      // tree.traverse_InOrder(tree);
    }
}
