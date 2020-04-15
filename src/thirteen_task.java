import java.util.Scanner;
public class thirteen_task {
    public static void main (String[] args) {
        System.out.println("Введите строку 1");
        Scanner in = new Scanner(System.in);
            String str1 = in.nextLine();
        System.out.println("Введите строку 2");
            String str2 = in.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();

        if (len1>len2) System.out.println(str1);
            else if (len1 == len2) System.out.println("Строки равной длины");
                else System.out.println(str2);

    }
}
