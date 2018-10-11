package com.xrd.buglytest;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TwoActivity extends BaseActivity {

    @BindView(R.id.tv_two)
    TextView tvTwo;
    private List<String> list=new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_two;
    }

    @Override
    public void initView() {
        tvTwo.setText(list.get(3));
    }

    @Override
    public void initEventAndData() {

    }

}
