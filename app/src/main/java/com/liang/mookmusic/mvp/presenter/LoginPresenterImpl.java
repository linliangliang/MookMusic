package com.liang.mookmusic.mvp.presenter;

import com.liang.mookmusic.mvp.contract.LoginContract;
import com.liang.mookmusic.mvp.model.LoginModelImpl;

public class LoginPresenterImpl implements LoginContract.LoginPresenter {
    LoginContract.LoginView mView;
    LoginContract.LoginModel mModel;

    public LoginPresenterImpl(LoginContract.LoginView v){
        mView = v;
        mModel = new LoginModelImpl();
    }


    @Override
    public void login() {

    }
}
