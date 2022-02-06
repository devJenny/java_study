package chap08;

import java.util.Arrays;

//배열 복사
public class ArrayExample5 {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};

        String[] days2 = Arrays.copyOf(days, 8);
        days2[7] = "일";
        for (String day : days2) {
            System.out.println(day + "요일");
        }
    }
}
