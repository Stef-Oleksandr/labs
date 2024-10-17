import java.util.Scanner;

public class UppercaseChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення рядка
        System.out.print("\nInput рядок: ");
        String input = scanner.nextLine();

        // Перевірка на наявність великої літери
        boolean hasUpperCase = false;
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }

        // Виведення результату
        if (hasUpperCase) {
            System.out.println("ТАК");
        } else {
            System.out.println("No");
        }
    }
}