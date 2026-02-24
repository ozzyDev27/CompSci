public class Test_StartWord extends GenericTestHarness
{
	
	public static void case1() {
		  assertEquals("hi", StartWord.startWord("hippo", "hi"));
	}

	
	public static void case2() {
		  assertEquals("hip", StartWord.startWord("hippo", "xip"));
	}

	
	public static void case3() {
		  assertEquals("h", StartWord.startWord("hippo", "i"));
	}

	
	public static void case4() {
		  assertEquals("", StartWord.startWord("hippo", "ix"));
	}

	
	public static void case5() {
		  assertEquals("", StartWord.startWord("h", "ix"));
	}

	
	public static void case6() {
		  assertEquals("", StartWord.startWord("", "i"));
	}

	
	public static void case7() {
		  assertEquals("hi", StartWord.startWord("hip", "zi"));
	}

	
	public static void case8() {
		  assertEquals("hip", StartWord.startWord("hip", "zip"));
	}

	
	public static void case9() {
		  assertEquals("", StartWord.startWord("hip", "zig"));
	}

	
	public static void case10() {
		  assertEquals("h", StartWord.startWord("h", "z"));
	}

	
	public static void case11() {
		  assertEquals("hippo", StartWord.startWord("hippo", "xippo"));
	}

	
	public static void case12() {
		  assertEquals("", StartWord.startWord("hippo", "xyz"));
	}

	
	public static void case13() {
		  assertEquals("hip", StartWord.startWord("hippo", "hip"));
	}

	
	public static void case14() {
		  assertEquals("kit", StartWord.startWord("kitten", "cit"));
	}

	
	public static void case15() {
		  assertEquals("kit", StartWord.startWord("kit", "cit"));
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
		case13();
		case14();
		case15();
	}
}