import java.util.Arrays;

public class Quest7 {
    public static double[] quadraticRoots(double a, double b, double c) {
        if (a == 0) throw new IllegalArgumentException("a = 0");

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return null;
        }

        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new double[]{x1, x2};
    }

    public static void main(String[] args) {
        double[] roots = quadraticRoots(1, -5, 6);
        System.out.println("x^2 - 5x + 6 = 0 : " + Arrays.toString(roots));

        roots = quadraticRoots(1, -2, 1);
        System.out.println("x^2 - 2x + 1 = 0 : " + Arrays.toString(roots));

        roots = quadraticRoots(1, 0, 1);
        System.out.println("x^2 + 1 = 0 : " + (roots == null ? "null" : Arrays.toString(roots)));

        try {
            quadraticRoots(0, 2, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}