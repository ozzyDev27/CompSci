public class Test_Without2 extends GenericTestHarness
{
	
	public static void case5() {
		  assertEquals("x", Without2.without2("xxx"));
	}

	
	public static void case4() {
		  assertEquals("Chocolate", Without2.without2("Chocolate"));
	}

	
	public static void case7() {
		  assertEquals("x", Without2.without2("x"));
	}

	
	public static void case2() {
		  assertEquals("HelloHi", Without2.without2("HelloHi"));
	}

	
	public static void case3() {
		  assertEquals("", Without2.without2("Hi"));
	}

	
	public static void case8() {
		  assertEquals("", Without2.without2(""));
	}

	
	public static void case1() {
		  assertEquals("lloHe", Without2.without2("HelloHe"));
	}

	
	public static void case6() {
		  assertEquals("", Without2.without2("xx"));
	}

	
	public static void case9() {
		  assertEquals("Fruits", Without2.without2("Fruits"));
	}

	public static void main(String[] args) {
		case5();
		case4();
		case7();
		case2();
		case3();
		case8();
		case1();
		case6();
		case9();
	}
}