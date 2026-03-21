class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        // TODO: return "[name] ([gpa])" with 1 decimal place
        return "";
    }

    @Override
    public int compareTo(Student other) {
        // TODO: Sort by GPA descending, then by name ascending
        return 0;
    }
}
