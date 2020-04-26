/*
    Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 */

import java.util.Scanner;

public class Final1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String bin = in.nextLine();

        int num = 0, a;
        char c;

        for (int i = 0; i < bin.length(); i++) {
            c = bin.charAt(bin.length() - 1 - i);

            if (c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Неверный ввод!");
                break;
            }
            num += (a * Math.pow(2, i));
        }
        System.out.println("Введено число:" + num);
    }
}