package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Person>personList=new ArrayList<>();
        for(int i=0;i<n;i++){
            String []data=scanner.nextLine().split("\\s+");
            Person person=new Person(data[0],Integer.parseInt(data[1]));
            personList.add(person);
        }
        personList.stream().sorted((p1,p2)->p1.name.compareTo(p2.name)).filter(person -> person.age>30).
                forEach(p-> System.out.println(p.toString()));
    }
    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d",this.name,this.age);
        }
    }
}
