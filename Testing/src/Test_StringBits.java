public class Test_StringBits {
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        // Black Box tests:
        testsPassed += test_stringBits("Typical", "Hello", "Hlo");
        testsPassed += test_stringBits("Two Chars", "Hi", "H");
        testsPassed += test_stringBits("Longer String", "Heeololeo", "Hello");
        testsPassed += test_stringBits("Empty String", "", "");

        // White Box tests:
        testsPassed += test_stringBits("Single Char", "A", "A");


        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_stringBits(String testName, String inputStr, String expected) {
        totalTests++;
        try {
            String result = StringBits.stringBits(inputStr);
            System.out.print(result.equals(expected) ? "Passed: " : "Failed: ");
            System.out.println(testName);
            return result.equals(expected) ? 1 : 0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
