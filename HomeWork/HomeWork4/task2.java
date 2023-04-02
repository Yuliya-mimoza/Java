// №2.=====
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package HomeWork.HomeWork4;

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        System.out.println("Нам даны методы: ");
        System.out.println("enqueue() - помещает элемент в конец очереди");
        System.out.println("dequeue() - возвращает первый элемент из очереди и удаляет его");
        System.out.println("first() - возвращает первый элемент из очереди, не удаляя");
        System.out.println("Выберите метод когда будете готовы: 'enqueue()' или 'dequeue()' или 'first()'");
        System.out.println("А пока сформируем список: ");
        LinkedList<String> array = new LinkedList<String>();
        Scanner input=new Scanner(System.in);
        while (true){
            array.remove("enqueue()");
            System.out.println(array);
            System.out.print("введите элемент списка или метод: ");
            String text=input.next();
            if (text.contains("enqueue()")){
                array = enqueue(array);
            }
            if (text.contains("enqueue()")){
                array.remove("enqueue()");
            }
            if (text.contains("dequeue()")){
                array = dequeue(array);
            }
            if (text.contains("first()")){
                System.out.println("Первый элемент в списке: " +first(array));
            }
            else {
                array.add(text);
            }
        }
    }

    public static LinkedList enqueue(LinkedList<String> list) {
        System.out.println("Введите ещё один элемент: ");
        Scanner input = new Scanner(System.in);
        String element = input.next();
        list.addLast(element);
        return list;
    }

    public static LinkedList dequeue(LinkedList<String> list) {
        System.out.println("Первый элемент списка, который сейчас удалим: "+list.getFirst());
        list.pollFirst();
        return list;
    }

    public static String first(LinkedList<String> list) {
        String element = list.peekFirst();
        return element;
    }
}


