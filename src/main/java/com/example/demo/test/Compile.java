package com.example.demo.test;
import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

import java.util.HashMap;
import java.util.Map;
/**
 * <p>  </p>
 * <pre>demo</pre>
 *
 * @author chenqiang
 * @date 2019-07-09 13:37
 */
public class Compile {
    public static void main(String[] args) {
        String expression = "a-(b-c)>100";
        Expression compiledExp = AviatorEvaluator.compile(expression);
        Map<String, Object> env = new HashMap<>();
        env.put("a", 100.3);
        env.put("b", 45);
        env.put("c", -199.100);
        Boolean result = (Boolean) compiledExp.execute(env);
        System.out.println(result);
    }
}
