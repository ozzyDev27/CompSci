/*
 * CodingBat.com activity from String2.
 */

public class EndOther
{
  public static boolean endOther(String one, String two)
  {
    return one.toLowerCase().endsWith(two.toLowerCase())||two.toLowerCase().endsWith(one.toLowerCase());
  }
}