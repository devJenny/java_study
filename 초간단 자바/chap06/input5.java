package chap06;

import java.util.Scanner;

//예외처리
public class input5 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String intInput = sc.nextLine();
        try { //예외 발생 가능성이 있는 코드
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue + 1);
        } catch (Exception e) { //예외 발생했을 때 실행될 코드
            System.out.println("숫자를 입력해야 합니다.");
        }



    }
}
