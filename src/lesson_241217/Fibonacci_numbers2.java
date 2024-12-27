package lesson_241217;
import java.util.Scanner;

public class Fibonacci_numbers2 {  // 재귀(recursive)
    public static int recursive(int n) {
        if (n <= 1) {  // 0과 1을 기본으로 있게 하기 위함
            return n;
        } else {
            return recursive(n - 2) + recursive(n - 1);  // 규칙
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2이상의 수를 입력하세요 : ");
        int n = sc.nextInt();  // 매개변수를 입력받기
        for (int i = 0; i <= n; i++) {  // 앞의 숫자들을 출력하기 위한 것
            System.out.print(recursive(i) + " ");
        }
    }
}
