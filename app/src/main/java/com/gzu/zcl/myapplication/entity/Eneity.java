package com.gzu.zcl.myapplication.entity;

import java.io.Serializable;

public class Eneity implements Serializable {
    private int id;
    private String name;
    private String msg;

    public Eneity(int id, String name, String msg) {
        this.id = id;
        this.name = name;
        this.msg = msg;
    }

    public Eneity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
