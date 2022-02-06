package chap05;
// 문자열 바꾸기
public class StringExample3 {
    public static void main(String[] args) {
        String me = "살은 내가 쪄요.";
        System.out.println(me.replaceAll("내가","치킨이"));

        String replaced = me.replaceAll("내가", "치킨이");
        System.out.println(replaced);
    }
}
