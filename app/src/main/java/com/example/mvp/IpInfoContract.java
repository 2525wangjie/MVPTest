package com.example.mvp;

public interface IpInfoContract {
    interface  Presenter{
        void getIpInfo(String ip);
    }
    interface  View extends BaseView<Presenter>{
        void setIpInfo(IpInfo ipInfo);
        void showLoading();
        void hideLoading();
        void showError();
        boolean isActive();
    }
}
