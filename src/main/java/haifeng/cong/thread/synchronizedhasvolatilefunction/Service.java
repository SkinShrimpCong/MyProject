package haifeng.cong.thread.synchronizedhasvolatilefunction;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/3 17:45
 *
 * @author conghaifeng
 */
public class Service {

     private boolean isContinueRun = true;

     synchronized public void runMethod() {
        try {
            while (isContinueRun) {
                System.out.println("运行中");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("停下来了");
    }

    public void stopMethod() {
        isContinueRun = false;
        System.out.println("已经发出停止命令");
    }

}
