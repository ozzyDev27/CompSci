public class DoubleX
{
    public static void main(String[] args) {
    }

    public static boolean doubleX(String str)
    {
        for (int i=0; i<str.toLowerCase().length()-1; i++) {
            if (str.toLowerCase().charAt(i)=='x' && str.toLowerCase().charAt(i+1)=='x') {
                return true;
            }
        }
        return false;
    }
}