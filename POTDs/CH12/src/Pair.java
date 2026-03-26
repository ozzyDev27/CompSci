public class Pair {
    private double first, second;

    public Pair(double a, double b) {
        first = a;
        second = b;
    }

    public Pair swap()
    {
        return new Pair(second, first);
    }

    public void data()
    {
        System.out.println(first + " " + second);
    }

    public static void main(String[] args) {
        Pair a = new Pair(1,2);
        a.data();
        
        Pair b = a.swap();

        b.data();
    }
}