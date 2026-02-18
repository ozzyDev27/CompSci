public class Test_FrontAgain {
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        // Black Box
        testsPassed += test_frontAgain("Typical True", "edited", true);
        testsPassed += test_frontAgain("Typical False", "edit", false);
        testsPassed += test_frontAgain("Single Char", "a", false);
        testsPassed += test_frontAgain("Two Chars", "ed", true);
        testsPassed += test_frontAgain("Three Chars Unique", "ede", false);
        testsPassed += test_frontAgain("Three Chars Similar", "xxx", true);
        testsPassed += test_frontAgain("Empty String", "", false);

        // White Box


        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_frontAgain(String testName, String inputStr, boolean expected) {
        totalTests++;
        try {
            boolean result = FrontAgain.frontAgain(inputStr);
            System.out.print(result == expected ? "Passed: " : "Failed: ");
            System.out.println(testName);
            return result == expected ? 1 : 0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
