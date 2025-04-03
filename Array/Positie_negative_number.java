public class Positie_negative_number {
    public static boolean Positie_negative_number(int n){
        if(n==0){
           return true;
        }else if(n>0){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        int n = 0;
        if(Positie_negative_number(n)){
            System.out.println("Postive number");
        }else{
            System.out.println("negative number");
        }
        
    }
    
}
