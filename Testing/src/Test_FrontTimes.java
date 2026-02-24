public class Test_FrontTimes{
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        // Black Box tests:
        testsPassed += test_frontTimes("Typical", "Pikachu", 3, "PikPikPik");
        testsPassed += test_frontTimes("Single Time", "Pikachu", 1, "Pik");
        testsPassed += test_frontTimes("Zero Times", "Pikachu", 0, "");
        testsPassed += test_frontTimes("Negative Times", "Pikachu", -1, "");
        testsPassed += test_frontTimes("Many Times", "Pikachu", 10, "PikPikPikPikPikPikPikPikPikPik");
        testsPassed += test_frontTimes("Many Negative Times", "Pikachu", -10, "");
        testsPassed += test_frontTimes("Empty String", "", 2, "");
        testsPassed += test_frontTimes("1-Char String", "P", 3, "PPP");
        testsPassed += test_frontTimes("2-Char String", "Pi", 2, "PiPi");
        testsPassed += test_frontTimes("3-Char String", "Pik", 2, "PikPik");
        testsPassed += test_frontTimes("4-Char String", "Pika", 2, "PikPik");

        // White Box tests:
        testsPassed += test_frontTimes("Special String", "!@#$", 2, "!@#!@#");
        testsPassed += test_frontTimes("Escape Characters", "\n\n\n\n", 2, "\n\n\n\n\n\n");;
        
        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_frontTimes(String testName, String inputStr, int inputInt, String expected) {
        totalTests++;
        try {
            String result = FrontTimes.frontTimes(inputStr, inputInt);
            System.out.print(result.equals(expected)?"Passed: ":"Failed: ");
            System.out.println(testName);
            return result.equals(expected)?1:0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
