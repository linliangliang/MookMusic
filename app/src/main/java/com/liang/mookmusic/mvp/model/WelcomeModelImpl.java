package com.liang.mookmusic.mvp.model;

import com.liang.mookmusic.mvp.contract.WelcomeContract;

public class WelcomeModelImpl implements WelcomeContract.WelcomeModel {
    @Override
    public void navigate(WelcomeContract.OnListener onListener) {
        onListener.onNavigate();
    }

}
