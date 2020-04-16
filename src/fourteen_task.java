import java.util.Scanner;

public class fourteen_task {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        System.out.println("Строка S: "+S);
        int X = 0;
        try {
             X = Integer.parseInt(S);
                System.out.println("Число int X: "+X);
                    double Y = (double) (X);
                         System.out.println("Число double Y: "+Y);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");

        }


    }
}
