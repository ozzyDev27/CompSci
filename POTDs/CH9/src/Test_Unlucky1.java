public class Test_Unlucky1 extends GenericTestHarness
{
	
	public static void case1() {
		  assertEquals(true, Unlucky1.unlucky1(new int[]{1, 3, 4, 5}));
	}

	
	public static void case2() {
		  assertEquals(true, Unlucky1.unlucky1(new int[]{2, 1, 3, 4, 5}));
	}

	
	public static void case3() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}));
	}

	
	public static void case4() {
		  assertEquals(true, Unlucky1.unlucky1(new int[]{1, 3, 1}));
	}

	
	public static void case5() {
		  assertEquals(true, Unlucky1.unlucky1(new int[]{1, 1, 3}));
	}

	
	public static void case6() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{1, 2, 3}));
	}

	
	public static void case7() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{3, 3, 3}));
	}

	
	public static void case13() {
		  assertEquals(true, Unlucky1.unlucky1(new int[]{1, 1, 3, 1, 1}));
	}

	
	public static void case8() {
		  assertEquals(true, Unlucky1.unlucky1(new int[]{1, 3}));
	}

	
	public static void case9() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{1, 4}));
	}

	
	public static void case10() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{1}));
	}

	
	public static void case11() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{}));
	}

	
	public static void case12() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1, 3, 1}));
	}

	
	public static void case14() {
		  assertEquals(true, Unlucky1.unlucky1(new int[]{1, 1, 1, 1, 3}));
	}

	
	public static void case15() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{1, 4, 1, 5}));
	}

	
	public static void case16() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 2, 3}));
	}

	
	public static void case17() {
		  assertEquals(false, Unlucky1.unlucky1(new int[]{2, 3, 2, 1}));
	}

	
	public static void case18() {
		  assertEquals(true, Unlucky1.unlucky1(new int[]{2, 3, 1, 3}));
	}

	
	public static void case19() {
		  assertEquals(true, Unlucky1.unlucky1(new int[]{1, 2, 3, 4, 1, 3}));
	}

	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		case5();
		case6();
		case7();
		case13();
		case8();
		case9();
		case10();
		case11();
		case12();
		case14();
		case15();
		case16();
		case17();
		case18();
		case19();
	}
}