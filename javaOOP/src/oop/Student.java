package oop;

public class Student {
    private String names;
    private int age;
    private String gender;
    private int IDNO;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIDNO() {
        return IDNO;
    }

    public void setIDNO(int IDNO) {
        this.IDNO = IDNO;
    }

    @Override
    public String toString() {
        return "Student{" +
                "names='" + names + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", IDNO=" + IDNO +
                '}';
    }
}
