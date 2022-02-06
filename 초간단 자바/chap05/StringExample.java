package chap05;

public class StringExample {
    public static void main(String[] args) {
        String chichen = "치킨은 살 안 쪄요.";
        String me = "살은 내가 쪄요.";

        System.out.println(chichen);
        System.out.println(me);

        String chichenAndMe = chichen + me;
        System.out.println(chichenAndMe);
    }
}
