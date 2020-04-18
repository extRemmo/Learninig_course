import java.util.Scanner;
public class fifteen_task {
    public static void main(String[] args) {
        System.out.println("Введите размер массива и его элементы! ");
        Scanner in = new Scanner(System.in);
        int dim = in.nextInt();
        int mass1[] = new int[dim];

        for (int i = 0; i < dim; i++) {
            mass1[i] = in.nextInt();
        }

        fifteen_task.bubbleSort(mass1); //вызвали функцию сортировки внутри класса
        System.out.println("Массив отсортирован по возрастанию:");

        for (int i = 0; i < dim; i++) {
            System.out.println(mass1[i]);
        }
    }

    public static void bubbleSort(int[] mass1) {
        for (int i = mass1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass1[j] > mass1[j + 1]) {
                    int tmp = mass1[j];
                    mass1[j] = mass1[j + 1];
                    mass1[j + 1] = tmp;
                }
            }
        }
    }
}