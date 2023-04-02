// №3.=====
// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// ответ:
// 3

package HomeWork.HomeWork4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> array = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = input.nextInt();
        int calc = num1;

        while (true) {
            System.out.println("Введите арифметический знак: '+', '-', '*', '/' для продолжения");
            System.out.println("или 'cancel' для отмены действия, 'stop' для остановки");
            String sign = input.next();
            if (sign.startsWith("cancel")) {
                array.removeLast();
                calc = array.getLast();
                System.out.println("Ответ: "+calc);
                break;
            } else if (sign.startsWith("stop")){
                break;
            }

            System.out.println("Введите второе число: ");
            int num2 = input.nextInt();
            if (sign.startsWith("+")) {
                calc = calc + num2;
                array.add(calc);
                System.out.println("Ответ:" + calc);
            } else if (sign.startsWith("-")) {
                calc = calc - num2;
                array.add(calc);
                System.out.println("Ответ:" + calc);
            } else if (sign.startsWith("*")) {
                calc = calc * num2;
                array.add(calc);
                System.out.println("Ответ:" + calc);
            } else if (sign.startsWith("/")) {
                calc = calc / num2;
                array.add(calc);
                System.out.println("Ответ:" + calc);
            }
            
            // else if (sign.startsWith("!")){
            // array.removeLast();
            // calc = array.getLast();
            // }

            // System.out.println("Результат: " + num1 + " " + sign + " " + num2 + " = " + calc);
        }
    }
}
