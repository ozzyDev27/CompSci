public class Test_Only14 extends GenericTestHarness
{
	
	public static void case1() {
		  assertEquals(true, Only14.only14(new int[] {1, 4, 1, 4}));
	}

	
	public static void case2() {
		  assertEquals(false, Only14.only14(new int[] {1, 4, 2, 4}));
	}

	
	public static void case13() {
		  assertEquals(true, Only14.only14(new int[] {1, 1, 1}));
	}

	
	public static void case3() {
		  assertEquals(true, Only14.only14(new int[] {1, 1}));
	}

	
	public static void case4() {
		  assertEquals(true, Only14.only14(new int[] {4, 1}));
	}

	
	public static void case5() {
		  assertEquals(false, Only14.only14(new int[] {2}));
	}

	
	public static void case6() {
		  assertEquals(false, Only14.only14(new int[] {}));
	}

	
	public static void case7() {
		  assertEquals(false, Only14.only14(new int[] {1, 4, 1, 3}));
	}

	
	public static void case8() {
		  assertEquals(false, Only14.only14(new int[] {3, 1, 3}));
	}

	
	public static void case9() {
		  assertEquals(true, Only14.only14(new int[] {1}));
	}

	
	public static void case10() {
		  assertEquals(true, Only14.only14(new int[] {4}));
	}

	
	public static void case14() {
		  assertEquals(false, Only14.only14(new int[] {1, 1, 1, 5}));
	}

	
	public static void case11() {
		  assertEquals(false, Only14.only14(new int[] {3, 4}));
	}

	
	public static void case12() {
		  assertEquals(false, Only14.only14(new int[] {1, 3, 4}));
	}

	
	public static void case15() {
		  assertEquals(true, Only14.only14(new int[] {4, 1, 4, 1}));
	}

	public static void main(String[] args) {
		case1();
		case2();
		case13();
		case3();
		case4();
		case5();
		case6();
		case7();
		case8();
		case9();
		case10();
		case14();
		case11();
		case12();
		case15();
	}
}