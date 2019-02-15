package com.sjhy.plugin.entity;

import com.sjhy.plugin.ui.base.Item;

/**
 * 模板信息类
 *
 * @author makejava
 * @version 1.0.0
 * @since 2018/07/17 13:10
 */
public class Template implements Item {
    /**
     * 模板名称
     */
    private String name;
    /**
     * 模板代码
     */
    private String code;

    public Template(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
