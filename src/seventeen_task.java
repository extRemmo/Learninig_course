import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class seventeen_task {
    public static void main(String[] args) {
        String str;
        sixteen_task rf = new sixteen_task();

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop'");

        try (FileWriter fw = new FileWriter("C:/Users/user/Desktop/test.txt")) {
            do {
                System.out.println(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) break;

                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
