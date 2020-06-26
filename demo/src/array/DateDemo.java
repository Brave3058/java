package array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateDemo {
    private static final Logger logger = LoggerFactory.getLogger(DateDemo.class);

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String da = "2019-06-12";
        Date date = sdf.parse(da);
        logger.info("{}",date);
    }
}
