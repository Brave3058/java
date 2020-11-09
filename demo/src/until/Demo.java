package until;

import org.junit.Test;

public class Demo implements ILogFactory {
    @Test
    public void main() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;
            log.info("a={}", a);
        }

    }
}
