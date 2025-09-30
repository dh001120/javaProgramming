import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 3;
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            students[i] = new Student();
            students[i].setStudentId(scanner.nextInt());
            students[i].setName(scanner.next());
            students[i].setMajor(scanner.next());
            students[i].setPhoneNumber(scanner.next());

        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + "번째 학생: " + students[i].getStudentId() + " " + students[i].getName() + " "
                    + students[i].getMajor() + " 0" + Long.toString(students[i].getPhoneNumber()).substring(0,2) + "-" +
                    Long.toString(students[i].getPhoneNumber()).substring(2,6) + "-"
                    + Long.toString(students[i].getPhoneNumber()).substring(6) );

        }

    }
}
