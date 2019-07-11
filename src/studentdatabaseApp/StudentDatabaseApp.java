package studentdatabaseApp;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student student = new Student();
        student.enroll();
        student.viewBalance();
        student.payTuition(200);

    }
}
