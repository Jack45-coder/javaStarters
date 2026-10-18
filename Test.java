import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Rahul", 100);
        marks.put("Simmy", 200);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + "---------");
            System.out.println(entry.getValue() + "---------");
            System.out.println("Hello Jcck");

        }
        
    }
}