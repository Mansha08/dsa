package Bit_Manipulation;

public class Appear_Odd_Times {
    public static int Odd(int nums[]){
        int xor = 0;
        for(int i = 0;i< nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[] = {4, 2,1,2,1};
        System.out.println(Odd(nums));
        

    }
    
}
