package generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PairTest3 {
    public static final Logger log = LoggerFactory.getLogger(PairTest3.class);


}

class PairAlg {
    public static boolean hasNulls(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) {
        swapHelper(p);
    }

    private static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}