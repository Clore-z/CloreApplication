package com.gzu.zcl.myapplication.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.gzu.zcl.myapplication.R;
import com.gzu.zcl.myapplication.adapter.MsgAdapter;
import com.gzu.zcl.myapplication.entity.Msg;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MsgDemoActivity extends AppCompatActivity {
    private RecyclerView msgList;
    private MsgAdapter msgAdapter;

    private EditText editInput;
    private Button btnSend;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imsg_demo);
        msgList = findViewById(R.id.recycler_view);
        msgList.setLayoutManager(new LinearLayoutManager(this));

        msgAdapter = new MsgAdapter(null);
        msgList.setAdapter(msgAdapter);

        editInput = findViewById(R.id.edt_input);
        btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


                String msg = editInput.getText().toString();
                Msg entity = new Msg();
                entity.setMsg(msg);
                entity.setImgId(R.drawable.ic_launcher_background);

                msgAdapter.addData(entity);


                Msg other = new Msg();
                other.setType(Msg.OTHERS);
                other.setImgId(R.drawable.ic_launcher_foreground);
                other.setMsg("hello~~~");

                msgAdapter.addData(other);


                editInput.setText("");
            }
        });
    }
}
