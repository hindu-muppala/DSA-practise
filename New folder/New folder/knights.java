import java.util.Scanner;

public class knights {
    static int no_items;
    static int count=0;
   public static void main(String[] args) {
    Boolean[][] a={{false,false,false},{false,false,false},{false,false,false}};
    System.out.print("Enter the no of elemnts");
    Scanner in =new Scanner(System.in);
    no_items=in.nextInt();
    Knights(a, 0, 0, 0);
    System.out.print(count);
   } 
  static int Knights(Boolean[][] arr,int r1,int c1,int target){
    if(target==knights.no_items){
        display(arr);
        return 1;
    }
    for(int r=r1;r<(arr.length);r++){
        for(int c=c1;c<(arr[0].length);c++){
           if(safe(arr,r,c)){
            arr[r][c]=true;
            count=count+Knights(arr, r, c, target+1);
            System.out.print("------");
            arr[r][c]=false;
           }
        }
    }
    return 0;
  }
  static Boolean safe(Boolean[][] arr,int r1,int c1){
    if(arr[r1][c1]){
        return false;
    }
    for(int r=0;r<r1;r++){
        for(int c=0;c<c1;c++){
            if(arr[r][c]){
                if((r+1)==r1 && (c+2)==c1 ){
                    return false;
                }
                if((r+2)==r1 && (c+1)==c1 ){
                    return false;
                }
                if( (r+2)==r1 && (c-1)==c1 ){
                    return false;
                }
                if( (r+1)==r1 && (c-2)==c1 ){
                    return false;
                }

            }
        }
    }
    return true;
  }
  static void display(Boolean[][] a){
    for(Boolean[] arr:a){
        for(Boolean i: arr){
            if(i){
                System.out.print("K ");
            }
            else{
                System.out.print("X ");
            }
        }
        System.out.print('\n');
    }
  }
}
