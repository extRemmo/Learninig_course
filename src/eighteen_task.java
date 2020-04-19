import java.io.*;


public class eighteen_task {
    public static void main(String[] args) {
        eighteen_task.read(args); //вызвали метод чтения из файла

        String str1;
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop'");

        try (FileWriter fw = new FileWriter("C:/Users/user/Desktop/test.txt")) { //перезапись в тот же файл
            do {
                System.out.println(": ");
                str1 = br.readLine();

                if (str1.compareTo("stop") == 0) break;

                str1 = str1 + "\r\n";
                fw.write(str1);
            } while (str1.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }

    public static void read (String[] args) {
        String S;
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/user/Desktop/test.txt")))
        {
            while ((S = br.readLine()) != null){
                System.out.println("Текущее содержимое файла: " + S);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода" + exc);
        }
}
}
