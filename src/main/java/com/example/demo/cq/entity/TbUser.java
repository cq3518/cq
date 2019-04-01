package com.example.demo.cq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cq
 * @since 2019-03-24
 */
@Alias("tbUser")
public class TbUser extends Model<TbUser> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 创建时间
     */
    private LocalDateTime ctm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public LocalDateTime getCtm() {
        return ctm;
    }

    public void setCtm(LocalDateTime ctm) {
        this.ctm = ctm;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TbUser{" +
        "id=" + id +
        ", username=" + username +
        ", age=" + age +
        ", ctm=" + ctm +
        "}";
    }
}
