public class Test_XYZThere extends GenericTestHarness
{
	
	public static void case11() {
		  assertEquals(false, XYZThere.xyzThere(".xyz"));
	}

	
	public static void case8() {
		  assertEquals(false, XYZThere.xyzThere(""));
	}

	
	public static void case6() {
		  assertEquals(false, XYZThere.xyzThere("xy"));
	}

	
	public static void case5() {
		  assertEquals(true, XYZThere.xyzThere("xyz"));
	}

	
	public static void case4() {
		  assertEquals(false, XYZThere.xyzThere("abcxy"));
	}

	
	public static void case3() {
		  assertEquals(true, XYZThere.xyzThere("xyz.abc"));
	}

	
	public static void case2() {
		  assertEquals(false, XYZThere.xyzThere("abc.xyz"));
	}

	
	public static void case1() {
		  assertEquals(true, XYZThere.xyzThere("abcxyz"));
	}

	
	public static void case7() {
		  assertEquals(false, XYZThere.xyzThere("x"));
	}

	
	public static void case10() {
		  assertEquals(true, XYZThere.xyzThere("abc.xxyz"));
	}

	
	public static void case9() {
		  assertEquals(true, XYZThere.xyzThere("abc.xyzxyz"));
	}

	
	public static void case14() {
		  assertEquals(false, XYZThere.xyzThere("1.xyz.xyz2.xyz"));
	}

	
	public static void case13() {
		  assertEquals(true, XYZThere.xyzThere("12xyz"));
	}

	
	public static void case12() {
		  assertEquals(false, XYZThere.xyzThere("12.xyz"));
	}

	public static void main(String[] args) {
		case11();
		case8();
		case6();
		case5();
		case4();
		case3();
		case2();
		case1();
		case7();
		case10();
		case9();
		case14();
		case13();
		case12();
	}
}
