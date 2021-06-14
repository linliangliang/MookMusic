package com.liang.mookmusic.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;

import com.liang.mookmusic.BaseActivity;
import com.liang.mookmusic.MainActivity;
import com.liang.mookmusic.R;
import com.liang.mookmusic.mvp.contract.WelcomeContract;
import com.liang.mookmusic.mvp.presenter.WelcomePresenterImpl;

public class WelcomeActivity extends BaseActivity implements WelcomeContract.WelcomeView, View.OnClickListener{

    private Handler mHandler = new Handler(Looper.getMainLooper());

    private Button mButtonCount;
    private WelcomePresenterImpl mWelComePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
        initData();
    }

    private void init() {
        mButtonCount = findViewById(R.id.btn_welcome_count);
        mHandler.postDelayed(() -> {
                //判断是否登录，没有是否自动登录
                navigate();
        }, 3000);
        setUpMVP();
    }

    private void initData() {
        mButtonCount.setOnClickListener(this);
    }

    @Override
    public void setUpMVP() {
        mWelComePresenter = new WelcomePresenterImpl(WelcomeActivity.this);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_welcome_count:
                intoMain();
                break;
        }
    }

    private void intoMain(){
        Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void navigate() {
        mWelComePresenter.navigate();
    }

    @Override
    public void navigateMain() {
        //Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
        Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void navigateAccout() {

    }

    @Override
    public void navigateLogin() {

    }
}