package haifeng.cong.annotation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/17 16:06
 *
 * @author conghaifeng
 */
public class Addition {

    private static final Gson gson;
    private static final Type type;

    static {
        gson = new GsonBuilder().create();
        // 可以得到带有泛型的map类型
        type = new TypeToken<Map<String, String>>(){}.getType();
    }


}
