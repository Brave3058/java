package shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShuffleTest {
    private static final Logger log = LoggerFactory.getLogger(ShuffleTest.class);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 49; i++) {
            numbers.add(i);
        }
        log.info("{}\n",numbers);
        Collections.shuffle(numbers);
        log.info("{}\n",numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        log.info("{}\n", winningCombination);
    }
}
