import java.util.Scanner;

public class Final3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара ");
        double Currency = in.nextDouble();
        System.out.println("Введите количество рублей для конвертации ");
        double Rubcount = in.nextDouble();

        if (Currency > 0 & Rubcount > 0) {
            double Dollars = Rubcount / Currency;

            System.out.printf("Итого долларов %.2f %n", Dollars);
        }
            else {
                System.out.println("введите корректные значения!");
            }
        }
    }

