public class Test_SeeColor {
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        testsPassed += test_seeColor("Red", "redxx", "red");
        testsPassed += test_seeColor("Blue", "blueTimes", "blue");
        testsPassed += test_seeColor("Color Inside", "aabblueaa", "");
        testsPassed += test_seeColor("No Color", "pikachu", "");
        testsPassed += test_seeColor("Capitalized Blue", "BLUEpika", "blue");
        testsPassed += test_seeColor("Alternating Case Red", "reDa", "red");
        testsPassed += test_seeColor("Empty String", "", "");
        testsPassed += test_seeColor("Just Red", "red", "red");
        testsPassed += test_seeColor("Just Blue", "blue", "blue");

        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_seeColor(String testName, String inputStr, String expected) {
        totalTests++;
        try {
            String result = SeeColor.seeColor(inputStr);
            System.out.print(result.equals(expected) ? "Passed: " : "Failed: ");
            System.out.println(testName);
            return result.equals(expected) ? 1 : 0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
