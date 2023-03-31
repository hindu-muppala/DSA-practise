package percom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class percom {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
     //   System.out.print(Unprocessed("", in.next()));
     System.out.print('1'+1);
   // percom.Unprocessed("",in.next());
  // System.out.print(RETURN("",in.next() ));
  ArrayList<String> st=new ArrayList<>();
  String s=in.next();
//   for(int i=0;i<(s.length());i++){
//     ArrayList<String> du=new ArrayList<>();
//     for(int j=0;j<(st.size());j++){
//         String g=st.get(j);
//       for(int k=0;k<=(g.length());k++){
//        du.add(g.substring(0,k)+s.charAt(i)+g.substring(i));
//       }
//        }
//       st=du;
//   }
  System.out.print(RETURN_COUNT("", s));
    }
    static void Unprocessed(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }  
      
       for(int i=0;i<=(p.length());i++){
        Unprocessed(p.substring(0,i) + (u.charAt(0))+p.substring(i), u.substring(1));
       }
    }
    static ArrayList<String> RETURN(String p, String u){
        ArrayList<String> s= new ArrayList<>();
        if (u.isEmpty()) {
           s.add(p);
            return s;
        }  
      
       for(int i=0;i<=(p.length());i++){
        s.addAll(RETURN(p.substring(0,i) + (u.charAt(0))+p.substring(i), u.substring(1)));
       }
       return s;
    }
    static int RETURN_COUNT(String p, String u){
        if (u.isEmpty()) {
          return 1;
        }  
      int sum=0;
       for(int i=0;i<=(p.length());i++){
        sum+=(RETURN_COUNT(p.substring(0,i) + (u.charAt(0))+p.substring(i), u.substring(1)));
       }
       return sum;
    }
    }
