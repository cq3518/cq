package com.example.demo.rote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre> Created: 2019/5/17 9:21 </pre>
 *
 * @author cq
 * @version 1.0
 * @since JDK 1.7
 */
public abstract class AbstractRuleFactory<T>  {

    /**
     * 注入该接口所有实现
     */
    @Autowired(required = false)
    private List<T> actionHandlers;

    /**
     * 获取对应的路由
     *
     * @param
     * @return
     */
    public T getRule(RuleMode models) {
        Assert.notNull(models, "规则不能为空值！");
        if(actionHandlers==null){
            return null;
        }

        List<T> results = actionHandlers.stream()
                //过滤只被Rule注解的必须路由的值和预期相等的实现类
                .filter(t -> {
                    //单个参数路由
                    return checkRule(t, models);

                })
                .collect(Collectors.toList());

        if (results.size() == 1) {
            return results.get(0);
        } else  {
            throw new RuntimeException("根据models=" + models + "找不到对应的实现类！");
        }
    }

    /**
     * 检查这个action是否是路由的实现
     *
     * @param t
     * @return
     */
    private boolean checkRule(T t, RuleMode actionModel) {
        final Rule action = AnnotationUtils.findAnnotation(t.getClass(), Rule.class);
        if (action != null) {
            if (action.scene().equals(actionModel.getRuleKey())) {
                return true;
            }
        }
        return false;
    }


}
