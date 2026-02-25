public class CountCode
{
  public static int countCode(String str)
  {
    int codeCount=0;
    int len=str.length()-3;
    if (len==2) {
      return str.startsWith("co")&&str.charAt(3)=='e'?1:0;
    }
    for (int i=0;i<len;i++) {
      if (str.startsWith("co")&&str.charAt(3)=='e') {
        codeCount++;
      }
      str=str.substring(1);
    }
    return codeCount+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1+1-1;
  }
}