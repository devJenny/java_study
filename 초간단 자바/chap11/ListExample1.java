package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListExample1 {
    public static void main(String[] args) {
        System.out.println("저장할 음식 이름 입력.(종료: 0)");
        List<String> foods = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String food = sc.nextLine();

            if (food.equals("0")) {
                break;
            }
            if (foods.contains(food)) {
                System.out.println("이미 목록에 있습니다.");
            } else {
                foods.add(food);
            }
        }

        Collections.sort(foods); //오름차순 정렬
        Collections.reverse(foods); //내림차순 정렬
        Collections.shuffle(foods); //랜덤

        System.out.println("점심 추천 메뉴: " + foods.get(0));

    }
}
