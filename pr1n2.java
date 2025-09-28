import java.util.Scanner;

public class pr1n2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = s1.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите " + size + " элементов:");
        int i = 0;
        do {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers[i] = s1.nextInt();
            i++;
        } while (i < size);
        int sum = 0;
        int j = 0;
        while (j < numbers.length) {
            sum += numbers[j];
            j++;
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int k = 1; k < numbers.length; k++) {
            if (numbers[k] > max) {
                max = numbers[k];
            }
            if (numbers[k] < min) {
                min = numbers[k];
            }
        }
        double average = (double) sum / numbers.length;
        System.out.println("\nМассив чисел:");
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println("\n\nРезультаты:");
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
        s1.close();
    }
}
