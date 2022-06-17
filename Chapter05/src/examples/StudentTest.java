package examples;

public class StudentTest {
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "¾ÈÇö¼ö";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());

    }
}
