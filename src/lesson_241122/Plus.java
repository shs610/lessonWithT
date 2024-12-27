package lesson_241122;
import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        while (true){
            int x = 0;  // 반복문 안에서 초기화해주기
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자를 입력하세요 : ");
            int num = sc.nextInt();  // 더할 마지막 수
            if (num < 0) {
                System.out.println("0 이상의 수를 입력하세요");
            }
            else {
                for (int start = 0; start <= num; start++) {
                    x += start;
                }
                System.out.println("값 : " + x);
                System.out.println();
            }
        }
    }
}
