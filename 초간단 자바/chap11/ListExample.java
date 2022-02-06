package chap11;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<Integer>();
//        ArrayList<Integer> list3 = new ArrayList<>();

        List<String> list = new ArrayList<>();
        list.add("치킨"); //추가
        list.add("피자");
        list.add("떡볶이");
        list.add("떡볶이"); //중복값 허용

//        list.remove("치킨"); //제거
//        list.remove(0.);
//
//        list.set(0, "피자"); //값 변경
//
//        System.out.println(list);
//        System.out.println(list.get(0));
//
//        String food01 = list.get(0);
//        System.out.println(food01);

        boolean containsChicken = list.contains("치킨");
        System.out.println(containsChicken);


    }
}
