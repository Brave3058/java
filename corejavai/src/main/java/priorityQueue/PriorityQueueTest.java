package priorityQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PriorityQueueTest {
    private static final Logger log = LoggerFactory.getLogger(PriorityQueueTest.class);

    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1903, 12, 3));
        pq.add(LocalDate.of(1910, 6, 22));
        log.info("Iterating over elements...\n");
        for (LocalDate date : pq) {
            log.info("{}\n", date);
        }
        log.info("Removing elements......\n");
        while (!pq.isEmpty()) {
            log.info("{}\n", pq.remove());
        }
    }
}
