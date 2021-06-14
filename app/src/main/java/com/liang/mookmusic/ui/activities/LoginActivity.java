package com.liang.mookmusic.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.liang.mookmusic.R;
import com.liang.mookmusic.mvp.contract.LoginContract;


public class LoginActivity extends Activity implements LoginContract.LoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {

    }

    @Override
    public void login() {
        
    }
}