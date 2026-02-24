public class Test_Last2 {
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        // Black Box tests:
        testsPassed += test_last2("Typical 1", "hixxhi", 1);
        testsPassed += test_last2("Typical 2", "hixhixhi", 2);
        testsPassed += test_last2("Nothing", "abcdhi", 0);
        testsPassed += test_last2("Only Solo Matches", "hihihihihi", 4);
        testsPassed += test_last2("Only Duo Matches", "xxxxxxx", 5);
        testsPassed += test_last2("Next to End", "abcxxx", 1);
        testsPassed += test_last2("Empty String", "", 0);

        // White Box tests:
        testsPassed += test_last2("One Char", "a", 0);
        testsPassed += test_last2("Two Chars", "aa", 0);

        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_last2(String testName, String inputStr, int expected) {
        totalTests++;
        try {
            int result = Last2.last2(inputStr);
            System.out.print(result == expected ? "Passed: " : "Failed: ");
            System.out.println(testName);
            return result == expected ? 1 : 0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
