public class SeeColor
{
  public static void main(String[] args) {
  }

  public static String seeColor(String str)
  {
    return str.toLowerCase().startsWith("red")?"red":(str.toLowerCase().startsWith("blue")?"blue":"");
  }
}  