package chap11;

import java.util.HashSet;
import java.util.Set;

//중복값 허용 ㄴㄴ, 순서가 없다
public class SetExample {
    public static void main(String[] args) {
        Set<String> myFavoriteFoods = new HashSet<>();

        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");
        myFavoriteFoods.add("치킨");

        myFavoriteFoods.remove("치킨");


        System.out.println(myFavoriteFoods);
    }
}
