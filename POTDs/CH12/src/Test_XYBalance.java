public class Test_XYBalance extends GenericTestHarness
{
	
	public static void case18() {
		  assertEquals(true, XYBalance.xyBalance("12xabxxydxyxyzz"));
	}

	
	public static void case16() {
		  assertEquals(false, XYBalance.xyBalance("yxyxyxyx"));
	}

	
	public static void case14() {
		  assertEquals(false, XYBalance.xyBalance("x"));
	}

	
	public static void case13() {
		  assertEquals(true, XYBalance.xyBalance("y"));
	}

	
	public static void case11() {
		  assertEquals(true, XYBalance.xyBalance("bxyb"));
	}

	
	public static void case10() {
		  assertEquals(false, XYBalance.xyBalance("bxbb"));
	}

	
	public static void case9() {
		  assertEquals(true, XYBalance.xyBalance("bbb"));
	}

	
	public static void case8() {
		  assertEquals(false, XYBalance.xyBalance("xxbx"));
	}

	
	public static void case5() {
		  assertEquals(true, XYBalance.xyBalance("xaxxbby"));
	}

	
	public static void case4() {
		  assertEquals(true, XYBalance.xyBalance("yaaxbby"));
	}

	
	public static void case3() {
		  assertEquals(false, XYBalance.xyBalance("yaaxbb"));
	}

	
	public static void case2() {
		  assertEquals(false, XYBalance.xyBalance("aaxbb"));
	}

	
	public static void case1() {
		  assertEquals(true, XYBalance.xyBalance("aaxbby"));
	}

	
	public static void case17() {
		  assertEquals(true, XYBalance.xyBalance("yxyxyxyxy"));
	}

	
	public static void case6() {
		  assertEquals(false, XYBalance.xyBalance("xaxxbbyx"));
	}

	
	public static void case15() {
		  assertEquals(true, XYBalance.xyBalance(""));
	}

	
	public static void case12() {
		  assertEquals(true, XYBalance.xyBalance("xy"));
	}

	
	public static void case7() {
		  assertEquals(true, XYBalance.xyBalance("xxbxy"));
	}

	public static void main(String[] args) {
		case18();
		case16();
		case14();
		case13();
		case11();
		case10();
		case9();
		case8();
		case5();
		case4();
		case3();
		case2();
		case1();
		case17();
		case6();
		case15();
		case12();
		case7();
	}
}