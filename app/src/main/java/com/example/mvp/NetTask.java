package com.example.mvp;

public interface NetTask<T> {
    void execute(T data,LoadTaskCallBack callback);
}

