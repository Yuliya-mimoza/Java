// №1.=====
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции:
//  1) Добавление номера
//  2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

package HomeWork.HomeWork5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map <String, Integer> spisok=new HashMap <String, Integer>();
        Scanner scanner=new Scanner(System.in,"cp866");
        String surname;
        int phone;
        boolean x=true;

        while (x==true){
            System.out.println("Введите '1', '2' или '0'-для отмены всего: ");
            String func = scanner.next();
            switch (func) {
                case "1":
                    System.out.println("Введите фамилию: ");
                    surname = scanner.next();
                    System.out.println("Добавьте номер телефона: ");
                    phone = scanner.nextInt();
                    spisok.put(surname,phone);
                    break;
                case "2":
                    spisok.entrySet().forEach(System.out::println);
                    break;
                case "0":
                    x=false;
                    break;
            }
        }
   }
}
