
import java.io.*;
public class sixteen_task {
    public static void main(String[] args) {
        String S;
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/user/Desktop/test.txt")))
        {
            while ((S = br.readLine()) != null){
                System.out.println(S);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода" + exc);
        }
    }
}
