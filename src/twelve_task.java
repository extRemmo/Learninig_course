import java.util.Scanner;
public class twelve_task {
    public static void main (String[] args) {
        System.out.println("Введите строку (с пробелами)");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for (String retval : str.split(" ")) {
            System.out.print(retval);
        }

    }
}
