package com.example.demo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author nick
 * @since 2021-06-22
 */
@Data
@EqualsAndHashCode(callSuper = false)

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer sid;

    private String sname;

    private String sage;

    private String ssex;

    private String snativeplace;

    private String smajor;

    private String sclass;

    private String snative;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSnativeplace() {
        return snativeplace;
    }

    public void setSnativeplace(String snativeplace) {
        this.snativeplace = snativeplace;
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getSnative() {
        return snative;
    }

    public void setSnative(String snative) {
        this.snative = snative;
    }
}
