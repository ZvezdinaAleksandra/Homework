package homework9;
/*На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}*/

import java.util.HashMap;
import java.util.Map;

public class Homework9_3 {
        public static Map<String, Boolean> wordMultiple(String[] strings) {
            Map<String, Boolean> result = new HashMap<>();

            for (String str : strings) {
                if (result.containsKey(str)) {
                    result.put(str, true);
                } else {
                    result.put(str, false);
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String[] arr = {"a", "b", "a", "c", "b"};
            System.out.println(wordMultiple(arr));
        }
    }

