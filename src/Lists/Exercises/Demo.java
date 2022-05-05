package Lists.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        List<String> words = new ArrayList(Arrays.asList("abc","def","abc","abc","def"));

        removeAll(words,"def");

    }

    private static void removeAll(List<String>elements , String value) {

        int i=0;
        while (i< elements.size()){
            if(elements.get(i).equals(value)){
                elements.remove(i);
            }else{
                i+=1;
            }
        }

    }
}
