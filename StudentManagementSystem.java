class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20, 88.5);
        Student student2 = new Student("Jane Smith", 22, 91.0);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
