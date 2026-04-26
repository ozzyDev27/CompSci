public class Quest4 {
    public static boolean isUniform(int[] arr) {
        return arr[0]==arr[arr.length-1];
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,1,1,1};
        System.out.println(isUniform(a));
        System.out.println(isUniform(b));        
    }
}