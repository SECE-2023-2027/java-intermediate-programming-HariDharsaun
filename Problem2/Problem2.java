class Problem2 {
    public static void main(String[] args) {
        
        Student student1 = new Student("John Doe", new double[]{85.0, 90.0, 78.0});
        System.out.printf("Student1 Average Marks: %.2f%n", student1.getAverage());
        Student student2 = new Student("Jane Smith", new double[]{99.0, 100.0});
        System.out.printf("Student2 Average Marks: %.2f%n", student2.getAverage());
        Student student3 = new Student("Alice Johnson", new double[]{});
        System.out.printf("Student3 Average Marks: %.2f%n", student3.getAverage());
    }
}


class Student{

    public String name;

    public double[] marks;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
 }
