public class StartWord
{
  public static String startWord(String str, String word)
  {
    if (str.substring(1).startsWith(word.substring(1))) {
        return str.substring(0,word.length());
    }
    return "";
  }
} 


