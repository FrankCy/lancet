package com.cyoung.attack.firstknife;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: lancet
 * @package: com.ddos.firstknife
 * @email: cy880708@163.com
 * @date: 2018/9/21 下午2:21
 * @mofified By:
 */
public class DdosProgram {
    public static void main(String[] args) {
        //利用线程池创建1000个线程
        ExecutorService es = Executors.newFixedThreadPool(1000000);
        Mythread mythread = new Mythread();
        Thread thread = new Thread(mythread);
        for (int i = 0; i < 10000; i++) {
            es.execute(thread);
        }
    }
}
