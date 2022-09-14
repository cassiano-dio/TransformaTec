import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Student student = new Student(0,"Cassiano", 32, 10, 2022);

        //Teacher teacher = new Teacher(0,"Jose",44,4545,"DevOps");

        // System.out.println("Nome do aluno: " + student.getName());
        // System.out.println("Nome do professor: " + teacher.getName());
        // student.checkIn(student.getName());
        // student.checkOut(student.getName());
        // teacher.checkIn(teacher.getName());
        // teacher.checkOut(teacher.getName());

        List<Student> students = new ArrayList<Student>();
        List<Teacher> teachers = new ArrayList<Teacher>();

        students.add(new Student(0,"Cassiano", 32, 10, 2022));
        students.add(new Student(1,"Joao", 33, 10, 2022));
        students.add(new Student(2,"Maria", 28, 10, 2022));

        teachers.add(new Teacher(0,"Jose",44,4544,"DevOps"));
        teachers.add(new Teacher(1,"Pedro",22,4545,"Cloud"));
        teachers.add(new Teacher(2,"Paulo",12,4546,"Security"));

        System.out.println("Lista de estudantes");
        students.stream().forEach(student -> System.out.println(student.getName()));
        students.stream().forEach(student -> System.out.println(student.getAge()));
        

    }
}
