public class BunnyEars 
{
	public static int bunnyEars(int bunnies)
	{
		if (bunnies>1) return 2 + bunnyEars(bunnies-1);
        else return bunnies+2;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}