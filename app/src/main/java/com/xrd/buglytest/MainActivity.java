package com.xrd.buglytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.one)
    Button one;
    @BindView(R.id.two)
    Button two;
    @BindView(R.id.three)
    Button three;
    @BindView(R.id.tv_main)
    TextView tvMain;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initEventAndData() {

    }

    @OnClick({R.id.one, R.id.two, R.id.three})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.one:
                int i=3;
                tvMain.setText(i);
                break;
            case R.id.two:
                startActivity(new Intent(this,TwoActivity.class));
                break;
            case R.id.three:
                break;
        }
    }
}
