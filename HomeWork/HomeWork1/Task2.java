// Вывести все простые числа от 1 до 1000

package HomeWork.HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        // boolean b = true;
        for (int i = 2; i <=1000; i++) {
            Integer rez = i;
            for (int j=2; j <i; j++) {
                if (i%j==0) {
                    rez = null;
                    break;
                }
            }
            if (rez!=null) System.out.print(rez+" ");
        }
    }
}
    

