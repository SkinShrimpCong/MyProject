package haifeng.cong.thread.producerconsumer;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/4 18:22
 *
 * @author conghaifeng
 */
public class ThreadC extends Thread {

    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        this.consumer = consumer;
    }

    public void run() {
        while (true) {
            consumer.getValue();
        }
    }
}

