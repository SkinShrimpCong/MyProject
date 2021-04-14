package haifeng.cong.thread.producerconsumer;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/4 18:13
 *
 * @author conghaifeng
 */
public class Consumer {

    private String lock;

    public Consumer(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (!Product.hasProduct) {
                   System.out.println("消费者等待中");
                   lock.wait();
                }
                Product.hasProduct = false;
                System.out.println("消费者完成一次消费");
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
