package chap08;

public class ArrayExample {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(days[0]);
        System.out.println(days[6]);

        int lengthOfDays = days.length;
        System.out.println(lengthOfDays);
    }
}
