import java.util.Arrays;

public class Test_Make2 extends GenericTestHarness
{
	
	public static void case10() {
		  int[] output = Make2.make2(new int[]{7, 8}, new int[]{1, 2, 3});
  int[] expected = {7, 8};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case3() {
		  int[] output = Make2.make2(new int[]{}, new int[]{1, 2});
  int[] expected = {1, 2};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case8() {
		  int[] output = Make2.make2(new int[]{1}, new int[]{1});
  int[] expected = {1, 1};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case1() {
		  int[] output = Make2.make2(new int[]{4, 5}, new int[]{1, 2, 3});
  int[] expected = {4, 5};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case2() {
		  int[] output =Make2.make2(new int[]{4}, new int[]{1, 2, 3});
  int[] expected = {4, 1};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case4() {
		  int[] output = Make2.make2(new int[]{1, 2}, new int[]{});
  int[] expected = {1, 2};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case5() {
		  int[] output = Make2.make2(new int[]{3}, new int[]{1, 2, 3});
  int[] expected = {3, 1};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case6() {
		  int[] output = Make2.make2(new int[]{3}, new int[]{1});
  int[] expected = {3, 1};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case7() {
		  int[] output = Make2.make2(new int[]{3, 1, 4}, new int[]{});
  int[] expected = {3, 1};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case9() {
		  int[] output = Make2.make2(new int[]{1, 2, 3}, new int[]{7, 8});
  int[] expected = {1, 2};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case11() {
		  int[] output = Make2.make2(new int[]{7}, new int[]{1, 2, 3});
  int[] expected = {7, 1};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	
	public static void case12() {
		  int[] output = Make2.make2(new int[]{5, 4}, new int[]{2, 3, 7});
  int[] expected = {5, 4};
  boolean test = Arrays.equals(output, expected);
  assertEquals(true, test);
	}

	public static void main(String[] args) {
		case10();
		case3();
		case8();
		case1();
		case2();
		case4();
		case5();
		case6();
		case7();
		case9();
		case11();
		case12();
	}
}