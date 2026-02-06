public class DoubleX extends GenericTestHarness
{
    public static void main(String[] args) {
        assertEquals(true,doubleX("axxbb"));
        assertEquals(false,doubleX("axaxax"));
        assertEquals(true,doubleX("xxxxx"));
    }

    public static boolean doubleX(String str)
    {
        for (int i=0; i<str.length()-1; i++) {
            if (str.charAt(i)=='x' && str.charAt(i+1)=='x') {
                return true;
            }
        }
        return false;
    }
}