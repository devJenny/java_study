package chap12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>(); //Map<키, 값> - 관계 표현
        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");

        if (dictionary.isEmpty()) {
            System.out.println("단어가 하나도 없습니다");
            System.exit(0);
        } else {
            System.out.println(dictionary.size() + " 개의 단어가 있습니다");
        }

//        Collection<String> keys = dictionary.keySet();

//        for (String english : keys) {
//            String korean = dictionary.get(english);
//            System.out.println(korean);

        Collection<String> values = dictionary.values();

        for (String korean : values) {
            System.out.println(korean);
        }

        Set<Map.Entry<String, String>> entries = dictionary.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String english = entry.getKey();
            String korean = entry.getValue();

            System.out.println(english + ": "+ korean);
        }
    }
}
