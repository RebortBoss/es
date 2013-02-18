/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.web.showcase.move.entity;

import com.sishuok.es.common.entity.BaseEntity;
import com.sishuok.es.common.entity.plugin.Movable;
import com.sishuok.es.common.entity.validate.group.Create;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-4 上午9:38
 * <p>Version: 1.0
 */
@Entity
@Table(name = "tbl_moveable")
public class Move extends BaseEntity<Long> implements Movable {

    @NotNull(groups = Create.class)
    @Column(name = "name")
    private String name;

    @NotNull()
    @Column(name = "weight")
    private Integer weight;


    @Column(name = "`show`")
    private Boolean show;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }
}
