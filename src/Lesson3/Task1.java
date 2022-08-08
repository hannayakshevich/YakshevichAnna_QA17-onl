/**
 * Создать программу, которая позволяет ввести с клавиатуры массив размером n
 * и отсортировать его по убыванию.
 *
 * 1. Нужно считать с клавиатуры значение числа "n"(размер массива),
 * используя метод makeMassiveUsingKeybord();
 * 2.1 Ввести значения, которые будут добавлены в массив (при размере массива,
 * равном «n», необходимо ввести элементы массива «n» раз).
 * Example: Выводит на экран строку типа:
 * Enter element [номер элемента]: {Введенное с клавиатуры целое число}
 * 2.2 Далее вывести массив, который мы создали, каждый элемент через запятую и пробел,
 * используя метод printMassive()}.
 * Example: 7, 23, 12, 0, 322
 * 3. Отсортировать базовый массив по убыванию сортировкой Пузырька, используя
 * метод sortMassiveByBubbleWay()}.
 * 4. Вывести отсортированный массив, используя метод printSortedDescMassive()}.
 * Example: [322, 23, 12, 7, 0]
 */

package Lesson3;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter massive size: -> ");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Your base massive is:");
        for (int i = 0; i < arraySize - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[arraySize - 1]);
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted massive DESC:");
        System.out.println(Arrays.toString(array));
    }
}
