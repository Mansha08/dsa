import java.util.Scanner;

public class String_count_v_w_s {

    public static void count(String str, int length) {
        int v = 0;
        int c = 0;
        int s = 0;
        str = str.toLowerCase();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                v++;
            else if (ch >= 'a' && ch <= 'z') 
                c++;
             else if (ch == ' ') 
                s++;

        }    
            System.out.println("v " + v);
            System.out.println("c " + c);
            System.out.println("s " + s);
        
    }

    public static void main(String[] args) {
        
        String str = "Take u forward is Awesome";
        int length = str.length();
        count(str,length);
    }

}
