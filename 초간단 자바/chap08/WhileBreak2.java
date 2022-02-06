package chap08;

import java.util.Scanner;

public class WhileBreak2 {
    public static void main(String[] args) {
        String password = "chicken1004";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("비밀번호를 입력해주세요");
            String input = sc.nextLine();

            if (input.equals(password)) {
                System.out.println("비밀번호가 일치합니다");
                break;
            }
            System.out.println("비밀번호가 틀렸습니다");
        }
    }
}
