import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int n){
        int rev = 0;
        int dup= n;
        while(n>0){
            int ld = n%10;  //get the last digit and store the into ld
            rev = (rev*10)+ld; //update the revnum by multiplying it by 10 and add them in ld
            n = n/10;  // update by n integer division with 10 effectively removing the last digit
        }
        if(dup == rev){
            return true;
        }
return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPalindrome(n)){System.out.println(" no is palindrome");
    }else{System.out.println("not palindrome");}
        
    }

    
}

