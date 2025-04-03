import java.util.Scanner;

public class Pattern {
    public static void Pattern1(int n) {// square no of n stars
        for (int i = 0; i < n; i++) {         //***/
                                              //***/
            for (int j = 0; j < n; j++) {    //***/
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Pattern2(int n) {
        for (int i = 0; i < n; i++) { //    *****
                                      //    ****
            for (int j = i; j < n; j++) { //***
                System.out.print("*");//  **
            }                            // *         
            System.out.println();
        }
    }

    public static void Pattern3(int n) {// 
        for (int i = 0; i < n; i++) { //      *
                                      //      **
            for (int j = 0; j <= i; j++) { // ***
                System.out.print("*"); //   ****
            } // *****
            System.out.println();
        }
    }

    public static void Pattern4(int n) {
        for (int i = 1; i <= n; i++) {     // 1
                                           // 1 2
            for (int j = 1; j <= i; j++) { // 1 2 3
                System.out.print(j);       // 1 2 3 4
            } // 1 2 3 4 5
            System.out.println();
        }
    }

    public static void Pattern5(int n) {
        for (int i = 1; i <= n; i++) {        // 12345
                                              // 123
            for (int j = 1; j <=n-i+1; j++) { // 12
                System.out.print(j);          // 1
            } // 1 2 3 4 5
            System.out.println();
        }
    }

    public static void Pattern6(int n) {
        for (int i = 1; i <= n; i++) {        // 1
                                              // 22
            for (int j = 1; j <=i; j++) {     // 333
                System.out.print(i);          // 4444
            } 
            // 1 2 3 4 5
            System.out.println();
        }
    }

    public static void Pattern7(int n) {
        for (int i = 0; i < n; i++) {        //  *
                                              //***
            for (int j = 0; j <n-i-1; j++) { //***** /
                System.out.print(" ");   // ******* /
            } 
            for(int j =0;j<2*i+1;j++){
                System.out.print("*");
            }
            for (int j = 0; j <n-i-1; j++) {   
                System.out.print(" ");
            } 
            System.out.println();
        }
    }

    public static void Pattern8(int n) {// opposite no of n stars
        for (int i = 0; i < n; i++) {        //  *******
                                              //  *****
            for (int j = 0; j <i; j++) { //        *** 
                System.out.print(" ");   //       * 
            } 
            for(int j =0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {   
                System.out.print(" ");
            } 
            System.out.println();
        }
    }
    public static void countn(int n){
        int count =0;
        while(n>0){
           count= count+1;
           
            n /=10;
            
        }
        System.out.println(count);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Pattern1(n);
        // Pattern2(n);
        // Pattern3(n);
        //Pattern4(n);
       // Pattern5(n);
      // Pattern6(n);
      //Pattern7(n);
    //  Pattern8(n);
    countn(n);

    }

}
