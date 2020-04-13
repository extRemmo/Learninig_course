import java.util.Scanner;
public class six_task {
    public static void main (String[] args) {
        System.out.println("Введите числа X,Y,Z ");
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        double average = (x+y+z)/3.0;
        System.out.println("Среднее арифметическое введенных чисел:" + average);
        int del = (int)(average)/2;
        System.out.println("Среднее арифметическое введенных чисел, деленное на два:" + del);

        if (del > 3) System.out.println("Программа выполнена корректно");
        else {}
    }
}