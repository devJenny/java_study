package chap08;

public class WhileBreak1 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println("반복문 진입");
            if (i == 2) {
                break;
            }
            i++;
            System.out.println("반복문 끝");
        }
    }
}
