package haifeng.cong.thread.producerconsumer2;

import haifeng.cong.thread.producerconsumer.Product;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/4 17:49
 *
 * @author conghaifeng
 */
public class Producer extends Thread {

    private String lock;

    public Producer(String lock) {
        this.lock = lock;
    }

    public void run() {
        while (true) {
            try {
                synchronized (lock) {
                    if (Product.hasProduct) {
                        System.out.println("生产者等待中");
                        lock.wait();
                    }
                    System.out.println("生产者生产一份材料");
                    Product.hasProduct = true;
                    lock.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
