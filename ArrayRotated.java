import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayRotated{
    static void rotated(int arr[], int s){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
            System.out.println(arr[i]+ " ");
        }
        arr[n-1]=s;
        System.out.println(arr[n-1]);
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,7,5,9};
        int s=arr[0];
        rotated(arr, s);

    }
}
