import java.util.Arrays;

public class Quest3 {
    public static void swapFirstLast(int[] arr) {
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(a));        
        swapFirstLast(a);
        System.out.println(Arrays.toString(a));        
    }
}