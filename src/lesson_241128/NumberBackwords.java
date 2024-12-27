package lesson_241128;
import java.util.Scanner;

public class NumberBackwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("숫자를 입력하세요 : ");  // 출력할 숫자 입력받기
            int num = sc.nextInt();  // 입력받은 수를 num에 저장
            if (num > 0) {  // 입력 받은 수가 자연수일 때
                for (int start = num; num >= 0; num--) {  // 초깃값은 num, 반복횟수는 num이 0이 될 때까지, 증감값은 -1
                    System.out.print(num + "\t");  // 한줄에 출력하기 위해 \t 사용
                }
                System.out.println();
            }
            else if (num == 0) {  // 0을 종료코드로 설정
                System.out.println("종료하겠습니다");
                break;
            }
            else {  // 모든 예외
                System.out.println("자연수를 입력해주세요");
            }
        }
    }
}

