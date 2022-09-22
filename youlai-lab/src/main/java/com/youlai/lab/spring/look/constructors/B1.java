package com.youlai.lab.spring.look.constructors;

import org.springframework.stereotype.Component;

/**
 * 构造器注入的bean
 *
 * @author <a href="mailto:2256222053@qq.com">zc</a>
 * @Date 2022-03-09 10:29
 */
//@Component
public class B1 {

    private A1 a1;

    public B1(A1 a1) {
        this.a1 = a1;
    }
}
