import java.util.ArrayList;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(Unprocessed2("", in.next()));
    }
    static void Unprocessed(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }  Unprocessed(p + (u.charAt(0)), u.substring(1));
        Unprocessed(p, u.substring(1));
    }
    static ArrayList<String> Unprocessed2(String p, String u) {
        ArrayList<String> re = new ArrayList<>();
        if (u.isEmpty()) {
            re.add(p);
            return re;
        }
        re.addAll(Unprocessed2(p + (u.charAt(0)), u.substring(1)));
        re.addAll(Unprocessed2(p, u.substring(1)));
        re.addAll(Unprocessed2(p + ((u.charAt(0)) + 0), u.substring(1)));
        return re;
    }
}
// static ArrayList<Character> string_search(char target,int i){
// ArrayList<Character> add1=new ArrayList<Character>();
// if(target!=(string.a).charAt(i)){
// add1.add((string.a).charAt(i));
// }
// if(i==(string.a).length()-1){
// return add1;
// }
// add1.addAll(string_search(target, ++i));
// return add1;
// }
// static ArrayList<String> add_string(int i,String ch) {
// ArrayList<String> re=new ArrayList<String>();
// if(i==((string.a).length()-1)){
// re.add(ch);
// re.add(ch.substring(0,i));
// return re;
// }

// // System.out.print((string.a).charAt(i-1));

// int index=ch.indexOf((string.a).charAt(i));
// if(ch.length()==1){
// return re;
// }
// String a=ch.substring(0,index)+ch.substring(index+1);
// //
// re.addAll(add_string(i+1,ch.substring(0,ch.indexOf(((string.a).charAt(i))))+ch.substring(ch.indexOf(((string.a).charAt(i)))+1)));
// // System.out.println(ch.substring(ch.indexOf(((string.a).charAt(i)))+1));
// re.addAll(add_string(++i, a));
// re.addAll(add_string((i),ch));

// //
// re.addAll(add_string(i,ch.substring(0,ch.indexOf(((string.a).charAt(i-1))))+ch.substring(ch.indexOf(((string.a).charAt(i-1)))+1)));
// return re;
// }
// }