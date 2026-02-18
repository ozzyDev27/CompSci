public class Test_DoubleX {
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        testsPassed += test_doubleX("Typical", "axxbb", true);
        testsPassed += test_doubleX("Interrupted", "axaxax", false);
        testsPassed += test_doubleX("At Start", "xxabc", true);
        testsPassed += test_doubleX("At End", "abcxx", true);
        testsPassed += test_doubleX("Capitalized", "abcXXdef", true);
        testsPassed += test_doubleX("Alternating Cases", "abcXxdef", true);
        testsPassed += test_doubleX("All X", "xxxxx", true);
        testsPassed += test_doubleX("No X", "abc", false);
        testsPassed += test_doubleX("Empty String", "", false);
        testsPassed += test_doubleX("Only 1 X", "x", false);
        testsPassed += test_doubleX("Only 1 Non-X", "A", false);


        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_doubleX(String testName, String inputStr, boolean expected) {
        totalTests++;
        try {
            boolean result = DoubleX.doubleX(inputStr);
            System.out.print(result == expected ? "Passed: " : "Failed: ");
            System.out.println(testName);
            return result == expected ? 1 : 0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
