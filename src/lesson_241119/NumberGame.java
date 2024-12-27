package lesson_241119;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String args[]) {
        int answer;
        do {
            Random r = new Random();
            answer = r.nextInt(100);
        }
        while (answer == 0) ;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자를 입력하세요 : ");
            int num = sc.nextInt();
            if (num > answer) {  // 말한 숫자가 정답보다 크다면
                System.out.println("땡 ㅜㅜ / 힌트 : down!");
            }
            else if (num < answer) {
                System.out.println("땡 ㅜㅜ / 힌트 : up!");
            }
            else if (num == answer) {
                System.out.println("정답!! 축하합니다~!");
                break;
            }
        }
    }
}
