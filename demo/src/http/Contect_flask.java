/**
 * 
 */
package http;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

/**
 * ClassName: contect_flask Function: TODO ADD FUNCTION
 * 
 * @author: xuzheng date: 2019-7-1 下午2:03:00
 */
public class Contect_flask {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String result = Contect_flask.post(
            "http://172.23.22.117:6789/uim-api/action=modifyRyPwd&userGuid=1122878346&oldPwd=qwe123&newPwd=qwe123", "");

        System.out.println(result);

    }

    public static String post(String url, String param) {
        HttpPost httppost = new HttpPost(url);
        // 创建参数队列
        StringEntity uefEntity = new StringEntity(param, ContentType.APPLICATION_JSON);
        return null;
    }
}