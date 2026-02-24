public class Test_DeFront extends GenericTestHarness
{
	
	public static void case13() {
		  assertEquals("zz", DeFront.deFront("bazz"));
	}

	
	public static void case14() {
		  assertEquals("", DeFront.deFront("ba"));
	}

	
	public static void case15() {
		  assertEquals("abxyz", DeFront.deFront("abxyz"));
	}

	
	public static void case16() {
		  assertEquals("", DeFront.deFront("hi"));
	}

	
	public static void case17() {
		  assertEquals("s", DeFront.deFront("his"));
	}

	
	public static void case18() {
		  assertEquals("", DeFront.deFront("xz"));
	}

	
	public static void case19() {
		  assertEquals("z", DeFront.deFront("zzz"));
	}

	
	public static void case21() {
		  assertEquals("b", DeFront.deFront("cb"));
	}

	
	public static void case20() {
		  assertEquals("a", DeFront.deFront("ac"));
	}

	
	public static void case10() {
		  assertEquals("aa", DeFront.deFront("aaa"));
	}

	
	public static void case11() {
		  assertEquals("bc", DeFront.deFront("xbc"));
	}

	
	public static void case12() {
		  assertEquals("bb", DeFront.deFront("bbb"));
	}

	
	public static void case1() {
		  assertEquals("llo", DeFront.deFront("Hello"));
	}

	
	public static void case2() {
		  assertEquals("va", DeFront.deFront("java"));
	}

	
	public static void case3() {
		  assertEquals("aay", DeFront.deFront("away"));
	}

	
	public static void case4() {
		  assertEquals("ay", DeFront.deFront("axy"));
	}

	
	public static void case5() {
		  assertEquals("abc", DeFront.deFront("abc"));
	}

	
	public static void case6() {
		  assertEquals("by", DeFront.deFront("xby"));
	}

	
	public static void case7() {
		  assertEquals("ab", DeFront.deFront("ab"));
	}

	
	public static void case8() {
		  assertEquals("a", DeFront.deFront("ax"));
	}

	
	public static void case9() {
		  assertEquals("ab", DeFront.deFront("axb"));
	}

	public static void main(String[] args) {
		case13();
		case14();
		case15();
		case16();
		case17();
		case18();
		case19();
		case21();
		case20();
		case10();
		case11();
		case12();
		case1();
		case2();
		case3();
		case4();
		case5();
		case6();
		case7();
		case8();
		case9();
	}
}