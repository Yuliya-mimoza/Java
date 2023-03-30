// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package HomeWork.HomeWork3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> spisok = new ArrayList<>(10);
        Random rdm = new Random();
        for (int i = 0; i < 10; i++) {
            spisok.add(rdm.nextInt(1, 100));
        }
        System.out.println("Исходный список: "+spisok);
        for (int j = 0; j < spisok.size(); j++) {
            if (spisok.get(j) % 2 == 0) {
                spisok.remove(j);
                j--;
            }
        }
        System.out.println(spisok);
    }
}
