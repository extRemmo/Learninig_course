import java.util.Scanner;
public class nine_task {
    public static void main (String[] args) {
        System.out.println("Введите размер массива! ");
        Scanner in = new Scanner(System.in);
        int dim = in.nextInt();
        int mass1[] = new int[dim];

        for (int i = 0; i < dim; i++) {
             mass1[i] = in.nextInt();
        }
        for (int i = 0; i < dim; i++) {
            System.out.println(mass1[i]*2);
        }
    }
}
