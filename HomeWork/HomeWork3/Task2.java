// №2.=====
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package HomeWork.HomeWork3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> spisok = new ArrayList<>(10);
        Random rdm = new Random();
        for (int i = 0; i < 10; i++) {
            spisok.add(rdm.nextInt(1, 100));
        }
        System.out.println("Исходный список: " + spisok);
        int min = spisok.get(0);
        int max = spisok.get(0);
        int sum = 0;
        double avg = 0;
        for (int j = 0; j < spisok.size(); j++) {
            int num = spisok.get(j);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        avg = (double) sum / spisok.size();
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Среднее арифметическое = " + avg);
    }
}
