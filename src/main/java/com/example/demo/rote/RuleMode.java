package com.example.demo.rote;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>  </p>
 * <pre>cq</pre>
 *
 * @author chenqiang
 * @date 2019-07-09 16:48
 */
@Data
@AllArgsConstructor
public class RuleMode {


    /**
     * 方法编码
     */
    private String ruleKey;

    /**
     * 方法名称
     */
    private String ruleValue;
}
