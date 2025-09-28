import java.util.Scanner;
public class pr1n1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int size = s1.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите " + size + " элементов:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i+1) + ": ");
            numbers[i] = s1.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Массив чисел:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nСумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
        s1.close();
    }
}