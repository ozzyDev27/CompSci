public class Test_StringTimes{
    private static int totalTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        int testsPassed = 0;

        // Black Box tests:
        testsPassed += test_stringTimes("Typical", "Pikachu", 3, "PikachuPikachuPikachu");
        testsPassed += test_stringTimes("Single Time", "Pikachu", 1, "Pikachu");
        testsPassed += test_stringTimes("Zero Times", "Pikachu", 0, "");
        testsPassed += test_stringTimes("Negative Times", "Pikachu", -1, "");
        testsPassed += test_stringTimes("Many Times", "Pikachu", 10, "PikachuPikachuPikachuPikachuPikachuPikachuPikachuPikachuPikachuPikachu");
        testsPassed += test_stringTimes("Many Negative Times", "Pikachu", -10, "");
        testsPassed += test_stringTimes("Empty String", "", 2, "");
        testsPassed += test_stringTimes("1-Char String", "P", 3, "PPP");
        testsPassed += test_stringTimes("Long String", "Pikachu and Bulbasaur and Charmander and Squirtle", 2, "Pikachu and Bulbasaur and Charmander and SquirtlePikachu and Bulbasaur and Charmander and Squirtle");

        // White Box tests:
        testsPassed += test_stringTimes("Special String", "!@#$", 2, "!@#$!@#$");
        testsPassed += test_stringTimes("Escape Characters", "\n\n\n\n", 2, "\n\n\n\n\n\n\n\n");
        // testsPassed += test_stringTimes("Looots of repeats", "Pikachu", 2147483647, "Big Pikachu");
        
        System.out.println("\n" + testsPassed + " out of " + totalTests + " tests passed!");
    }

    public static int test_stringTimes(String testName, String inputStr, int inputInt, String expected) {
        totalTests++;
        try {
            String result = StringTimes.stringTimes(inputStr, inputInt);
            System.out.print(result.equals(expected)?"Passed: ":"Failed: ");
            System.out.println(testName);
            return result.equals(expected)?1:0;
        } catch (Exception e) {
            System.out.println("Failed: " + testName + " due to exception " + e.getMessage());
            return 0;
        }
    }
}
