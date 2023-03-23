// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package HomeWork.HomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = input.nextInt();
        int sum=0;
        int comp=1;
        for (int i = 1; i <=n; i++) {
            sum+=i;
            comp*=i;
        }
        System.out.println("Треугольное число = "+ sum);
        System.out.println("N! = "+ comp);
    }
}
