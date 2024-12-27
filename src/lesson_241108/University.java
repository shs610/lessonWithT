package lesson_241108;
// import java.util.Scanner;

class Grade {  // 성적 클래스
    void ShowGrade(int score) {
        if (score < 0) {
            System.out.println("0이상의 점수를 입력하세요. ");
        } else if (score >= 95) {  // 100~95
            System.out.println("과목명 : 알고리즘, " + score + "점 - A+등급");
        } else if (score >= 90) {  // 94~90
            System.out.println("과목명 : 알고리즘, " + score + "점 - A등급");
        } else if (score >= 85) {  // 89~85
            System.out.println("과목명 : 알고리즘, " + score + "점 - B+등급");
        } else if (score >= 80) {  // 84~80
            System.out.println("과목명 : 알고리즘, " + score + "점 - B등급");
        } else if (score >= 75) {  // 79~75
            System.out.println("과목명 : 알고리즘, " + score + "점 - C+등급");
        } else if (score >= 65) {  // 74~65
            System.out.println("과목명 : 알고리즘, " + score + "점 - C등급");
        } else if (score >= 51) {  // 64~51
            System.out.println("과목명 : 알고리즘, " + score + "점 - D등급");
        } else if (score >= 0) {  // 51~0
            System.out.println("과목명 : 알고리즘, " + score + "점 - F등급");
        }
    }
}

public class University {
    public static void main(String[] args) {
        Grade g = new Grade();
        g.ShowGrade(0);

    }
}
