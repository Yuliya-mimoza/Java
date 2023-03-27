// №4.=====
// 4*дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4

package HomeWork.HomeWork2;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Task2 {
    public static void main(String[] args) {
        String file_name = "Task2.txt";
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, true);

            Scanner input = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            double num1 = input.nextDouble();
            System.out.println("Введите арифметический знак: (+, -, *, /)");
            char sign = input.next().charAt(0);
            System.out.println("Введите второе число: ");
            double num2 = input.nextDouble();
            double calc = 0;
            // System.out.println("a = "+num1);
            // System.out.println("знак = "+sign);
            // System.out.println("b = "+num2);
            switch (sign) {
                case '+':
                    calc = num1 + num2;
                    break;
                case '-':
                    calc = num1 - num2;
                    break;
                case '*':
                    calc = num1 * num2;
                    break;
                case '/':
                    calc = num1 / num2;
                    break;
                default:
                    System.out.print("Ошибка! Введите верный арифметический знак!");
                    return;
            }
            System.out.println("Результат: " + num1 + " " + sign + " " + num2 + " = " + calc);
            writer.close();
            System.out.println("Всё работает!");
        } catch (Exception e) {
            System.out.println("Где-то ошибка!");
        }
    }
}
