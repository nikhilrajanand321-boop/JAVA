import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("\n-------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }
}


public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Student Marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(id, name, age, marks);

        students.add(student);

        System.out.println("\nStudent added successfully!");
    }


    public static void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo students found!");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student student : students) {
            student.displayStudent();
        }
    }


    public static void searchStudent() {

        System.out.print("\nEnter Student ID to search: ");
        int id = sc.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {
                System.out.println("\nStudent Found!");
                student.displayStudent();
                return;
            }
        }

        System.out.println("\nStudent not found!");
    }


    public static void updateMarks() {

        System.out.print("\nEnter Student ID: ");
        int id = sc.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.print("Enter new marks: ");
                double marks = sc.nextDouble();

                student.setMarks(marks);

                System.out.println("\nMarks updated successfully!");
                return;
            }
        }

        System.out.println("\nStudent not found!");
    }


    public static void deleteStudent() {

        System.out.print("\nEnter Student ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == id) {

                students.remove(i);

                System.out.println("\nStudent deleted successfully!");
                return;
            }
        }

        System.out.println("\nStudent not found!");
    }


    public static void showMenu() {

        System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Marks");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");

        System.out.print("\nEnter your choice: ");
    }


    public static void main(String[] args) {

        int choice;

        do {

            showMenu();

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("\nExiting program...");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}