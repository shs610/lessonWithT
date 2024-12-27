package lesson_241115;
import java.util.Scanner;
public class Judge_Leapyear {
    public static void main(String[] args) {
        while (true) {
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("연도를 입력하세요 : ");
            int year = sc.nextInt();
            if (year == 0) {  // 종료
                System.out.println("프로그램 종료");
                break;
            }
            else if ((year % 400 == 0) || (year % 4 == 0 & year % 100 != 0)) {  // & : and(모두가 참이어야 참), | : or(둘중 하나라도 참이면 참)
                System.out.println("윤년");
            }

            else if (year < 0) {  // 음수일 때
                System.out.println("틀린 연도입니다");
            }
            else {
                System.out.println("평년");
            }
        }
    }
}
