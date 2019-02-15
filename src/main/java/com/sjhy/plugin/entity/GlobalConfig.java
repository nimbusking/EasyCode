package com.sjhy.plugin.entity;

import com.sjhy.plugin.ui.base.Item;

/**
 * 全局配置实体类
 *
 * @author makejava
 * @version 1.0.0
 * @since 2018/07/27 13:07
 */
public class GlobalConfig implements Item {
    /**
     * 名称
     */
    private String name;
    /**
     * 值
     */
    private String value;

    public GlobalConfig(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCode() {
        return this.value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
