package chap06;
//사용자 입력과 예외 처리

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in); //표준 입력
        String input = scanner.nextLine();
        System.out.println(input);

    }
}
