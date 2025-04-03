public class Leap_Or_Not {
    public static boolean leap(int year){
        if(year%400 == 0){
            return true;
        }
        if(year%100 == 0){
            return false;
        }
        if(year%4 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int year = 1996;
        if(leap(year) == true){
            System.out.println("leap");
        }else{
            System.out.println("no leap");
        }

    //     if(year%400 == 0){
    //         System.out.println("leap year");
    //     }
    //     if(year%100 == 0){
    //         System.out.println("year is not leap year");
    //     }
    //     if(year%4 == 0){
    //         System.out.println("year is a leap year");
    //     }
    }
    
}
