import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str+" ";
        String word="";
        String reverse="";
        //i am girl ;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
               word=word+ch;
            }
            else {
                 reverse = word+" "+reverse;
                 word="";
            }
        }
        System.out.println(reverse);
    }
}
