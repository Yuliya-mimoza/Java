// №1.=====
// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package HomeWork.HomeWork2;

import java.io.File;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args) {
        String file_name = "Task1.txt";
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, false);

            int[] Array = { 2, 7, 12, 95, 10, 5, 21, 16 };
            // System.out.print("До сортировки: ");
            // for (int i = 0; i <= Array.length; i++) {
            //     System.out.print(Array[i] + " ");
            // }
            int temp;

            for (int i = 0; i < Array.length - 1; i++) {
                for (int j = 0; j < Array.length - i - 1; j++) {
                    if (Array[j + 1] < Array[j]) {
                        temp = Array[j];
                        Array[j] = Array[j + 1];
                        Array[j + 1] = temp;

                    }
                    writer.write(Array[j]);
                    writer.write("\n");
                }

            }
            for (int j = 0; j < Array.length; j++) {
                System.out.print(Array[j] + " ");
                writer.write(Array[j]);
            }

            writer.close();
            System.out.println("Всё работает!");
        } catch (Exception e) {
            System.out.println("Где-то ошибка!");
        }

    }
}
