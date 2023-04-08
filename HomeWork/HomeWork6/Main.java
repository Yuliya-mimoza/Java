package HomeWork.HomeWork6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notes = Arrays.asList(
                new Notebook(8, 500, "Windows 8", "Серый"),
                new Notebook(8, 500, "Windows 10", "Белый"),
                new Notebook(16, 1000, "Windows 11", "Серебристый"),
                new Notebook(4, 250, "Windows 7", "Черный"),
                new Notebook(8, 750, "Windows 10", "Красный"),
                new Notebook(16, 1500, "MacOS", "Серый"),
                new Notebook(6, 500, "Windows 8", "Белый"),
                new Notebook(8, 500, "MacOS", "Серебристый"),
                new Notebook(4, 250, "Linux", "Синий"),
                new Notebook(32, 2000, "Windows 11", "Серый"),
                new Notebook(12, 1000, "Windows 10", "Белый"),
                new Notebook(6, 1000, "Windows 11", "Красный"),
                new Notebook(24, 2500, "Linux", "Черный"),
                new Notebook(32, 3000, "MacOS", "Синий"),
                new Notebook(12, 1000, "Linux", "Серебристый"));

        System.out.println("Выберите фильтр: ");
        System.out.println("'1' - поиск по объему оперативной памяти ");
        System.out.println("'2' - поиск по объему жесткого диска ");
        System.out.println("'3' - поиск по операционной системе ");
        System.out.println("'4' - поиск по цвету ");
        Scanner scan = new Scanner(System.in, "cp866");
        String text = scan.next();
        switch (text) {
            case "1":
                System.out.println("Введите минимальный объем оперативной памяти (Гб) : ");
                Integer Ram = scan.nextInt();
                notes.stream()
                        .filter(p -> (p.getRam() >= Ram))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
                break;
            case "2":
                System.out.println("Введите минимальный объем жесткого диска (Гб): ");
                Integer Hdd = scan.nextInt();
                notes.stream()
                        .filter(p -> (p.getHdd() >= Hdd))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
                break;
            case "3":
                System.out.println("Введите предпочитаемую операционную систему: ");
                String Os = scan.next();
                notes.stream()
                        .filter(p -> (p.getOs() == Os.intern()))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
                break;
            case "4":
                System.out.println("Введите предпочитаемый цвет ноутбука: ");
                String Color = scan.next();
                notes.stream()
                        .filter(p -> (p.getColor() == Color.intern()))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
                break;
        }
    }

}
