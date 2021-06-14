package com.liang.mookmusic.mvp.presenter;

import com.liang.mookmusic.mvp.contract.WelcomeContract;
import com.liang.mookmusic.mvp.model.WelcomeModelImpl;

public class WelcomePresenterImpl implements WelcomeContract.WelcomePresenter,WelcomeContract.OnListener {

    private WelcomeContract.WelcomeView view;
    private WelcomeContract.WelcomeModel model;

    public WelcomePresenterImpl(WelcomeContract.WelcomeView v){
        view = v;
        model = new WelcomeModelImpl();
    }

    @Override
    public void navigate() {
        model.navigate(WelcomePresenterImpl.this);
    }

    @Override
    public void navigateMain() {
    }

    @Override
    public void navigateAccout() {

    }

    @Override
    public void navigateLogin() {

    }

    @Override
    public void onNavigate() {
        view.navigateMain();
    }
}
