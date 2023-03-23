// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->package HomeWork.HomeWork1;

package HomeWork.HomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = input.nextDouble();
        System.out.println("Введите арифметический знак: (+, -, *, /)");
        char sign=input.next().charAt(0);
        System.out.println("Введите второе число: ");
        double num2 = input.nextDouble();
        double calc=0;
        // System.out.println("a = "+num1);
        // System.out.println("знак = "+sign);
        // System.out.println("b = "+num2);
        switch(sign) {
            case '+': calc = num1 + num2;
               break;
            case '-': calc = num1 - num2;
               break;
            case '*': calc = num1 * num2;
               break;
            case '/': calc = num1 / num2;
               break;
            default:  System.out.print("Ошибка! Введите верный арифметический знак!");
               return;
        }
        System.out.println("Результат: "+num1+" "+sign+" "+num2+" = "+calc);
    }
}

