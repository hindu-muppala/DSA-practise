package BinayTree;
public class binaryTree {
    binaryTree next1;
    binaryTree next2;
    int value;
    binaryTree head;
    binaryTree(int val){
        this.value=val;
        this.next1=null;
        this.next2=null;
    }
    binaryTree add(binaryTree a,int val){
        if(a==null){
            return new binaryTree(value);
        }
        if(a.value> val){
            this.next1=add(a.next1,value);
        }
        else if (a.value< val){
            this.next2=add(a.next2,value);
        }
        else{
            return a;
        }
        return a;
    }
    private binaryTree addRecursive(binaryTree current, int value) {
        if (current == null) {
            return new binaryTree(value);
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
    void traverse_inOrder(binaryTree a){
        if(a==null){
            return;
        }
        System.out.print(a.value);
        traverse_inOrder(a.next1);
        traverse_inOrder(a.next2);

    }
    void traverse_preOrder(binaryTree a){
        if(a==null){
            System.out.print("null");
            return;
        } 
        traverse_inOrder(a.next1);
        System.out.print(a.value);
        traverse_inOrder(a.next2);
    }
    void traverse_postOrder(binaryTree a){
        if(a==null){
            return;
        }
        traverse_inOrder(a.next1);
        traverse_inOrder(a.next2);
        System.out.print(a.value);
    }
    public void traverseInOrder(binaryTree node) {
        if (node != null) {
            traverseInOrder(node.next1);
            System.out.print(" " + node.value);
            traverseInOrder(node.next2);
        }
    }
    public static void main(String[] args) {
        binaryTree r=new binaryTree(12);
     r.head=r;
       r.add(r.head, 21);
       r.add(r.head,3);
    
    r.add(r.head,13);
    r.add(r.head,9);
    r.traverseInOrder(r.head);
    // r.addRecursive(r, 21);
    // r.addRecursive(r, 3);
    // r.addRecursive(r, 13);
    // r.addRecursive(r, 9);
    // r.traverseInOrder(r.head);
    }
}
