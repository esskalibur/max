package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> resources=new LinkedHashMap<>();
        String line=scanner.nextLine();
        while (!line.equals("stop")){
            int quantity=Integer.parseInt(scanner.nextLine());
            if(!resources.containsKey(line)){
                resources.put(line,quantity);
            }else{
                resources.put(line, resources.get(line)+quantity);
            }
            line=scanner.nextLine();
        }
        resources.forEach((key,value)-> System.out.printf("%s -> %d%n",key,value));
    }
}
