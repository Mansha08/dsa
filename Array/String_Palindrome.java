import java.util.Scanner;

public class String_Palindrome {
    public static boolean palindrome( String str) {
        for(int i =0;i<str.length();i++){
       
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        

        System.out.println(palindrome( str));

    }

}
