// №1.=====
// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

// package Seminars;

// import java.util.Scanner;

// public class Seminar1 {
//     public static void main(String[] args) {
//         Scanner iScanner=new Scanner(System.in, "Cp866");
//         System.out.printf("Введите ваше имя: ");
//         String name=iScanner.nextLine();
//         System.out.printf("Привет, %s", name);
//         iScanner.close();
//     }
// }

// №2.===== 
// Дан массив двоичных чисел, например [1,1,0,1,1,1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

// Вывод: 4

// package Seminars;

// import java.util.Arrays;

// public class Seminar1 {
//     public static void main(String[] args) {
//         int[] arr=new int[]{1,1,0,1,1,1,1,0,1,1,1,1,1};
//         int count=0;
//         int count_max=0;    
//         for (int i: arr) {
//             if (i==1) {
//                 count++;
//             }
//             else {
//                 if (count>=count_max) {
//                     count_max=count;
//                 }
//                 count=0;
//             }
//         }
//         if (count>=count_max) {
//             count_max=count;
//         }
//         System.out.println(Arrays.toString(arr));
//         System.out.print(count_max);
//     }
// }



// №3.=====
// Дан массив nums = [3,2,2,3,4,3] и число val вводим с клавиатуры

// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
// Ввод: 3
// Вывод:
// 2, 2, 4, 3, 3, 3

// вариант 1.===
// package Seminars;

// import java.util.Arrays;

// public class Seminar1 {
//     public static void main(String[] args) {
//         int[] nums=new int[]{3,2,2,3,4,3};
//         int val = 3;
//         int ideax = 0;
//         for (int i=0;i<nums.length;i++) {
//             if (val!=nums[i]) {
//                 nums[ideax]=nums[i];
//                 ideax++;
//             }    
//         }
//         for (int i=ideax;i<nums.length;i++) {
//             nums[i]=val;
//         }
//         for (int i:nums) {
//         System.out.print(i+" ");
//         }
//     } 
// }

// вариант 2.===
package Seminars;

import java.util.Arrays;
import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
        int[] nums=new int[]{3,2,2,3,4,3};
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int usersNum=input.nextInt();
        System.out.println(Arrays.toString(formatedArray1(nums,usersNum)));
    }
    public static int[] formatedArray1(int[]usersArray,int usersNum) {
        int[] formArr=new int [usersArray.length];
        int j=0;
        int k=0;
        for (int i=0;i<usersArray.length;i++) {
            if (usersArray[i]==usersNum){
                formArr[formArr.length-(k+1)]=usersArray[i];
                k++;
            }
            else {
                formArr[j]=usersArray[i];
                j++;
            }
        }
        return formArr;
    }
}