package chap08;

import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args) {
        String password = "abc123";
        Scanner sc = new Scanner(System.in);

        String input;

        do {
            System.out.println("비밀번호를 입력해주세요.");
            input = sc.nextLine();
        } while (input.equals(password) != true);

        System.out.println("올바른 비밀번호를 입력했습니다.");
    }
}
