import oop.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(10);
        student.setGender("male");
        student.setNames("jack");
        student.setIDNO(1001);
        System.out.println(student.toString());
    }


}
