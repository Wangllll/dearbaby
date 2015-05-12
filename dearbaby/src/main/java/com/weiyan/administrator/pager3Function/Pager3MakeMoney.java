package com.weiyan.administrator.pager3Function;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.weiyan.administrator.myapplication.R;

/**
 * Created by Administrator on 2015/5/8.
 */
public class Pager3MakeMoney extends Fragment implements View.OnClickListener{
    private View view;
    private Button topBt1,topBt2,topBt3;


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.pager3_makemoney,container,false);
        initView();
        return view;
    }
    private void initView() {
        topBt1 = (Button)view.findViewById(R.id.id_pager3_makemoney_topbt1);
        topBt2 = (Button)view.findViewById(R.id.id_pager3_makemoney_topbt2);
        topBt3 = (Button)view.findViewById(R.id.id_pager3_makemoney_topbt3);


        topBt1.setOnClickListener(this);
        topBt2.setOnClickListener(this);
        topBt3.setOnClickListener(this);

        topBt1.setBackgroundResource(R.drawable.pager1_topstate);
        topBt1.setTextColor(getResources().getColor(R.color.accent_material_dark));
        topBt2.setBackgroundColor(0xffffff);
        topBt3.setBackgroundColor(0xffffff);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.id_pager3_makemoney_topbt1:
                topBt2.setBackgroundColor(0xffffff);
                topBt2.setTextColor(getResources().getColor(R.color.abc_primary_text_material_light));
                topBt3.setBackgroundColor(0xffffff);
                topBt3.setTextColor(getResources().getColor(R.color.abc_primary_text_material_light));
                topBt1.setBackgroundResource(R.drawable.pager1_topstate);
                topBt1.setTextColor(getResources().getColor(R.color.accent_material_dark));

                break;
            case R.id.id_pager3_makemoney_topbt2:
                topBt1.setBackgroundColor(0xffffff);
                topBt1.setTextColor(getResources().getColor(R.color.abc_primary_text_material_light));
                topBt3.setBackgroundColor(0xffffff);
                topBt3.setTextColor(getResources().getColor(R.color.abc_primary_text_material_light));
                topBt2.setBackgroundResource(R.drawable.pager1_topstate);
                topBt2.setTextColor(getResources().getColor(R.color.accent_material_dark));
                break;
            case R.id.id_pager3_makemoney_topbt3:
                topBt2.setBackgroundColor(0xffffff);
                topBt2.setTextColor(getResources().getColor(R.color.abc_primary_text_material_light));
                topBt1.setBackgroundColor(0xffffff);
                topBt1.setTextColor(getResources().getColor(R.color.abc_primary_text_material_light));
                topBt3.setBackgroundResource(R.drawable.pager1_topstate);
                topBt3.setTextColor(getResources().getColor(R.color.accent_material_dark));
                break;
        }
    }
}
