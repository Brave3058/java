package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.Cuboid;
import until.ILogFactory;
import until.Until;

public class ListDemo implements ILogFactory {
    @Test
    public void main() {
        List<String> sts = new ArrayList<String>();
        sts.add("");
        sts.add(null);
        log.info("是否为空：{}", CollectionUtils.isNotEmpty(sts));
        log.info("原大小：{}", sts.size());
        sts.removeAll(Collections.singleton(""));
        sts.removeAll(Collections.singleton(null));
        log.info("去空后大小{}：", sts.size());
        List<Cuboid> cubs = new ArrayList<Cuboid>();
        cubs.add(new Cuboid("a", "1", 1, 2, 3));
        cubs.add(new Cuboid("b", "2", 1, 2, 3));
        cubs.add(new Cuboid("c", "3", 1, 2, 3));
        cubs.add(new Cuboid("d", "2", 1, 2, 3));
        cubs.add(new Cuboid("e", "1", 1, 2, 3));
        Map<String, Cuboid> cubmap = new HashMap<String, Cuboid>();
        cubmap.put(cubs.get(0).getName(), (Cuboid) Until.deepClone(cubs.get(0)));
        for (int i = 1; i < cubs.size(); i++) {
            int flag = 0;
            for (Iterator<Map.Entry<String, Cuboid>> iterator = cubmap.entrySet().iterator(); iterator.hasNext(); ) {
                Map.Entry<String, Cuboid> entry = iterator.next();
                if (StringUtils.equals(cubs.get(i).getName(), entry.getKey())) {
                    entry.getValue().setLength(cubs.get(i).getLength() + entry.getValue().getLength());
                    entry.getValue().setWidth(cubs.get(i).getWidth() + entry.getValue().getWidth());
                    entry.getValue().setHeight(cubs.get(i).getHeight() + entry.getValue().getHeight());
                    flag = 1;
                }
            }
            if (0 == flag) {
                cubmap.put(cubs.get(i).getName(), (Cuboid) Until.deepClone(cubs.get(i)));
            }
        }

        for (Map.Entry<String, Cuboid> entry : cubmap.entrySet()) {
            cubs.add(entry.getValue());
            log.info("问题key:{} value：{} 长：{} 宽：{} 高：{}", entry.getKey(), entry.getValue().getName(),
                    entry.getValue().getLength(), entry.getValue().getWidth(), entry.getValue().getHeight());
        }
        for (Cuboid cuboid : cubs) {
            log.info("value:{} 长：{} 宽：{} 高：{}", cuboid.getName(), cuboid.getLength(), cuboid.getWidth(),
                    cuboid.getHeight());
        }
    }
}
