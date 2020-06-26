package until;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import pojo.Cuboid;

public class Demo {
    private static final Logger logger = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;
            logger.info("a={}", a);
        }

    }

}
