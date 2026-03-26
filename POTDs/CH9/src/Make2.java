public class Make2
{
	public static int[] make2(int[] a, int[] b)
	{
		int[] c = new int[2];
		int idx = 0;

		for (int i = 0; i < a.length && idx < 2; i++)
			c[idx++] = a[i];

		for (int i = 0; i < b.length && idx < 2; i++)
			c[idx++] = b[i];

		return c;
	}

	public static void main(String[] args)
	{
		// System.out.println();
		int[] a = new int[5];
		System.out.println(a.length);
	}
}