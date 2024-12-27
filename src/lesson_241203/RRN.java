package lesson_241203;
import java.util.Scanner;

public class RRN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요 : ");
        String num = sc.next();
        char[] one = new char[14];  // 배열(14칸으로 구성되었다)

        for (int i = 0; i < one.length; i++) {  // 1번째 칸부터, 마지막칸까지, 1씩 증가
            one[i] = num.charAt(i);  // num에 들어간 문자 하나씩 one에 저장
        }

        if (one[7] == '1' || one[7] == '2' || one[7] == '3' || one[7] == '4'){  // char은 ''로 감싸줘야함
            for (int i = 8; i < one.length; i++) {  // 8번째 칸부터, 마지막까지, 1씩 증가
                one[i] = '*';  // 뒷번호 2번째칸부터 *로 출력
            }
            System.out.println(one);
        }
        else {
            System.out.println("error");
        }
    }
}
