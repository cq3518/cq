package com.example.demo.test;

import com.googlecode.aviator.AviatorEvaluator;

/**
 * <p>  </p>
 * <pre>demo</pre>
 *
 * @author chenqiang
 * @date 2019-07-09 13:35
 */
public class Test {
    public static void main(String[] args) {
        Long result = (Long) AviatorEvaluator.execute("1+2+3");
        System.out.println(result);
    }

    public int get(int i,int j){

        return i+j;

    }
}
