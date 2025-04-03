import java.util.Scanner;

class Palindrome_String {
    public static boolean palindro(String str){
        
        for(int i =0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        Scanner sc= new Scanner(System.in);
        str = sc.nextLine();
        System.out.println(palindro(str));
    }
    
}
