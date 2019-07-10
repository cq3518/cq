package com.example.demo.rote;

import com.example.demo.config.IOrderOrInstruction;
import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorBigInt;
import com.googlecode.aviator.runtime.type.AviatorFunction;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.Map;

/**
 * <p>  </p>
 * <pre>cq</pre>
 *
 * @author chenqiang
 * @date 2019-07-09 16:52
 */
@Rule(scene = "instructionOrder",sceneName = "指令单下委托")
public class HandlerDo   extends AbstractFunction implements IOrderOrInstruction{

    @Override
    public String getName() {
        return "instructionOrder";
    }

    @Override
    public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2) {
        System.out.println(env);
        Number left = FunctionUtils.getNumberValue(arg1, env);
        Number right = FunctionUtils.getNumberValue(arg2, env);
        System.out.println(left+":"+right);
        return new AviatorBigInt(Math.min(left.doubleValue(), right.doubleValue()));

    }
}
