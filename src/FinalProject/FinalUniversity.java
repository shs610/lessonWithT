package FinalProject;
import java.util.Scanner;
import java.util.ArrayList;

class classStudent {
    private int studentNumber;  // 학번
    private String studentName;  // 이름
    ArrayList<classGrade> studentGrade;  // 성적리스트
    ArrayList<classGrade> getstudentGrade() {return studentGrade;}  // get 성적
    String getName() {return studentName;}  // getName 이름
    int getNumber() {return studentNumber;}  // getNumber 학번
    void setName(String studentName) {this.studentName = studentName;}  // setName 이름
    void setNumber(int studentNumber) {this.studentNumber = studentNumber;}  //getNumber 학번
    void setstudentGrade(ArrayList<classGrade> studentGrade) {this.studentGrade = studentGrade;}  // set 성적

}

class classGrade {
    private String grade;  // 성적
    private String subject;  // 과목
    String getgrade() {return grade;}  // getgrade 성적
    String getsubject() {return subject;}  // getsubject 과목
    void setgrade(String grade) {this.grade = grade;}  // setgrade 성적
    void setsubject(String subject) {this.subject = subject;}  // setsubject 과목
}

public class FinalUniversity {
    public static void main(String[] args) {
        ArrayList<classStudent> students = new ArrayList<>();
        classStudent s = new classStudent();
        students.add(s);
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

    }
}
