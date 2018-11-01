package com.cyoung.attack.ulisesbocchio;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: lancet
 * @package: com.ciphertext.ulisesbocchio
 * @email: cy880708@163.com
 * @date: 2018/10/10 下午2:13
 * @mofified By:
 */
public class Test {

    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("G0CvDz7oJn6");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("root123");
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }

}
