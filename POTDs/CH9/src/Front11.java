public class Front11 {
    public static int[] front11(int[] a, int[] b)
	{
		int size = (a.length > 0 ? 1 : 0) + (b.length > 0 ? 1 : 0);
		int[] c = new int[size];
		int d = 0;

		if (a.length > 0) c[d++] = a[0];
		if (b.length > 0) c[d++] = b[0];

		return c;
	}

	public static void main(String[] args)
	{
		System.out.println();
	}

}