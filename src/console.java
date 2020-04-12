/*
    Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 */

import java.util.Scanner;

public class console {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String bin = in.nextLine();
        int Num = Integer.parseInt(bin, 2);
        System.out.println("Введено число:" + Num);

    }
}