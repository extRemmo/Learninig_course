import java.util.Scanner;
public class ten_task {
    public static void main (String[] args) {
        System.out.println("Введите размерость матрицы! ");
        Scanner in = new Scanner(System.in);
        int dimX = in.nextInt();
        int dimY = in.nextInt();
        int matrix[][] = new int[dimX][dimY];

        System.out.println("Введите элементы матрицы");
        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int j = 0; j < dimY; j++) {
                System.out.println(matrix[0][j]*3 + "\t");
            }
    }
}