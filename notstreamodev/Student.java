package JavaTekrar.notstreamodev;

public class Student {

        private String name;
        private String surname;
        private int grade;

        public Student(String name, String surname, int grade) {
            this.grade = grade;
            this.name = name;
            this.surname = surname;
        }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("0-100 aralığında bir not değeri girin.");
        }
    }
    @Override
    public String toString() {
        return "İsim: " + name + " Soyisim: " + surname + " Not: " + grade;
    }
}
