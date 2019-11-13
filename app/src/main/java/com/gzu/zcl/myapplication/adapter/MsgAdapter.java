package com.gzu.zcl.myapplication.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gzu.zcl.myapplication.R;
import com.gzu.zcl.myapplication.entity.Msg;

import java.util.List;

import androidx.annotation.NonNull;

public class MsgAdapter extends BaseMultiItemQuickAdapter<Msg, BaseViewHolder> {

    public MsgAdapter(List<Msg> data) {
        super(data);
        addItemType(Msg.MINE, R.layout.item_mine);
        addItemType(Msg.OTHERS,R.layout.item_others);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, Msg item) {
        switch (item.getItemType()){
            case Msg.MINE :
                helper.setText(R.id.tv_msg_mine,item.getMsg())
                        .setImageResource(R.id.img_mine,item.getImgId());
                break;
            case Msg.OTHERS :
                helper.setText(R.id.tv_msg_other,item.getMsg())
                        .setImageResource(R.id.img_other,item.getImgId());
                break;
            default:
        }
    }
}
