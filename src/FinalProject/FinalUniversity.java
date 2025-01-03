package FinalProject;
import java.util.Scanner;
import java.util.ArrayList;

class classStudent {  // 학생 클래스 - DB 역할
    private int studentNumber;  // 학번
    private String studentName;  // 이름
    ArrayList<classGrade> studentGrade;  // 성적리스트(Arraylist)
    private String subject;  // 과목
    public ArrayList<classGrade> getstudentGrade() {return studentGrade;}  // get 성적
    public String getName() {return studentName;}  // getName 이름
    public int getNumber() {return studentNumber;}  // getNumber 학번
    public String getSubject() {return subject;}  // getSubject 과목
    public void setName(String studentName) {this.studentName = studentName;}  // setName 이름
    public void setNumber(int studentNumber) {this.studentNumber = studentNumber;}  // getNumber 학번
    public void setstudentGrade(ArrayList<classGrade> studentGrade) {this.studentGrade = studentGrade;}  // set 성적
    public void setSubject(String subject) {this.subject = subject;}  // set 과목
    public classStudent(int studentNumber, String studentName, String subject) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.subject = subject;
    }
}

class classGrade {
    private String grade;  // 성적
    public String getgrade() {return grade;}  // getgrade 성적
    public void setgrade(String grade) {this.grade = grade;}  // setgrade 성적

}

public class FinalUniversity {
    public static void main(String[] args) {
        ArrayList<classStudent> students = new ArrayList<>();  // 학생 정보를 넣을 리스트
        classStudent s = new classStudent(202412345, "Amy", "Coding");
        students.add(s);
        Scanner sc = new Scanner(System.in);
        System.out.println("id를 입력하세요");
        int id = sc.nextInt();

        for (classStudent st : students) {  // 아이디(학번)를 입력받고 그 학생의 이름과 과목, 성적 출력(성적조회)
            if (id == st.getNumber()) {
                System.out.println("name : " + st.getName() + ", " + "subject : " + st.getSubject());
            }
        }
    }
}
