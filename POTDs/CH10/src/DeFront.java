public class DeFront
{
  public static String deFront(String str)
  {
    if (str.length()>0&&str.charAt(0)!='a') {
        str=str.substring(1);

        if (str.charAt(0)!='b') {
            str=str.substring(1);
        }
    }
    else if (str.length()>1&&str.charAt(1)!='b') {
        str = str.substring(0, 1) + str.substring(2);
    }
    return str;
  }
}