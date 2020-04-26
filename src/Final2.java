/*Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами. Использовать одну из следующих сортировок:
прямого выбора, вставки, быстрая, Шелла.
*/

import java.util.Scanner;

public class Final2 {
    public static void main (String[] args) {
        System.out.println("Введите размер массива! ");
        Scanner in = new Scanner(System.in);
        int dim = in.nextInt();
        int mass1[] = new int[dim];

        for (int i = 0; i < dim; i++) {
            mass1[i] = in.nextInt();
        }
        Final2.insertIntoSort(mass1); //вызов метода сортировки для заданного массива
        for (int i = 0; i < dim; i++) {
            System.out.println(mass1[i]);
        }
    }
    public static int[] insertIntoSort(int[] arr) { // cортировка вставками
        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}
