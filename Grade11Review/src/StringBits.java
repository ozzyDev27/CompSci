public class StringBits extends GenericTestHarness
{
  public static void main(String[] args) {
      assertEquals("Hlo",stringBits("Hello"));
      assertEquals("H",stringBits("Hi"));
      assertEquals("Hello",stringBits("Heeololeo"));
  }

  public static String stringBits(String str)
  {
    StringBuffer sb = new StringBuffer(str.length());
    for (int i=0; i<str.length(); i+=2) {
      sb.append(str.charAt(i));
    }

    return sb.toString();
  }
}