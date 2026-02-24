public class Test_StringX{
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        // Black Box tests:
        testsPassed += test_stringX("Only Within", "abxxxcd", "abcd");
        testsPassed += test_stringX("Only Without", "xabcdx", "xabcdx");
        testsPassed += test_stringX("No X's", "abcd", "abcd");
        testsPassed += test_stringX("Within and Without", "xabxxcdx", "xabcdx");
        testsPassed += test_stringX("Next to the Outside X's", "xxabcdxx", "xabcdx");
        testsPassed += test_stringX("No inside", "xx", "xx");
        testsPassed += test_stringX("Empty String", "", "");

        // White Box tests:
        testsPassed += test_stringX("Just one", "x", "x");
        testsPassed += test_stringX("Just one starting", "xabc", "xabc");
        testsPassed += test_stringX("Just one ending", "abcx", "abcx");
        
        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_stringX(String testName, String inputStr, String expected) {
        totalTests++;
        try {
            String result = StringX.stringX(inputStr);
            System.out.print(result.equals(expected)?"Passed: ":"Failed: ");
            System.out.println(testName);
            return result.equals(expected)?1:0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
