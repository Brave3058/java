package map;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import clone.Employee;


public class MapTest {
    private static Logger log = LoggerFactory.getLogger(MapTest.class);

    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<String, Employee>();
        staff.put("144", new Employee("Amy Lee"));
        staff.put("567", new Employee("Harry Hacker"));
        staff.put("157", new Employee("Gary Cooper"));
        staff.put("456", new Employee("Francesca Cruz"));
        log.info("{}\n", staff);
        staff.remove("567");
        staff.put("456", new Employee("Francesca Miller"));
        log.info("157:{}\n", staff.get("157"));
        staff.forEach((k, v) -> log.info("key = {},value = {}\n", k, v));
    }
}
