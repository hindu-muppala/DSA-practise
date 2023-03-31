package percom;

public class percom2 {
    public static void main(String[] args){
        char c='a'+('3'-'2')*2;
       // System.out.print(c);
      Unprocessed("","89");
    }
    static void Unprocessed(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }  
      char ch=u.charAt(0);
      if(ch>54){
        if(ch==55){
     for(int i=0;i<4;i++){
      Unprocessed( p+(char) (112+i), u.substring(1));
     }}
     else if(ch==56){
          for(int i=0;i<3;i++){
     Unprocessed( p+(char) (116+i), u.substring(1));
     }
     }
     else{
          for(int i=0;i<4;i++){
     Unprocessed( p+(char) (119+i), u.substring(1));
    
     }
     }
    }
    else{
       for(int i=0;i<3;i++){
      //  char f=(char) ('a'+(ch-'2')*3+i);
        Unprocessed( p+(char) ('a'+(ch-'2')*3+i), u.substring(1));
       }
    }
    }
}
