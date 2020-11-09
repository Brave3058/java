package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import until.ILogFactory;

public class ArrayDemo implements ILogFactory {
    @Test
    public void main() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            log.info("arr[{}] = {}", i, arr[i - 1]);
        }

        List<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("a");
        Set<String> s1 = new HashSet<String>(l1);
        String s2 = StringUtils.join(s1, ",");
        for (String string : s1) {
            log.info("{}{}", s1, s2);
        }


    }

}
