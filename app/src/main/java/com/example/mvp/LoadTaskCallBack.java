package com.example.mvp;

public interface LoadTaskCallBack<T> {
    void onSuccess(T t);
    void onstart();
    void onFailed();
    void onFinish();

}
