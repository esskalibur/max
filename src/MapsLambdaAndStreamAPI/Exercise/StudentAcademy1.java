package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class StudentAcademy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentInfo = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i += 1) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentInfo.putIfAbsent(name, new ArrayList<>());
            studentInfo.get(name).add(grade);
        }
        studentInfo.forEach((key, value) -> {
            double averageGrade = value.stream().mapToDouble(x -> x).average().orElse(0.0);
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", key, averageGrade);
            }
        });
    }
}
