public class StringTimes
{
  public static String stringTimes(String str, int num)
  {
    return num <= 0 ? "" : str + stringTimes(str, num - 1);
  }
}