public class Test_CountCode extends GenericTestHarness
{
	
	public static void case14() {
		  assertEquals(3, CountCode.countCode("coAcodeBcoleccoreDD"));
	}

	
	public static void case13() {
		  assertEquals(2, CountCode.countCode("AAcodeBBcoleCCccorfDD"));
	}

	
	public static void case11() {
		  assertEquals(0, CountCode.countCode(""));
	}

	
	public static void case10() {
		  assertEquals(0, CountCode.countCode("c"));
	}

	
	public static void case9() {
		  assertEquals(0, CountCode.countCode("ode"));
	}

	
	public static void case8() {
		  assertEquals(1, CountCode.countCode("code"));
	}

	
	public static void case7() {
		  assertEquals(0, CountCode.countCode("abcxyz"));
	}

	
	public static void case6() {
		  assertEquals(0, CountCode.countCode("cozcop"));
	}

	
	public static void case5() {
		  assertEquals(1, CountCode.countCode("xxcozeyycop"));
	}

	
	public static void case4() {
		  assertEquals(1, CountCode.countCode("cozfxxcope"));
	}

	
	public static void case3() {
		  assertEquals(2, CountCode.countCode("cozexxcope"));
	}

	
	public static void case2() {
		  assertEquals(2, CountCode.countCode("codexxcode"));
	}

	
	public static void case1() {
		  assertEquals(1, CountCode.countCode("aaacodebbb"));
	}

	
	public static void case12() {
		  assertEquals(3, CountCode.countCode("AAcodeBBcoleCCccoreDD"));
	}

	public static void main(String[] args) {
		case14();
		case13();
		case11();
		case10();
		case9();
		case8();
		case7();
		case6();
		case5();
		case4();
		case3();
		case2();
		case1();
		case12();
	}
}
