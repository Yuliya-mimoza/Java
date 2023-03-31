// №1.=====
// Заполнить список десятью случайными числами. Отсортировать список методом sort() 
// и вывести его на экран.

// package Seminars;

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.Random;

// public class Seminar3 {
//     public static void main(String[] args) {
//         Random rdm=new Random();
//         ArrayList<Integer> rdm_list=new ArrayList<Integer>();
//         for (int i=0;i<10;i++) {
//             rdm_list.add(rdm.nextInt(1,10));
//         }
//         System.out.print("Исходный список: "+rdm_list);
//         rdm_list.sort(Comparator.naturalOrder());
//         System.out.println("");
//         System.out.print("Список после сортировки: "+rdm_list);
//     }
// }

// №2.=====
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

// вариант1===
// package Seminars;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

// public class Seminar3 {
//     public static void main(String[] args) {
//         String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
//         List<String> planetList = new ArrayList<>();
//         Random random = new Random();
//         for (int i = 0; i < 20; i++) {
//             int index = random.nextInt(planets.length);
//             planetList.add(planets[index]);
//         }
//         System.out.println(planetList);
//         int[] count = new int[9];
//         for (String name : planetList) {
//             for (int j = 0; j < planets.length; j++) {
//                 if (name.equals(planets[j])) {
//                     count[j]++;
//                     break;
//                 }
//             }
//         }
//         for (int j = 0; j < planets.length; j++) {
//             System.out.println(planets[j] + ":" + count[j]);
//         }
//     }
// }

// вариант 2===
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

// package Seminars;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;

// public class Seminar3 {
//     public static void main(String[] args) {
//         ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Venera", "Saturn", "Venera", "Mars", "Jupiter", "Earth", "Earth"));
//         arrayList.sort(Comparator.naturalOrder());
//         int count = 1;

//         for (int i = arrayList.size() - 1; i > 0; i--) {
//             if (arrayList.get(i).equals(arrayList.get(i - 1))) {
//                 count++;

//             } else {
//                 System.out.println(arrayList.get(i) + " повторяется " + count + " раз.");
//                 count = 1;
//             }

//         }
//     }
// }

// №3.=====
// Создать список типа ArrayList. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package Seminars;

import java.util.ArrayList;
import java.util.Random;

public class Seminar3 {
    public static void main(String[] args) {
        ArrayList mix_list = new ArrayList<>();
        String[] words = new String[] { "привет", "солнце", "голубое", "небо" };
        Random rdm = new Random();
        for (int i = 0; i < 20; i++) {
            int type = rdm.nextInt(0, 2);
            if (type == 0) {
                mix_list.add(rdm.nextInt(1, 10));
            } else {
                mix_list.add(words[rdm.nextInt(words.length)]);
            }
        }
        System.out.println("Исходный список: "+mix_list);
        int i=0;
        while (i<mix_list.size()){
            if (mix_list.get(i) instanceof Integer==true){
                mix_list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println(mix_list);
    }
}