public class WithoutX2
{
  public static String withoutX2(String str)
  {
    str=str.length()>1&&str.charAt(1)=='x'?str.substring(0,1)+str.substring(2):str;
    str=str.startsWith("x")?str.substring(1):str;
    return str;
  }
}  