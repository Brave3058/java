package objectanalyzer;

import equals.Employee;

import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squars = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            squars.add(i * i);
            System.out.println(new ObjectAnalyzer().toString(squars));
        }
        String s = "hahha";
        Employee e = new Employee("sb", 1000, 2000, 02, 1);
        System.out.println(new ObjectAnalyzer().toString(e));
    }
}
