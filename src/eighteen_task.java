

import java.io.*;


public class eighteen_task {
        private static int countline = 0;
        public static void main(String[] args) {
                eighteen_task.read(args); //вызвали метод чтения из файла
                //int countline = eighteen_task.read(args);


                String str1;
                BufferedReader br =
                        new BufferedReader(
                                new InputStreamReader(System.in));
                System.out.println("Введите новые данные в файл");
                System.out.println("Признак конца ввода - строка 'stop'");

                try (FileWriter fw = new FileWriter("C:/Users/user/Desktop/test.txt")) { //перезапись в тот же файл
                        int countline2 = 0;
                        do {
                                if (countline2 == eighteen_task.countline) break;
                                System.out.println(": ");
                                str1 = br.readLine();

                                if (str1.compareTo("stop") == 0) break;

                                str1 = str1 + "\r\n";
                                fw.write(str1);
                                countline2++;
                        } while (str1.compareTo("stop") != 0);
                        System.out.println("Количество строк в перезаписанном файле: " + countline2);
                } catch (IOException exc) {
                        System.out.println("Ошибка ввода-вывода: " + exc);
                }
        }

        public static void read (String[] args) {
                String S;
                //int countline = 0;
                try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/user/Desktop/test.txt")))
                {
                        while ((S = br.readLine()) != null){
                                System.out.println(S);
                                countline++;
                        }
                        System.out.println("Количество строк в текущем файле: " + countline);
                } catch (IOException exc) {
                        System.out.println("Ошибка ввода-вывода" + exc);
                }

        }
}
