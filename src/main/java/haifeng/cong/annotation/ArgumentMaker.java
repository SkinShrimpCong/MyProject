package haifeng.cong.annotation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;



/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/17 11:18
 *
 * @author conghaifeng
 */
public class ArgumentMaker {

    // 注解AParameter中name的值 +  参数对象转换成的gson字符串所形成的map
    private Map<String, String> argumentMap;

    private Gson gson;

    public ArgumentMaker() {
        gson = new GsonBuilder().create();
        argumentMap = new HashMap<>();
    }

    // 其name就是注解AParameter中name的值，value就是参数的具体值
    public ArgumentMaker add(String name, Object value) {
        // 通过gson将参数对象转换为gson字符串
        argumentMap.put(name, gson.toJson(value));
        return this;
    }

    // 将得到的name + 参数对象转换成的gson字符串map再次转换成gson字符串，以便于进行传输
    public String toOgnl() {
        if (argumentMap.isEmpty()) {
            return null;
        }

        return gson.toJson(argumentMap);
    }



}
