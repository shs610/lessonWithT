package FinalProject;
import java.util.Scanner;
import java.util.ArrayList;

class classStudent {  // 학생 클래스 - DB 역할
    private int studentNumber;  // 학번
    private String studentName;  // 이름

    ArrayList<classGrade> studentGrade;  // 성적리스트(Arraylist)
    public ArrayList<classGrade> getstudentGrade() {return studentGrade;}  // get 성적
    public String getName() {return studentName;}  // getName 이름
    public int getNumber() {return studentNumber;}  // getNumber 학번

    public void setName(String studentName) {this.studentName = studentName;}  // setName 이름
    public void setNumber(int studentNumber) {this.studentNumber = studentNumber;}  // getNumber 학번
    public void setstudentGrade(ArrayList<classGrade> studentGrade) {this.studentGrade = studentGrade;}  // set 성적
    public classStudent(int studentNumber, String studentName, ArrayList<classGrade> studentGrade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }
    public String toString(){  // String으로 형변환
        return "학번:" + studentNumber + ", " + "이름:" + studentName + ", " + "과목:" + studentGrade ;
    }
}

class Professser {


}

class classGrade {
    private String subject;
    private int grade;  // 성적
    public String getSubject() {return subject;}  // getgrade 성적
    public void setSubject(String subject) {this.subject = subject;}// setgrade 성적
    public int getgrade() {return grade;}  // getgrade 성적
    public void setgrade(int grade) {this.grade = grade;}

    classGrade(String subject, int grade){
        this.subject = subject;
        this.grade = grade;
    }

    public String toString(){
        return "과목:" + subject  + ", "+ "점수:" + grade ;
    }

}

public class FinalUniversity {
    public static void main(String[] args) {
        ArrayList<classStudent> students = new ArrayList<>();  // 학생 정보를 넣을 리스트
        ArrayList<classGrade> grade = new ArrayList<>();
        grade.add(new classGrade("coding", 10));
        grade.add(new classGrade("java", 20));
        classStudent s = new classStudent(202412345, "Amy", grade);
        students.add(s);
        Scanner sc = new Scanner(System.in);
        System.out.println("id를 입력하세요");
        int id = sc.nextInt();

        for (classStudent st : students) {  // 아이디(학번)를 입력받고 그 학생의 이름과 과목, 성적 출력(성적조회)
            if (id == st.getNumber()) {
                System.out.println(st);
            }
        }
    }
}
