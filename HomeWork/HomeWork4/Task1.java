// №1.=====
// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.
// [1,2,3,4,5]
// perevertysh(list)
// return list_new
// [5,4,3,2,1]


package HomeWork.HomeWork4;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        System.out.println("Исходный список: "+list1);
        System.out.println("Перевернутый список: "+perevertysh(list1, list2));
    }

    static LinkedList perevertysh(LinkedList list1, LinkedList list2) {

        while (!list1.isEmpty()) {
            list2.add(list1.pollLast());
        }
        return list2;
    }
}