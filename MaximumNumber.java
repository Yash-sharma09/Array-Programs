public class MaximumNumber {
    static int getmax(int arr[],int n){
        int max= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    
    }
    public static void main(String[] args) {
        int arr[]={11,9,4,9,10,15};
        int n = arr.length;
        int max = getmax(arr, n);
        System.out.println(max);
    }
}
