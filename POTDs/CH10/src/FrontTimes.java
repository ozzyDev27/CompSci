public class FrontTimes
{
  public static String frontTimes(String str, int num)
  {
    return StringTimes.stringTimes(str.substring(0,Math.min(3,str.length())), num);
  }
}