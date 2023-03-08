package itschoolS13.extend3;

import itschoolS13.extend3.Student;

public class UniversityService {

    public static void main(String[] args) {
        Student studentMaria = new Student();
        System.out.println(studentMaria.getFirstName());
        studentMaria.setFirstName("Maria");
        System.out.println(studentMaria.getFirstName());

    }
}
