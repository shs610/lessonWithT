package lesson_241224;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        int index = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.println("이름을 입력해 주세요");
            names.add(sc.nextLine());
        }
        for (int i = 0; i <= 4; i++) {
            String name = names.get(i);
            if (name.startsWith("김")) {
                index++;
                System.out.printf("[%s]\t", names.get(i));
            }
        }

        System.out.println();
        System.out.println("김씨 성을 가진 분은 모두" + index + "명 입니다.");
    }
}
