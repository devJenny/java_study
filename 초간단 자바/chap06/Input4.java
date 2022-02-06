package chap06;

import java.util.Scanner;

public class Input4 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String intInput = sc.nextLine();
        System.out.println(intInput + 1); //문자열로 인식
        // 100 입력하면 1001 출력

        int intValue = Integer.parseInt(intInput); //숫자로 변환
        System.out.println(intValue + 1);
        // 100 입력하면 101 출력
    }
}
