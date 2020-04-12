/*Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.*/

import java.util.Scanner;

public class multitable {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = in.nextInt();
        System.out.println("Полученная таблица умножения: ");
        int y = 1;
        System.out.println(x*y++);
        System.out.println(x*y++);
        System.out.println(x*y++);
        System.out.println(x*y++);
        System.out.println(x*y++);
        System.out.println(x*y++);
        System.out.println(x*y++);
        System.out.println(x*y++);
        System.out.println(x*y++);
        System.out.println(x*y++);
    }

}
