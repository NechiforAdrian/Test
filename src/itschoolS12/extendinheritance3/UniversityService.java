package itschoolS12.extendinheritance3;

public class UniversityService {

    public static void main(String[] args) {
        Student studentMaria = new Student();
        System.out.println(studentMaria.getFirstName());
        studentMaria.setFirstName("Maria");
        System.out.println(studentMaria.getFirstName());

    }
}
