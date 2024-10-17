import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        // Створюємо об'єкт для читання даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Введення трьох цілих чисел
        System.out.print("\nInput значення X: ");
        int X = scanner.nextInt();

        System.out.print("Input значення Y: ");
        int Y = scanner.nextInt();

        System.out.print("Input значення Z: ");
        int Z = scanner.nextInt();

        // Змінна для результату
        double Q = 0;

        // Обчислення за умовами
        if (X > Y && Y > Z && X > 0) {
            Q = Math.pow(X, 3) - Y - Math.pow(Z, 2);
        } else if (Y > X && X >= Z) {
            Q = Math.pow(X, 2) + Y * Z;
        } else if (Z >= Y && Y > X) {
            Q = X * Y + Math.pow(Z, X);
        } else {
            Q = -X - Y - Z;
        }

        // Виведення результату
        System.out.println("Значення Q: " + Q);
    }
}