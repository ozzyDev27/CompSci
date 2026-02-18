public class Test_StringSplosion {
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        testsPassed += test_stringSplosion("Typical", "Pikachu", "PPiPikPikaPikacPikachPikachu");
        testsPassed += test_stringSplosion("Single Char", "X", "X");
        testsPassed += test_stringSplosion("Empty String", "", "");

        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_stringSplosion(String testName, String inputStr, String expected) {
        totalTests++;
        try {
            String result = StringSplosion.stringSplosion(inputStr);
            System.out.print(result.equals(expected) ? "Passed: " : "Failed: ");
            System.out.println(testName);
            return result.equals(expected) ? 1 : 0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
