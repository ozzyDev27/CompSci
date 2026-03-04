public class XYZThere
{
  public static void main(String[] args) {
      System.out.println(xyzThere("axyzb"));
  }
  public static boolean xyzThere(String str)
  {
    if (str.length()<4 || str.startsWith("xyz")) {
      return str.equals("xyz") || str.startsWith("xyz");
    }
    for (int i=0;i<str.length()-3;i++) {
      // System.out.println(str.substring(i,i+3));
      if (str.charAt(i)!='.'&&str.substring(i+1,i+4).equals("xyz")) return true;
    }
    return false;
  }
}



