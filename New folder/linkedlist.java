import java.util.Scanner;

public class linkedlist {
   private static linkedlist head;
    private int node;
    private linkedlist refer;
    public static void main(String[] args) {
         Scanner in=new  Scanner(System.in);
         System.out.println("Enter the number ");
       int n=in.nextInt();
       if(n!=0){
        System.out.println("Enter the values of int type ");
      linkedlist.head=new linkedlist();
       }
     linkedlist  temp= head;
     temp.node=in.nextInt(); 
         for(int i=0;i<n-1;i++){
           temp.refer=new linkedlist();
            temp=temp.refer;
            temp.node=in.nextInt();
         }
        head=insertRece(34, 0, head);
        print(head);
    }
    private static linkedlist insertRece(int val,int index,linkedlist node){
      if(index==0){
        linkedlist temp=new linkedlist();
        temp.refer=node;
        temp.node=val;
        return temp;
      }
      node.refer=insertRece( val,index--, node.refer);
      return node;
    }
 static void add (linkedlist head,int val){// adding in 0 index
    // System.out.print("WOW");
    linkedlist temp=head;
    if(temp==null){
        linkedlist.head=new linkedlist();
        head.node=val;
        return;
    }
   while(temp.refer!=null){
         temp=temp.refer;
      }
      temp.refer=new linkedlist();
      temp=temp.refer;
      temp.node=val;
      temp=temp.refer;
    //  System.out.print(temp);
      System.out.println("I added successfully");
 }
 static void insert (linkedlist temp,int v,int n){// adding in index at n
    // System.out.print("WOW");
    int lenght=((linkedlist.lenght(temp))-1);
  if(n==0){
    add(temp,v);
    return;
  }
  else if(n>(lenght)){
    return;
  }
  for(int i=0;i<n-1;i++){
    temp=temp.refer;
  }
  linkedlist temp2=new linkedlist();
  temp2.node=v;
  linkedlist temp3;
 temp3=temp.refer;
  temp.refer=temp2;
  temp2.refer=temp3;
}
      static void delete (linkedlist temp,int v,int n){// delete at index n
        // System.out.print("WOW");
        if(temp==null){
            return;
        }
        if(n==0){
            pop(temp);
            return;
        }
        for(int i=0;i<n;i++){
             if(temp.refer==null){
                return;
             }  
             temp=temp.refer;
          }
       if((temp.refer).refer==null){
        temp.refer=null;
       }
       else{
      linkedlist  temp2;
    temp2=(temp.refer).refer;
        (temp.refer).refer=null;
        temp.refer=temp2;
       }
        }
 static int pop (linkedlist temp){// delete last element // return the delete element node value
    // System.out.print("WOW");
    int delete_value;
    if(temp!=null){
    if(temp.refer!=null){
   while((temp.refer).refer!=null){
         temp=temp.refer;
      }
      delete_value=(temp.refer).node;
      temp.refer=null;
      return delete_value;
    }
    else{
        delete_value=head.node;
        linkedlist.head=null;
        return delete_value;
    }
}
else{
    return -1;
}
     
}
static void print (linkedlist temp){// print the elements
    if(temp!=null){
        System.out.print("[");
    while((temp).refer!=null){
        System.out.printf("%d,",(temp.node));
        temp=temp.refer;
     }
     System.out.printf("%d",(temp.node));
     System.out.print("]");
     return;
}
    System.out.print("[]");
}
static int lenght(linkedlist temp){// return the lenght of element
    int number=0;
    while(temp!=null){
        number+=1;
        temp=temp.refer;
     }
     return number;  
}

}
 