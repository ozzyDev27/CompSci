public class StringX
{
  public static void main(String[] args) {
  }

  public static String stringX(String str)
  {
    if (str.length()<2){
      return str;
    }
    StringBuffer sb = new StringBuffer(str.length());
    sb.append(str.charAt(0));
    for (int i=1;i<str.length()-1;i++) {
      if (str.charAt(i)!='x') {
        sb.append(str.charAt(i));
      }
    }
    sb.append(str.charAt(str.length()-1));
    return sb.toString();
  }
}