public class rotatearray {
    public static void main(String[] args) {
        int[] a={8,9,10,11,12,13,14,15,1,2,3,4,5,6,7};
        int search=12;
       int low=0;
int high=a.length-1;
        while(low<high){
            int mid=((low+high)/2);
            if(search==a[mid]){
                System.out.print(mid);
                break;
            }
            else if(a[mid]>search){
                if(a[low]==search){
                    System.out.print(low);
                    break;
                }
                if(a[low]<search){
                    high=mid-1;       
                }
                else{
                    low=mid+1;
                }
            }
            else if(a[mid]<search){
                if(a[high]==search){
                    System.out.print(high);
                    break;
                }
                if(a[high]>=search){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                   
                }
            }
          //  System.out.println(mid);
        }
    }
}
