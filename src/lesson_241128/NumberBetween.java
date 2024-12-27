package lesson_241128;
import java.util.Scanner;

public class NumberBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        while (true) {
            System.out.println();  // 빈줄
            System.out.println("첫번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();  // 첫번째 수
            System.out.println("두번째 숫자를 입력하세요 : ");
            int num2 = sc2.nextInt();  // 두번째 수
            if (num2 > num1) {  // num2가 num1보다 클 때
                for (int i = num1 + 1; i <= num2 - 1; i++) {  // 초깃값: num1 + 1, 반복횟수(끝값): num2 - 1, 증감값: +1
                    System.out.print(i + " ");
                }
                System.out.println();  // 빈줄
            } else if (num2 < num1) {  // num1이 num2보다 클 때
                for (int i = num2 + 1; i <= num1 - 1; i++) {  // 초깃값: num2 + 1, 반복횟수(끝값): num1 - 1, 증감값: +1
                    System.out.print("result : " + i + " ");
                }
            } else {
                System.out.println("잘못된 행동입니다");
                break;
            }
        }
    }
}
