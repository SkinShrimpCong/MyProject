package haifeng.cong.thread.synchronizedhasvolatilefunction;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/3 17:55
 *
 * @author conghaifeng
 */
public class Run {

    public static void main(String[] args){
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            threadA.start();
            Thread.sleep(5000);
            ThreadB threadB = new ThreadB(service);
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
