class Count_occure{
    public static int occure(int n,int arr[],int x){
        int count = 0;
        for(int i =0;i<n;i++){
            if(arr[i] ==x){
                count++;
            }
        }
        return count;
    }
public static void main(String[] args) {
    int n =7;
    int x =4;
    int arr[]={2,2,3,3,3,3,4};
    System.out.println(occure(n, arr, x));
    
}
}