public class Test_BobThere extends GenericTestHarness
{
	
	public static void case10() {
		  assertEquals(false, BobThere.bobThere("bbc"));
	}

	
	public static void case5() {
		  assertEquals(false, BobThere.bobThere("abcdefb"));
	}

	
	public static void case2() {
		  assertEquals(true, BobThere.bobThere("b9b"));
	}

	
	public static void case9() {
		  assertEquals(true, BobThere.bobThere("b12b1b"));
	}

	
	public static void case8() {
		  assertEquals(true, BobThere.bobThere("b1b"));
	}

	
	public static void case1() {
		  assertEquals(true, BobThere.bobThere("abcbob"));
	}

	
	public static void case7() {
		  assertEquals(false, BobThere.bobThere("b12"));
	}

	
	public static void case6() {
		  assertEquals(true, BobThere.bobThere("123abcbcdbabxyz"));
	}

	
	public static void case13() {
		  assertEquals(false, BobThere.bobThere("b"));
	}

	
	public static void case12() {
		  assertEquals(false, BobThere.bobThere("bb"));
	}

	
	public static void case4() {
		  assertEquals(true, BobThere.bobThere("bbb"));
	}

	
	public static void case11() {
		  assertEquals(true, BobThere.bobThere("bbb"));
	}

	
	public static void case3() {
		  assertEquals(false, BobThere.bobThere("bac"));
	}

	public static void main(String[] args) {
		case10();
		case5();
		case2();
		case9();
		case8();
		case1();
		case7();
		case6();
		case13();
		case12();
		case4();
		case11();
		case3();
	}
}
