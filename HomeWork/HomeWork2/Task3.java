// №3.=====
// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение). 
// Без встр. функций

package HomeWork.HomeWork2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = input.next();
        input.close();
        System.out.print(palindrom(str));
    }

    public static boolean palindrom(String s) {
        boolean b = true;
        for (int i = 0; i < (s.length() / 2); i++)
            if (s.charAt(i) == s.charAt(s.length() - 1 - i))
                b = true;
            else {
                b = false;
                break;
            }
        return b;
    }
}
