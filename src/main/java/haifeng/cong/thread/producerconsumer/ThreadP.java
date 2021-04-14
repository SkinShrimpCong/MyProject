package haifeng.cong.thread.producerconsumer;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/4 18:24
 *
 * @author conghaifeng
 */
public class ThreadP extends Thread {

    private Producer producer;

    public ThreadP(Producer producer) {
        this.producer = producer;
    }

    public void run() {
        while (true) {
            producer.setValue();
        }
    }
}
