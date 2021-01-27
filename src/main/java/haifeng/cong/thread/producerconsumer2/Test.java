package haifeng.cong.thread.producerconsumer2;



/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/4 18:25
 *
 * @author conghaifeng
 */
public class Test {

    public static void main(String[] args){
        String lock = "";
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        producer.start();
        consumer.start();

    }
}
