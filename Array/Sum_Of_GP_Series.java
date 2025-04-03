public class Sum_Of_GP_Series {

public static float Sum_Of_GP_Series(float a , float r, int n ){
    float sum = (a*((float)Math.pow(r, n)-1));
    return sum;
}


    public static void main(String[] args) {
        
       double result =  Sum_Of_GP_Series(2,2 , 4);
       System.err.println(result);
    }
    
}
