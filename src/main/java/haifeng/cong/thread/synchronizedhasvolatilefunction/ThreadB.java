package haifeng.cong.thread.synchronizedhasvolatilefunction;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/3 17:53
 *
 * @author conghaifeng
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    public void run() {
        service.stopMethod();
    }
}
