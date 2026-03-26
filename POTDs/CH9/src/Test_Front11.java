import java.util.Arrays;

public class Test_Front11 extends GenericTestHarness
{
	
	public static void case5() {
		  int[] output = Front11.front11(new int[]{}, new int[]{});
  int[] expected = {};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case1() {
		  int[] output = Front11.front11(new int[]{1, 2, 3}, new int[]{7, 8, 9});
  int[] expected = {1, 7};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case7() {
		  int[] output = Front11.front11(new int[]{1, 4, 1, 9}, new int[]{});
  int[] expected = {1};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case4() {
		  int[] output = Front11.front11(new int[]{}, new int[]{2, 8});
  int[] expected = {2};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case3() {
		  int[] output = Front11.front11(new int[]{1, 7}, new int[]{});
  int[] expected = {1};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case2() {
		  int[] output = Front11.front11(new int[]{1}, new int[]{2});
  int[] expected = {1, 2};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case6() {
		  int[] output = Front11.front11(new int[]{3}, new int[]{1, 4, 1, 9});
  int[] expected = {3, 1};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	public static void main(String[] args) {
		case5();
		case1();
		case7();
		case4();
		case3();
		case2();
		case6();
	}
}