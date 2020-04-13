import java.util.Scanner;
public class seven_task {
    public static void main (String[] args) {
        System.out.println("Введите число! ");
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int x = 10;
        int y = 15;
        int z = 20;

        switch (number) {
            case 10:
            case 15:
            case 20:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
    }
}