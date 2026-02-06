public class CountXX
{
  public static void main(String[] args) {
    System.out.println(countXX("abcxx"));
    System.out.println(countXX("xxx"));
    System.out.println(countXX("xxxx"));
  }

  public static int countXX(String str)
  {
    int num=0;
    while (str.indexOf("xx")>=0) {
      str = str.substring(0,str.indexOf("xx")) + str.substring(str.indexOf("xx")+1);
      num++;
    }
    return num;
  }
}