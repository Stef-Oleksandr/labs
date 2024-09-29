public class Main {
    public static void main(String[] args) {
        short s1 = -5;
        int s2 = 10;
        double d1 = -31.9;
        float d2;
        boolean b;
        long l;

        // 1. змінній l привласнити значення змінної d1
        l = (long) d1;
        System.out.println("Значення l після присвоєння d1: " + l);

        // 2. змінній d1 привласнити випадкове значення в діапазоні від -100 до 100
        d1 = -100 + Math.random() * 200;
        System.out.println("Випадкове значення d1: " + d1);

        // 3. змінній b привласнити значення false
        b = false;
        System.out.println("Значення b: " + b);

        // 4. змінній d2 привласнити значення добутку s1 та s2
        d2 = (float) (s1 * s2);
        System.out.println("Значення d2 після множення s1 і s2: " + d2);

        // Обчислимо першу частину виразу: (tan(l) + tan(s1)) / (l - s1)
        double numerator1 = Math.tan(l) + Math.tan(s1);
        double denominator1 = l - s1;
        double part1 = numerator1 / denominator1;

        // Обчислимо другу частину виразу: (l^2 - s1^2) / (l^3 + 2l * s1 + 3)
        double numerator2 = Math.pow(l, 2) - Math.pow(s1, 2);
        double denominator2 = Math.pow(l, 3) + 2 * l * s1 + 3;
        double part2 = numerator2 / denominator2;

        // Підсумковий результат
        double y = part1 + part2;

        // Виведення результату на екран
        System.out.println("Результат обчислення виразу y: " + y);
    }
}