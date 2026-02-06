public class StringSplosion extends GenericTestHarness
{
  public static void main(String[] args) {
      assertEquals("CCoCodCode",stringSplosion("Code"));
      assertEquals("aababc",stringSplosion("abc"));
      assertEquals("aab",stringSplosion("ab"));
  }

  public static String stringSplosion(String str)
  {

    StringBuffer sb = new StringBuffer(1);
    for (int i=0;i<=str.length();i++){
      sb.append(str.substring(0, i));
    }
    return sb.toString();
  }
}