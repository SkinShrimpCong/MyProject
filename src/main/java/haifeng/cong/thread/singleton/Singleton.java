package haifeng.cong.thread.singleton;

/**
 * Description: 双重检测，单例模式
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/2/25 17:53
 *
 * @author conghaifeng
 */
public class Singleton {

    private volatile static Singleton uinqueInstance;

    private Singleton() {

    }

//    public Singleton getUinqueInstance() {
//
//        if (uinqueInstance == null) {
//            synchronized (Singleton.class) {
//                if (uinqueInstance == null) {
//                    uinqueInstance = new Singleton();
//                }
//            }
//        }
//        return uinqueInstance;
//
//
//    }

    public Singleton getUinqueInstance() {
        if (uinqueInstance == null) {
            synchronized (Singleton.class) {
                if (uinqueInstance == null) {
                    uinqueInstance = new Singleton();
                }
            }
        }
        return uinqueInstance;
    }



}
