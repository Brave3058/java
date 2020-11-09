package array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import until.ILogFactory;

public class DateDemo implements ILogFactory {

    @Test
    public void main() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String da = "2019-06-12";
        Date date = sdf.parse(da);
        log.info("{}", date);
    }
}
