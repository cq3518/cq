package com.example.demo.test;

/**
 * <p>  </p>
 * <pre>cq</pre>
 *动态加载方法
 * @author chenqiang
 * @date 2019-07-09 18:32
 */

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;

public class DyMethodUtil {

    public static Object invokeMethod(String jexlExp,Map<String,Object> map){
        JexlEngine jexl=new JexlEngine();
        Expression e = jexl.createExpression(jexlExp);
        JexlContext jc = new MapContext();
        for(String key:map.keySet()){
            jc.set(key, map.get(key));
        }
        if(null==e.evaluate(jc)){
            return "";
        }
        return e.evaluate(jc);
    }
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<String,Object>();
        Test test=new Test();
        map.put("money",2100);
        map.put("test",test);
        String expression="if(money<=4000){return test.get(1,2);}else{" +
                "return 0;}";
        Object code = invokeMethod(expression,map);
        System.out.println(code);


    }

}
