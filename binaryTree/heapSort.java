class heapSort{
    int[] a;
    int size;
    heapSort(){
        this.a =new int[10];
    this.size=0;
    }
    public void add(int value){
        a[this.size]=value;
        traverse_array(++this.size);
    
    }
    void traverse_array(int present_lenght){
        int temp;
        int next_index=present_lenght/2;
        if(next_index==0){
            return;
        }
        if(a[present_lenght-1]<=a[next_index-1]){
            return;
        }
        temp=a[present_lenght-1];
        a[present_lenght-1]=a[next_index-1];
        a[next_index-1]=temp;
        traverse_array(present_lenght/2);
    }
    void print(){
        for(int i=0;i<size;i++){
            System.out.print(this.a[i]+" ");
        }
    }
    public static void main(String[] args) {
     heapSort HeapSort =new heapSort();
     HeapSort.add(1);
     HeapSort.add(2);
    //HeapSort.print();
    HeapSort.add(3);
    HeapSort.add(4);
   // HeapSort.print();
    HeapSort.add(5);
    HeapSort.add(6);
    HeapSort.add(7);
    HeapSort.add(8);
    // HeapSort.add(9);
    HeapSort.print();
    }
}

