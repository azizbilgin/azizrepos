package JavaTekrar.notstreamodev;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int numberOfStudents = 5; // Örnek olarak 5 öğrenci ürettim
        List<Student> students = generateStudents(numberOfStudents);

        // Öğrencilerin not ortalamasını hesaplayıp dönen bir stream
        double averageGrade = students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .getAsDouble();
        System.out.println("Öğrencilerin ortalama notu: " + averageGrade);
        // Öğrencilerin isimlerini ve öğrencilerin notlarını yazdıran bir stream
        students.stream()
                .forEach(student -> System.out.println(student));

    }
    public static List<Student> generateStudents(int numberOfStudents) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();

        IntStream.range(0, numberOfStudents)
                .forEach(i -> {
                    String name = "Öğrenci" + i;
                    String surname = "Soyadı" + i;
                    int grade = random.nextInt(100) + 1; // 1-100 arası rastgele bir değer
                    students.add(new Student(name, surname, grade));
                });

        return students;
    }
}
