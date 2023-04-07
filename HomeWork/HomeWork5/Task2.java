// №2.=====
// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package HomeWork.HomeWork5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        Map<String, String> baza = new HashMap<>();
    
        baza.put("Иванов", "Иван");
        baza.put("Петрова", "Светлана");
        baza.put("Белова", "Кристина");
        baza.put("Мусина", "Анна");
        baza.put("Крутова", "Анна");
        baza.put("Юрин", "Иван");
        baza.put("Лыков", "Петр");
        baza.put("Чернов", "Павел");
        baza.put("Чернышов", "Петр");
        baza.put("Федорова", "Мария");
        baza.put("Светлова", "Марина");
        baza.put("Савина", "Мария");
        baza.put("Рыкова", "Мария");
        baza.put("Лугова", "Марина");
        baza.put("Владимирова", "Анна");
        baza.put("Мечников", "Иван");
        baza.put("Петин", "Петр");
        baza.put("Ежов", "Иван");

        HashMap<String, Integer> countName = new HashMap<>();
        ArrayList<String> name = new ArrayList<>();

        for (Map.Entry<String, String> item : baza.entrySet()) {

            name.add(item.getValue());

        }

        for (int i = 0; i < name.size(); i++) {
            String temp = name.get(i);

            if (!countName.containsKey(temp)) {
                countName.put(temp, 1);
            } else {
                countName.put(temp, countName.get(temp) + 1);
            }
        }
        Map<String, Integer> sortedMap = countName.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        sortedMap.entrySet().forEach(System.out::println);
    }
}
