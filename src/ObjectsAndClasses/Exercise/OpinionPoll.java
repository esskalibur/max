package ObjectsAndClasses.Exercise;

import java.util.*;

public class OpinionPoll {
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return String.format("%s - %d", this.getName(), this.getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> person = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            person.put(input[0], Integer.parseInt(input[1]));
        }
        for (Map.Entry<String, Integer> entry : person.entrySet()) {
            if (entry.getValue() > 30)
                System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }
    }
}
