/**
 * Ввести с клавы размер 2-ухмерного массива. Оба значения.
 * Вычесть из суммы элементов 2 строки сумму побочной
 * диоганали… НО, если матрица не квадратная, то всместо диоганали – сумму 2 столбца. ГЫ
 * Вывести на экран изначальную матрицу. Значения заполнить рандомом,
 * ограничив до легчосчитаемого но не ниже значения 5.
 * Вывести каждую сумму отдельно (с пояснение, что оно такое)
 * Вывести итоговый ответ.
 */

package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Размер 2-хмерного массиса");
        System.out.print("Первое значение: ");
        int arraySize1 = scanner.nextInt();
        System.out.print("Второе значение: ");
        int arraySize2 = scanner.nextInt();
        int[][] massive = new int[arraySize1][arraySize2];

        for (int i = 0; i <  massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++){
                massive[i][j] = random.nextInt(6);
            }
        }

        uotMassive(massive);
        result(massive);
    }
    public static void uotMassive(int[][] massive){
        System.out.print("Исходный массив:");
        for (int i = 0; i <  massive.length; i++) {
            System.out.println();
            for (int j = 0; j < massive[i].length; j++) {
                System.out.print(massive[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static void result(int[][] massive){
        int sumSideDiagonalMassive = 0;
        int sumColumn2Massive = 0;
        int sumString2Massive = 0;
        int result;
        int i;

        if(massive.length > 1) {
            for (i = 0; i < massive[1].length; i++) {
                sumString2Massive += massive[1][i];
            }
            System.out.println("Сумма значений массива во второй строке: " + sumString2Massive);
        } else {
            System.out.println("Не возможно подсчитать сумму второго столбца. Программа завершена.");
            int status = 1;
            System.exit(1);
        }

        if(massive.length == massive[0].length){
            for(i = 0; i < massive.length; i++){
                int j = massive.length - 1;
                sumSideDiagonalMassive += massive[j-i][i];
            }
            System.out.println("Сумма значений массива побочной диагонали: " + sumSideDiagonalMassive);
            result = sumString2Massive - sumSideDiagonalMassive;
            System.out.println("Итоговый резульат: " + result);
        }

        if (massive.length != massive[0].length && massive[0].length > 1){
            for (i = 0; i < massive.length; i++) {
                sumColumn2Massive += massive[i][1];
            }
            System.out.println("Сумма значений массива во втором столбце: " + sumColumn2Massive);
            result = sumString2Massive - sumColumn2Massive;
            System.out.println("Итоговый результат: " + result);
        } else {
            System.out.println("Не возможно подсчитать сумму второй строки. Программа завершена.");
            int status = 1;
            System.exit(1);
        }
    }
}