package set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreeSetTest {
    private static final Logger log = LoggerFactory.getLogger(TreeSetTest.class);

    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<Item>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        log.info("{}\n", parts);

        NavigableSet<Item> sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        log.info("{}\n", sortByDescription);

    }

}
