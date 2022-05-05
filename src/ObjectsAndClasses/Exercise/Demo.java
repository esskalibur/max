package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student st1 = new Student("P", 4.50);
        Student st2 = new Student("T", 4.30);
        Student st3 = new Student("S", 4.80);
        Student st4 = new Student("A", 5.50);
        Student st5 = new Student("M", 2.50);

        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5));
        st1.setName("Ivan");
        students.stream().sorted((m1, m2) -> Double.compare(m2.getAvgScore(), m1.getAvgScore())).forEach(m -> System.out.println(m.getInfo()));
    }

    static class Student {
        String name;
        double avgScore;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAvgScore() {
            return avgScore;
        }

        public void setAvgScore(double avgScore) {
            this.avgScore = avgScore;
        }

        Student(String name, double avgScore) {
            this.name = name;
            this.avgScore = avgScore;
        }

        String getInfo() {
            return String.format("I am %s with avg score: %.2f", this.name, this.avgScore);
        }
    }
}
