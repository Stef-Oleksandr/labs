import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("\uD83D\uDE02"); // 😂 Сміх до сліз
        System.out.println("\uD83D\uDE0D"); // 😍 Закоханий смайлик
        System.out.println("\uD83D\uDE80"); // 🚀 Ракета
        // Створюємо об'єкт класу Random для генерації випадкових чисел
        Random random = new Random();

        // Генеруємо випадкові числа для символів у діапазоні від 32 до 65535
        int codePoint1 = 32 + random.nextInt(65535 - 32 + 1);
        int codePoint2 = 32 + random.nextInt(65535 - 32 + 1);

        // Перетворюємо числові коди у символи
        char char1 = (char) codePoint1;
        char char2 = (char) codePoint2;

        // Виводимо символи та їх числові коди
        System.out.println("Перший символ: '" + char1 + "' з кодом: " + codePoint1);
        System.out.println("Другий символ: '" + char2 + "' з кодом: " + codePoint2);

        // Порівнюємо символи
        if (char1 > char2) {
            System.out.println("Перший символ більший за другий.");
        } else if (char1 < char2) {
            System.out.println("Перший символ менший за другий.");
        } else {
            System.out.println("Символи рівні.");
        }
    }
}