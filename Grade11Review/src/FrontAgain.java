public class FrontAgain
{
  public static void main(String[] args) {
  }

  public static boolean frontAgain(String str)
  {
    return str.length()>=2&&str.substring(0,2).equals(str.substring(str.length()-2));
  }
}
