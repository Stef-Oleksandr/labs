public class lr5 {
    public static void main(String[] args) {
        double step = 0.2;
        for (double x = -1; x <= 1.0; x += step) {
            try {
                double y = 1 / Math.sin(Math.pow(x, x)) + 1 / Math.cos(Math.pow(x, x));
                System.out.printf("x = %.1f, y = %.5f%n", x, y);
            } catch (ArithmeticException e) {
                System.out.printf("x = %.1f, y = Undefined (division by zero)%n", x);
            } catch (Exception e) {
                System.out.printf("x = %.1f, y = Undefined (error)%n", x);
            }
        }
    }
}
