public class Test_WithoutX extends GenericTestHarness
{
	
	public static void case1() {
		  assertEquals("Hi", WithoutX.withoutX("xHix"));
	}

	
	public static void case2() {
		  assertEquals("Hi", WithoutX.withoutX("xHi"));
	}

	
	public static void case3() {
		  assertEquals("Hxi", WithoutX.withoutX("Hxix"));
	}

	
	public static void case4() {
		  assertEquals("Hi", WithoutX.withoutX("Hi"));
	}

	
	public static void case5() {
		  assertEquals("xHi", WithoutX.withoutX("xxHi"));
	}

	
	public static void case6() {
		  assertEquals("Hi", WithoutX.withoutX("Hix"));
	}

	
	public static void case7() {
		  assertEquals("axb", WithoutX.withoutX("xaxbx"));
	}

	
	public static void case8() {
		  assertEquals("", WithoutX.withoutX("xx"));
	}

	
	public static void case9() {
		  assertEquals("", WithoutX.withoutX("x"));
	}

	
	public static void case10() {
		  assertEquals("", WithoutX.withoutX(""));
	}

	
	public static void case11() {
		  assertEquals("Hello", WithoutX.withoutX("Hello"));
	}

	
	public static void case12() {
		  assertEquals("Hexllo", WithoutX.withoutX("Hexllo"));
	}

	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		case5();
		case6();
		case7();
		case8();
		case9();
		case10();
		case11();
		case12();
	}
}