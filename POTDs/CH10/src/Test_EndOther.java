public class Test_EndOther extends GenericTestHarness
{
	
	public static void case14() {
		  assertEquals(true, EndOther.endOther("ab", "12ab"));
	}

	
	public static void case13() {
		  assertEquals(false, EndOther.endOther("ab", "ab12"));
	}

	
	public static void case11() {
		  assertEquals(true, EndOther.endOther("12", "12"));
	}

	
	public static void case10() {
		  assertEquals(true, EndOther.endOther("Z", "12xz"));
	}

	
	public static void case9() {
		  assertEquals(false, EndOther.endOther("yz", "12xz"));
	}

	
	public static void case8() {
		  assertEquals(true, EndOther.endOther("xyz", "12xyz"));
	}

	
	public static void case7() {
		  assertEquals(true, EndOther.endOther("abc", "abc"));
	}

	
	public static void case5() {
		  assertEquals(true, EndOther.endOther("Hiabc", "bc"));
	}

	
	public static void case6() {
		  assertEquals(false, EndOther.endOther("Hiabcx", "bc"));
	}

	
	public static void case4() {
		  assertEquals(false, EndOther.endOther("Hiabc", "abcd"));
	}

	
	public static void case3() {
		  assertEquals(true, EndOther.endOther("abc", "abXabc"));
	}

	
	public static void case2() {
		  assertEquals(true, EndOther.endOther("AbC", "HiaBc"));
	}

	
	public static void case1() {
		  assertEquals(true, EndOther.endOther("Hiabc", "abc"));
	}

	
	public static void case12() {
		  assertEquals(false, EndOther.endOther("abcXYZ", "abcDEF"));
	}

	public static void main(String[] args) {
		case14();
		case13();
		case11();
		case10();
		case9();
		case8();
		case7();
		case5();
		case6();
		case4();
		case3();
		case2();
		case1();
		case12();
	}
}
