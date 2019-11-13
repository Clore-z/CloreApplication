package com.gzu.zcl.myapplication.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class Msg implements MultiItemEntity {
    public static final int MINE = 0;
    public static final int OTHERS = 1;

    private String msg;
    private int imgId;
    private int type;

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public int getImgId()
    {
        return imgId;
    }

    public void setImgId(int imgId)
    {
        this.imgId = imgId;
    }

    @Override
    public int getItemType()
    {
        return getType() == 0 ? MINE : OTHERS;
    }
}
