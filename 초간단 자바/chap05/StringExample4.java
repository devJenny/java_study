package chap05;
// 문자열 자르기
// 문자열 위치는 0부터 시작
public class StringExample4 {
    public static void main(String[] args) {
        String birthday = "1970/01/01";
        String year = birthday.substring(0, 4);
        String day = birthday.substring(8);

        System.out.println(year);
        System.out.println(day);
    }
}
