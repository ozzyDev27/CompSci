public class Test_CountXX {
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        // Black Box tests:
        testsPassed += test_countXX("Typical", "abcxxdef", 1);
        testsPassed += test_countXX("At End", "helloxx", 1);
        testsPassed += test_countXX("At Start", "xxhello", 1);
        testsPassed += test_countXX("One X", "x", 0);
        testsPassed += test_countXX("Triple X", "axxxb", 2);
        testsPassed += test_countXX("Quadruple X", "axxxxb", 3);
        testsPassed += test_countXX("No XX", "abc", 0);
        testsPassed += test_countXX("Empty String", "", 0);
        testsPassed += test_countXX("Interrupted X", "abxcdx", 0);

        // White Box tests:
        testsPassed += test_countXX("Capitalized", "abcXXdef", 1);
        testsPassed += test_countXX("Alternating Cases", "abcXxdef", 1);


        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_countXX(String testName, String inputStr, int expected) {
        totalTests++;
        try {
            int result = CountXX.countXX(inputStr);
            System.out.print(result == expected ? "Passed: " : "Failed: ");
            System.out.println(testName);
            return result == expected ? 1 : 0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
