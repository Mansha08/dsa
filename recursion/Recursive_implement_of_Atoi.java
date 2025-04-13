package recursion;

import java.util.*;

public class Recursive_implement_of_Atoi {
    public static int myAtoi(String s){
        s = s.trim(); // remove whitespace
        int sign = 1;
      int  i =0;
      long res = 0;
      if(s.length() == 0)
      return 0;

      if(s.charAt(0) == '-' ){
        sign = -1;
        i++;
      }else if(s.charAt(0) == '+'){
        i++;

      }
      while(i <s.length()){
        char ch = s.charAt(i);
        if(ch < '0' || ch > '9')
        break;

        res = res*10+(ch - '0');
        if(sign * res  > Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
        if(sign*res < Integer.MIN_VALUE)
        return Integer.MIN_VALUE;

        i++;
      }
      return (int) (sign * res);

    }
    public static void main(String[] args) {
        String s = "42";
        String s1 = "-042";
        String s2 = "1337c0d3";
        String s3 = "0-1";
        System.out.println(myAtoi(s));
        System.out.println(myAtoi(s1));
        System.out.println(myAtoi(s2));
        System.out.println(myAtoi(s3));
    }
}
