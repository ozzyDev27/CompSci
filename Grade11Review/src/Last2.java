public class Last2 extends GenericTestHarness
{
  public static void main(String[] args) {
    // Black Box Testing
    assertEquals(1,last2("hixxhi"));
    assertEquals(2,last2("hixhixhi"));
    assertEquals(1,last2("xaxxaxaxx"));
    assertEquals(2,last2("axxxaaxx"));
    assertEquals(3,last2("pikapikakapipika"));
    assertEquals(0, last2("wiwiwiwiwi!"));
  }

  public static int last2(String str)
  {
    int num=0;
    while (str.substring(0,str.length()-2).contains(str.substring(str.length()-2))) {
      str = str.substring(0,str.indexOf(str.substring(str.length()-2))) + str.substring(str.indexOf(str.substring(str.length()-2))+1);
      num++;
    }
    return num;
  }
}