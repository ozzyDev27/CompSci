/**
* This is not an incredibly robust Generic Test Harness, as it lacks other assertions,
+ but it does what I need it to do in terms of comparisons without the need for JUnit.
*
* Feel free to change it or add your own.
*/
import java.util.Arrays;

public class GenericTestHarness
{
  private static final double EPSILON = 1.0e-10;
  
  public static void assertEquals(int expected, int result)
  {
    if (expected == result){
      printPass();
    }
    else
    {
      printFail(""+expected , ""+result);
    }
  }

  public static void assertEquals(double expected, double result)
  {
    if (Math.abs(expected - result) < EPSILON){
      printPass();
    }
    else
    {
      printFail(""+expected , ""+result);
    }
  }

  public static void assertEquals(long expected, long result)
  {
    if (expected == result){
      printPass();
    }
    else
    {
      printFail(""+expected , ""+result);
    }
  }

  public static void assertEquals(short expected, short result)
  {
    if (expected == result){
      printPass();
    }
    else
    {
      printFail(""+expected , ""+result);
    }
  }

  public static void assertEquals(byte expected, byte result)
  {
    if (expected == result){
      printPass();
    }
    else
    {
      printFail(""+expected , ""+result);
    }
  }

  public static void assertEquals(char expected, char result)
  {
    if (expected == result){
      printPass();
    }
    else
    {
      printFail(""+expected , ""+result);
    }
  }

  public static void assertEquals(float expected, float result)
  {
    if (Math.abs(expected - result) < EPSILON){
      printPass();
    }
    else
    {
      printFail(""+expected , ""+result);
    }
  }

  public static void assertEquals(boolean expected, boolean result)
  {
    if (expected == result){
      printPass();
    }
    else
    {
      printFail(""+expected , ""+result);
    }
  }

  public static void assertEquals(Object expected, Object result)
  {
    if (expected == result || expected != null && result != null && expected.toString().equals(result.toString())){
      printPass();
    }
    else
    {
      printFail(""+expected , ""+result);
    }
  }

  public static void assertArrayEquals(boolean[] expecteds, boolean [] results)
  {
    if (expecteds == null && results != null){
      printFail("NULL", "NOT NULL");
    }else if (expecteds != null && results == null) {
      printFail("NOT NULL", "NULL");
    }else if (expecteds == results){
      printPass();
    }else if (expecteds.length != results.length){
      printFail("Length "+expecteds.length, "Length "+results.length);
    }else{
      String e = Arrays.toString(expecteds);
      String r = Arrays.toString(results);
      if (e.equals(r)){
        printPass();
      } else {
        printFail(e, r);
      }
    }
  }

  public static void assertArrayEquals(byte[] expecteds, byte [] results)
  {
    if (expecteds == null && results != null){
      printFail("NULL", "NOT NULL");
    }else if (expecteds != null && results == null) {
      printFail("NOT NULL", "NULL");
    }else if (expecteds == results){
      printPass();
    }else if (expecteds.length != results.length){
      printFail("Length "+expecteds.length, "Length "+results.length);
    }else{
      String e = Arrays.toString(expecteds);
      String r = Arrays.toString(results);
      if (e.equals(r)){
        printPass();
      } else {
        printFail(e, r);
      }
    }
  }
  
  public static void assertArrayEquals(char[] expecteds, char [] results)
  {
    if (expecteds == null && results != null){
      printFail("NULL", "NOT NULL");
    }else if (expecteds != null && results == null) {
      printFail("NOT NULL", "NULL");
    }else if (expecteds == results){
      printPass();
    }else if (expecteds.length != results.length){
      printFail("Length "+expecteds.length, "Length "+results.length);
    }else{
      String e = Arrays.toString(expecteds);
      String r = Arrays.toString(results);
      if (e.equals(r)){
        printPass();
      } else {
        printFail(e, r);
      }
    }
  }

  public static void assertArrayEquals(int[] expecteds, int [] results)
  {
    if (expecteds == null && results != null){
      printFail("NULL", "NOT NULL");
    }else if (expecteds != null && results == null) {
      printFail("NOT NULL", "NULL");
    }else if (expecteds == results){
      printPass();
    }else if (expecteds.length != results.length){
      printFail("Length "+expecteds.length, "Length "+results.length);
    }else{
      String e = Arrays.toString(expecteds);
      String r = Arrays.toString(results);
      if (e.equals(r)){
        printPass();
      } else {
        printFail(e, r);
      }
    }
  }

  public static void assertArrayEquals(long[] expecteds, long [] results)
  {
    if (expecteds == null && results != null){
      printFail("NULL", "NOT NULL");
    }else if (expecteds != null && results == null) {
      printFail("NOT NULL", "NULL");
    }else if (expecteds == results){
      printPass();
    }else if (expecteds.length != results.length){
      printFail("Length "+expecteds.length, "Length "+results.length);
    }else{
      String e = Arrays.toString(expecteds);
      String r = Arrays.toString(results);
      if (e.equals(r)){
        printPass();
      } else {
        printFail(e, r);
      }
    }
  }

  public static void assertArrayEquals(short[] expecteds, short [] results)
  {
    if (expecteds == null && results != null){
      printFail("NULL", "NOT NULL");
    }else if (expecteds != null && results == null) {
      printFail("NOT NULL", "NULL");
    }else if (expecteds == results){
      printPass();
    }else if (expecteds.length != results.length){
      printFail("Length "+expecteds.length, "Length "+results.length);
    }else{
      String e = Arrays.toString(expecteds);
      String r = Arrays.toString(results);
      if (e.equals(r)){
        printPass();
      } else {
        printFail(e, r);
      }
    }
  }

  public static void assertArrayEquals(Object[] expecteds, Object [] results)
  {
    if (expecteds == null && results != null){
      printFail("NULL", "NOT NULL");
    }else if (expecteds != null && results == null) {
      printFail("NOT NULL", "NULL");
    }else if (expecteds == results){
      printPass();
    }else if (expecteds.length != results.length){
      printFail("Length "+expecteds.length, "Length "+results.length);
    }else{
      String e = Arrays.toString(expecteds);
      String r = Arrays.toString(results);
      if (e.equals(r)){
        printPass();
      } else {
        printFail(e, r);
      }
    }
  }

  public static void assertArrayEquals(double[] expecteds, double [] results)
  {
    if (expecteds == null && results != null){
      printFail("NULL", "NOT NULL");
    }else if (expecteds != null && results == null) {
      printFail("NOT NULL", "NULL");
    }else if (expecteds == results){
      printPass();
    }else if (expecteds.length != results.length){
      printFail("Length "+expecteds.length, "Length "+results.length);
    }else{
      for (int i = 0; i < expecteds.length; ++i){
        if (Math.abs(expecteds[i] - results[i]) >= EPSILON){
          printFail(""+expecteds[i], ""+results[i]);
          return;
        }
      }
      printPass();
    }
  }

  public static void assertArrayEquals(float[] expecteds, float [] results)
  {
    if (expecteds == null && results != null){
      printFail("NULL", "NOT NULL");
    }else if (expecteds != null && results == null) {
      printFail("NOT NULL", "NULL");
    }else if (expecteds == results){
      printPass();
    }else if (expecteds.length != results.length){
      printFail("Length "+expecteds.length, "Length "+results.length);
    }else{
      for (int i = 0; i < expecteds.length; ++i){
        if (Math.abs(expecteds[i] - results[i]) >= EPSILON){
          printFail(""+expecteds[i], ""+results[i]);
          return;
        }
      }
      printPass();
    }
  }

  private static void printFail(String expected, String result)
  {
    System.out.println("Test Failed: [" + expected + "] expected, but ["+result+"] returned");
  }

  private static void printPass()
  {
    System.out.println("Test Passed");
  }
}