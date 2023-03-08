package challengesession;

import java.util.ArrayList;
import java.util.List;

public class ManagementCoursesAndInfo {

    public static void main(String[] args) {
        ProfessorInfo professorMathInfo = new ProfessorInfo();
        professorMathInfo.setFirstName("Pleava");
        professorMathInfo.setLastName("Petru");
        professorMathInfo.setAddress("Timisoara");
        professorMathInfo.setAge(61);
        professorMathInfo.setSex("Male");
        professorMathInfo.setCNP("2312945918951125");
        professorMathInfo.setDateOfBirthday("4.12.1970");


        ProfessorInfo professorComputerScience = new ProfessorInfo();
        professorComputerScience.setFirstName("Ionut");
        professorComputerScience.setLastName("Andrei");
        professorComputerScience.setAddress("Timisoara");
        professorComputerScience.setAge(35);
        professorComputerScience.setSex("Male");
        professorComputerScience.setCNP("94857845723875");
        professorComputerScience.setDateOfBirthday("5.10.1990");

        ProfessorInfo professorPhysics = new ProfessorInfo();
        professorPhysics.setFirstName("Anamaria");
        professorPhysics.setLastName("Anastasie");
        professorPhysics.setAddress("Timisoara");
        professorPhysics.setAge(33);
        professorPhysics.setSex("Female");
        professorPhysics.setCNP("74854845323669");
        professorPhysics.setDateOfBirthday("2.04.1992");

        ProfessorInfo professorChemistry = new ProfessorInfo();
        professorChemistry.setFirstName("Maria");
        professorChemistry.setLastName("Tataru");
        professorChemistry.setAddress("Timisoara");
        professorChemistry.setAge(37);
        professorChemistry.setSex("Female");
        professorChemistry.setCNP("75757845553889");
        professorChemistry.setDateOfBirthday("1.11.1987");

        ProfessorInfo professorBiology = new ProfessorInfo();
        professorBiology.setFirstName("Janeta");
        professorBiology.setLastName("Igret");
        professorBiology.setAddress("Timisoara");
        professorBiology.setAge(45);
        professorBiology.setSex("Female");
        professorBiology.setCNP("228578457235542");
        professorBiology.setDateOfBirthday("5.10.1978");

        ProfessorInfo professorGeography = new ProfessorInfo();
        professorGeography.setFirstName("George");
        professorGeography.setLastName("Timisan");
        professorGeography.setAddress("Timisoara");
        professorGeography.setAge(29);
        professorGeography.setSex("Male");
        professorGeography.setCNP("56857845723822");
        professorGeography.setDateOfBirthday("18.09.1994");

        ProfessorInfo professorEnglish = new ProfessorInfo();
        professorEnglish.setFirstName("Mircea");
        professorEnglish.setLastName("Golban");
        professorEnglish.setAddress("Timisoara");
        professorEnglish.setAge(39);
        professorEnglish.setSex("Male");
        professorEnglish.setCNP("67857845723843");
        professorEnglish.setDateOfBirthday("22.07.1989");

        ProfessorInfo professorHistory = new ProfessorInfo();
        professorHistory.setFirstName("Artemis");
        professorHistory.setLastName("Lavinia");
        professorHistory.setAddress("Timisoara");
        professorHistory.setAge(38);
        professorHistory.setSex("Female");
        professorHistory.setCNP("2757845723877");
        professorHistory.setDateOfBirthday("07.05.1987");

        System.out.println();

        StudentInfo studentForCourseMath = new StudentInfo();
        studentForCourseMath.setFirstName("Adrian");
        studentForCourseMath.setLastName("Adi");
        studentForCourseMath.setAddress("Timisoara");
        studentForCourseMath.setAge(18);
        studentForCourseMath.setSex("Male");
        studentForCourseMath.setCNP("2139128741712");
        studentForCourseMath.setDateOfBirthday("15.10.2022");

        StudentInfo studentForCourseComputerScience = new StudentInfo();
        studentForCourseComputerScience.setFirstName("Anamaria");
        studentForCourseComputerScience.setLastName("Ana");
        studentForCourseComputerScience.setAddress("Timisoara");
        studentForCourseComputerScience.setAge(18);
        studentForCourseComputerScience.setSex("Female");
        studentForCourseComputerScience.setCNP("904581238946521");
        studentForCourseComputerScience.setDateOfBirthday("27.09.2004");

        StudentInfo studentForCoursePhysics = new StudentInfo();
        studentForCoursePhysics.setFirstName("Lucretia");
        studentForCoursePhysics.setLastName("Mariana");
        studentForCoursePhysics.setAddress("Timisoara");
        studentForCoursePhysics.setAge(18);
        studentForCoursePhysics.setSex("Female");
        studentForCoursePhysics.setCNP("24382174124214");
        studentForCoursePhysics.setDateOfBirthday("12.12.2004");

        StudentInfo studentForCourseChemistry = new StudentInfo();
        studentForCourseChemistry.setFirstName("Antonia");
        studentForCourseChemistry.setLastName("Rebeca");
        studentForCourseChemistry.setAddress("Timisoara");
        studentForCourseChemistry.setAge(18);
        studentForCourseChemistry.setSex("Female");
        studentForCourseChemistry.setCNP("2094298794527");
        studentForCourseChemistry.setDateOfBirthday("19.09.2004");

        StudentInfo studentForCourseBiology = new StudentInfo();
        studentForCourseBiology.setFirstName("Mirel");
        studentForCourseBiology.setLastName("Anton");
        studentForCourseBiology.setAddress("Timisoara");
        studentForCourseBiology.setAge(18);
        studentForCourseBiology.setSex("Male");
        studentForCourseBiology.setCNP("9823745186124");
        studentForCourseBiology.setDateOfBirthday("24.08.2004");

        StudentInfo studentForCourseGeography = new StudentInfo();
        studentForCourseGeography.setFirstName("Banica");
        studentForCourseGeography.setLastName("Alexandra");
        studentForCourseGeography.setAddress("Timisoara");
        studentForCourseGeography.setAge(18);
        studentForCourseGeography.setSex("Female");
        studentForCourseGeography.setCNP("90821374812452");
        studentForCourseGeography.setDateOfBirthday("17.03.2004");

        StudentInfo studentForCourseEnglish = new StudentInfo();
        studentForCourseEnglish.setFirstName("Alexandru");
        studentForCourseEnglish.setLastName("Sergiu");
        studentForCourseEnglish.setAddress("Timisoara");
        studentForCourseEnglish.setAge(18);
        studentForCourseEnglish.setSex("Male");
        studentForCourseEnglish.setCNP("19827482142454");
        studentForCourseEnglish.setDateOfBirthday("11.08.2004");

        StudentInfo studentForCourseHistory = new StudentInfo();
        studentForCourseHistory.setFirstName("Bogdan");
        studentForCourseHistory.setLastName("Georgel");
        studentForCourseHistory.setAddress("Timisoara");
        studentForCourseHistory.setAge(18);
        studentForCourseHistory.setSex("Male");
        studentForCourseHistory.setCNP("29348189452235");
        studentForCourseHistory.setDateOfBirthday("04.07.2004");

        System.out.println();

        CoursesInfo coursesInfo = new CoursesInfo();
        coursesInfo.setMath("Math");
        coursesInfo.setComputerScience("Computer Science");
        coursesInfo.setPhysics("Physics");
        coursesInfo.setChemistry("Chemistry");
        coursesInfo.setBiology("Biology");
        coursesInfo.setGeography("Geography");
        coursesInfo.setEnglish("English");
        coursesInfo.setHistory("History");

        System.out.println("The professor: ");
        System.out.println("First Name: " + professorMathInfo.getFirstName());
        System.out.println("Last Name: " + professorMathInfo.getLastName());
        System.out.println("Address: " + professorMathInfo.getAddress());
        System.out.println("Age: " + professorMathInfo.getAge());
        System.out.println("Sex type: " + professorMathInfo.getSex());
        System.out.println("CNP: " + professorMathInfo.getCNP());
        System.out.println("Date of birthday: " + professorMathInfo.getDateOfBirthday());
        System.out.println("Teach the Student: ");
        System.out.println("First Name: " + studentForCourseMath.getFirstName());
        System.out.println("Last Name: " + studentForCourseMath.getLastName());
        System.out.println("Address: " + studentForCourseMath.getAddress());
        System.out.println("Age: " + studentForCourseMath.getAge());
        System.out.println("Sex type: " + studentForCourseMath.getSex());
        System.out.println("CNP: " + studentForCourseMath.getCNP());
        System.out.println("Date of Birthday: " + studentForCourseMath.getDateOfBirthday());
        System.out.println();
        System.out.println("For the course: " + coursesInfo.getMath());


    }
}
