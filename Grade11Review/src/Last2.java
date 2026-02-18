public class Last2
{
  public static void main(String[] args) {
  }

  public static int last2(String str)
  {
    int num=0;
    if (str.length()<2) {
      return 0;
    }
    while (str.substring(0,str.length()-1).contains(str.substring(str.length()-2))) {
      str = str.substring(0,str.indexOf(str.substring(str.length()-1))) + str.substring(str.indexOf(str.substring(str.length()-1))+1);
      num++;
    }
    return num;
  }
}