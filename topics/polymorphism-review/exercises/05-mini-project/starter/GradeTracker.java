import java.util.ArrayList;
import java.util.Collections;

abstract class Student implements Comparable<Student> {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public ArrayList<Double> getGrades() {
        return new ArrayList<>(grades);
    }

    protected double averageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    public abstract double calculateGPA();

    @Override
    public String toString() {
        // TODO: return "[name] (GPA: [gpa])" with 2 decimal places
        return "";
    }

    @Override
    public int compareTo(Student other) {
        // TODO: Sort by GPA descending, then name ascending
        return 0;
    }
}

class Undergrad extends Student {
    public Undergrad(String name) {
        super(name);
    }

    @Override
    public double calculateGPA() {
        // TODO: average / 25, cap at 4.0, return 0.0 if no grades
        return 0;
    }
}

class Graduate extends Student {
    public Graduate(String name) {
        super(name);
    }

    @Override
    public double calculateGPA() {
        // TODO: (average - 10) / 22.5, cap at 4.0, floor at 0.0, return 0.0 if no grades
        return 0;
    }
}

public class GradeTracker {

    /**
     * Adds a student to the roster.
     */
    public static void addStudent(ArrayList<Student> roster, Student student) {
        // TODO: Add the student
    }

    /**
     * Returns a sorted list of students with GPA >= 3.5.
     */
    public static ArrayList<Student> getHonorRoll(ArrayList<Student> roster) {
        // TODO: Filter by GPA >= 3.5, then sort
        return new ArrayList<>();
    }

    /**
     * Returns the average GPA of all students. Returns 0.0 if empty.
     */
    public static double classAverage(ArrayList<Student> roster) {
        // TODO: Compute average GPA
        return 0;
    }

    /**
     * Returns the student with the highest GPA, or null if empty.
     */
    public static Student topStudent(ArrayList<Student> roster) {
        // TODO: Find the top student
        return null;
    }
}
