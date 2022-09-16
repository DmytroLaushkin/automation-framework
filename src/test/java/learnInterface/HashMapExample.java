import java.util.HashMap;
import java.util.Map;

public interface HashMapExample {

     class HashMapEx1 {
        public static void main(String[] args) {
            Map<Integer, String> map1 = new HashMap<>();
            map1.put(10, "Dima");
            map1.put(15, "Natasha");
            map1.put(16, "Masha");
            map1.put(17, "Olga");
            map1.putIfAbsent(10, "Dimon");
            System.out.println(map1);
            System.out.println(map1.get(10));
            System.out.println(map1.containsValue("Dima"));
            System.out.println(map1.keySet());
            System.out.println(map1.containsKey(15));

        }
    }

}
