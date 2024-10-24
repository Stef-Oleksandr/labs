import java.util.Scanner;
public class lr5 {// Метод для перевірки, чи є число простим
    // Метод для перевірки, чи є число простим
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // Числа менші або рівні 1 не є простими
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Якщо знайдений дільник, число не є простим
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Частина 1: Табуляція функції y = 1/sin(x^x) + 1/cos(x^x)
        double step = 0.2;
        System.out.println("Табуляція функції:");
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

        // Частина 2: Введення трьох цілих чисел і перевірка на простоту
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведiть три цiлих числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Числа, якi не є простими:");
        if (!isPrime(num1)) {
            System.out.println(num1);
        }
        if (!isPrime(num2)) {
            System.out.println(num2);
        }
        if (!isPrime(num3)) {
            System.out.println(num3);
        }

        // Частина 3: Введення рядків до появи "done" і виведення найдовшого рядка
        scanner.nextLine();  // Очищення буфера після введення чисел
        String longest = "";  // Змінна для збереження найдовшого рядка
        System.out.println("\nВводьте рядки (для завершення введiть 'done'):");

        while (true) {
            String input = scanner.nextLine();
            
            // Перевірка на завершення введення
            if (input.equals("done")) {
                break;
            }
            
            // Оновлення найдовшого рядка, якщо поточний більший
            if (input.length() > longest.length()) {
                longest = input;
            }
        }
        
        // Виведення найдовшого рядка
        System.out.println("Найдовший рядок: " + longest);
    }
}
