package haifeng.cong.thread.synchronizedhasvolatilefunction;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/3 17:48
 *
 * @author conghaifeng
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }


    @Override
    public void run() {
        service.runMethod();
    }
}
