// №1.=====
// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

// вариант 1)=====

// package Seminars;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class Seminar5 {
//     public static void main(String[] args) {
//        HashMap <Integer , String> bd_pas=pasports();
//         for (Map.Entry<Integer, String> item:bd_pas.entrySet()){
//             if (item.getValue().equals("Иванов")){
//                 System.out.println(item.getKey());
//                 System.out.println(item.getValue());
//             }
//         }
//     }

//     public static HashMap <Integer,String> pasports()    {
//         Scanner input=new Scanner(System.in);
//         HashMap <Integer, String> pasport = new HashMap<>();
//         pasport.put(123456, "Иванов");
//         pasport.put(321456, "Васильев");
//         pasport.put(234561, "Петрова");
//         pasport.put(234432, "Иванов");
//         pasport.put(654321, "Петрова");
//         pasport.put(345678, "Иванов");
//         int number=1;
//         while (number!=0){
//             number=input.next("Введите номер паспорта: ");
//             String surname = input.next("Введите фамилию: ");
//             pasport.put(number, surname);
//         }
//         return pasport;
//     }
// }

// вариант 2)=====
// package Seminars;

// import java.util.HashMap;
// import java.util.Map;

// public class Seminar5 {
//     public static void main(String[] args) {
//         Map<Integer, String> map = new HashMap<>();
//         map.put(123456, "Иванов");
//         map.put(321456, "Васильев");
//         map.put(234561, "Петрова");
//         map.put(234432, "Иванов");
//         map.put(654321, "Петрова");
//         map.put(345678, "Иванов");
//         for (Map.Entry<Integer,String> entry: map.entrySet()){
//             if (entry.getValue().equals("Иванов")){
//                 System.out.println("Иванов: "+entry.getKey());
//             }
//         }
//     }
// }

// №2.=====
// Даны 2 строки, написать метод, который вернет true, если эти
// строки являются изоморфными и false, если нет. Строки изоморфны,
// если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву
// с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:

// Input: s = "foo", t = "bar"
// f b
// o a
// o --> a
// Output: false

// Пример 2:

// Input: s = "paper", t = "title"
// p t
// a i
// e l
// r e
// Output: true

// package Seminars;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class Seminar5 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String s = "title";
//         String k = "paper";
//         System.out.println(is_isomorphe(s, k));
//     }

//     public static  boolean is_isomorphe(String st,String kt) {
//         if (st.length()!=kt.length()){return false;};
//         Map<Character,Character> isomor=new HashMap<>();
//         for (int i=0;i<st.length();i++) {
//             if (!isomor.containsKey(st.charAt(i))){
//             isomor.putIfAbsent(st.charAt(i),kt.charAt(i));
//             }
//             else {
//                 if (isomor.get(st.charAt(i))!=kt.charAt(i)){
//                 return false;
//                 }
//             }
//         }
//         Map<Character,Character> isomor_reverse=new HashMap<>();
//             for (int i=0;i<kt.length();i++) {
//                 if (!isomor_reverse.containsKey(kt.charAt(i))){
//                 isomor_reverse.putIfAbsent(kt.charAt(i),st.charAt(i));
//             }
//             else {
//                 if (isomor_reverse.get(kt.charAt(i))!=st.charAt(i)){
//                     return false;
//                 }
//             }
//         }
//     }
// }

// №3.=====
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: a+(1*3)] - ложь
// Пример 3: [6+(3*3)] - истина

package Seminars;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Seminar5 {
    public static boolean isRight(String str) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                stack.add(c);
            }

            for (Map.Entry<Character, Character> entry : map.entrySet()) {
                if (c == entry.getValue()) {
                    if (!stack.isEmpty() && stack.peek() == entry.getKey())
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isRight("[(6+{3*3})]"));
    }
}