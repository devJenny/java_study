package chap05;

public class StringExample2 {
    public static void main(String[] args) {
        String me = "살은 내가 쪄요.";
        System.out.println(me.length()); // 공백도 글자수에 포함

        int length = me.length();
        System.out.println(length);
    }
}
