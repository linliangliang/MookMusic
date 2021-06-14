package com.liang.mookmusic.mvp.contract;

import com.liang.mookmusic.mvp.view.BaseView;

public interface WelcomeContract {
    interface WelcomeView extends BaseView {

        void navigate();//判断是否登录

        void navigateMain();//进入应用

        void navigateAccout();//创建账号

        void navigateLogin();//登录
    }

    interface WelcomePresenter{

        void navigate();//判断是否登录

        void navigateMain();//进入应用

        void navigateAccout();//创建账号

        void navigateLogin();//登录
    }

    interface WelcomeModel{
        void navigate(OnListener onListener);
    }

    interface OnListener{
        void onNavigate();
    }
}
