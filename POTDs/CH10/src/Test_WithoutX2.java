public class Test_WithoutX2 extends GenericTestHarness
{
	
	public static void case6() {
		  assertEquals("axb", WithoutX2.withoutX2("xaxb"));
	}

	
	public static void case1() {
		  assertEquals("Hi", WithoutX2.withoutX2("xHi"));
	}

	
	public static void case2() {
		  assertEquals("Hi", WithoutX2.withoutX2("Hxi"));
	}

	
	public static void case3() {
		  assertEquals("Hi", WithoutX2.withoutX2("Hi"));
	}

	
	public static void case4() {
		  assertEquals("Hi", WithoutX2.withoutX2("xxHi"));
	}

	
	public static void case5() {
		  assertEquals("Hix", WithoutX2.withoutX2("Hix"));
	}

	
	public static void case7() {
		  assertEquals("", WithoutX2.withoutX2("xx"));
	}

	
	public static void case8() {
		  assertEquals("", WithoutX2.withoutX2("x"));
	}

	
	public static void case9() {
		  assertEquals("", WithoutX2.withoutX2(""));
	}

	
	public static void case10() {
		  assertEquals("Hello", WithoutX2.withoutX2("Hello"));
	}

	
	public static void case11() {
		  assertEquals("Hexllo", WithoutX2.withoutX2("Hexllo"));
	}

	
	public static void case12() {
		  assertEquals("Hxllo", WithoutX2.withoutX2("xHxllo"));
	}

	public static void main(String[] args) {
		case6();
		case1();
		case2();
		case3();
		case4();
		case5();
		case7();
		case8();
		case9();
		case10();
		case11();
		case12();
	}
}