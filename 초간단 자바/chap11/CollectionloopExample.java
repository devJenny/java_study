package chap11;

import java.util.ArrayList;
import java.util.List;

public class CollectionloopExample {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();

        foods.add("치킨");
        foods.add("피자");
        foods.add("고구마말랭이");

        for (String food : foods) {
            System.out.println(food + " 맛있어요");
        }

        if (foods.size() == 0) {
            System.out.println("목록이 비어있습니다");
        } else {
            System.out.println("총 " + foods.size() + "개의 음식 목록이 있습니다");
        }

        foods.remove("치킨");
        foods.remove("피자");
        foods.remove("고구마말랭이");

        if (foods.isEmpty()) {
            System.out.println("목록이 비어있습니다");
        } else {
            System.out.println("총 " + foods.size() + "개의 음식 목록이 있습니다");
        }
    }
}
