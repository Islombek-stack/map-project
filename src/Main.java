import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //1. Создание и добавление элементов
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);

        System.out.println(map); // {Apple=3, Banana=5, Orange=2}

        //2. Получение значения по ключу

        int count = map.get("Apple");
        System.out.println(count); // 3

        //3. Проверка наличия ключа и значения

        if (map.containsKey("Banana")) {
            System.out.println("Есть бананы");
        }

        if (map.containsValue(2)) {
            System.out.println("Есть значение 2");
        }

        //4. Удаление элемента

        map.remove("Orange");
        System.out.println(map); // {Apple=3, Banana=5}

        //5. Перебор Map (цикл)

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //6. Перебор только ключей

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        //7. Перебор только значений

        for (Integer value : map.values()) {
            System.out.println(value);
        }

        //8. Пример: подсчёт количества слов

        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount); // {apple=3, banana=2, orange=1}
    }
}