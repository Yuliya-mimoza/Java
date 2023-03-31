// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

// package Seminars;

// import java.util.ArrayList;
// import java.util.LinkedList;

// public class Seminar4 {
//     public static void main(String[] args) {
//         long time1=System.currentTimeMillis();
//         ArrayList<Integer> arr1=new ArrayList<Integer>();
//         for (int i=0;i<=100000;i++){
//             arr1.add(0,i);
//         }
//         long time2=System.currentTimeMillis();
//         int result1=(int)(time2-time1);
//         System.out.println("Результат ArrayList = "+result1+"ms");

//         long tim1=System.currentTimeMillis();
//         LinkedList<Integer> arr2=new LinkedList<Integer>();
//         for (int i=0;i<=100000;i++){
//             arr2.add(0,i);
//         }
//         long tim2=System.currentTimeMillis();
//         int result2=(int)(tim2-tim1);
//         System.out.println("Результат LinkedList = "+result2+"ms");
//     }
// }

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку
// 2. сохранить text в связный список.
// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

// ввод asd
// [asd]
// ввод fdhg
// [asd, fdhg]
// ввод fvgh
// [asd, fdhg, fvgh]
// print~1
// вывод fdhg
// [asd, fvgh]

// package Seminars;

// import java.util.LinkedList;
// import java.util.Scanner;

// public class Seminar4 {
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         LinkedList<String> arr_list=new LinkedList<>();
//         while (true){
//             System.out.println(arr_list);
//             System.out.print("введите текст: ");
//             String text=scan.next();
//             if (text.contains("print~")){
//                 int remove_idx=Integer.parseInt(text.split("~")[1]);
//                 System.out.println(arr_list.get(remove_idx-1));
//                 arr_list.remove(remove_idx-1);
//             }
//             else {
//                 arr_list.add(text);
//             }
//         } 
//     }
// }

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.

package Seminars;

import java.util.Scanner;
import java.util.Stack;

public class Seminar4 {
    public static void main(String[] args) {
        Scanner scan_line = new Scanner(System.in);
        Stack<String> arr_list = new Stack<>();
        String text = "";
        while (!text.contains("print")) {
            System.out.println(arr_list);
            System.out.print("Введите текст: ");
            text = scan_line.next();
            if (text.contains("print")) {
                while (!arr_list.isEmpty()) {
                    System.out.print(arr_list.pop());
                }
            } else {
                arr_list.push(text);
            }
        }
    }
}