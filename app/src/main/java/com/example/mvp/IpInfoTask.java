package com.example.mvp;

import cn.finalteam.okhttpfinal.BaseHttpRequestCallback;
import cn.finalteam.okhttpfinal.HttpRequest;
import cn.finalteam.okhttpfinal.RequestParams;

public class IpInfoTask implements NetTask <String>{
    private static IpInfoTask INSTANCE=null;
    private static final String HOST="http://ip.taobao.com/service/getIpInfo.php";
    private LoadTaskCallBack loadTaskCallBack;
    private IpInfoTask(){

    }
    public static IpInfoTask getInstance(){
        if(INSTANCE==null){
            INSTANCE=new IpInfoTask();
        }
        return INSTANCE;
    }
    @Override
    public void execute(String ip, LoadTaskCallBack callback) {
        RequestParams requestParams=new RequestParams();
        requestParams.addFormDataPart("ip",ip);
        HttpRequest.post(HOST,requestParams,new BaseHttpRequestCallback<IpInfo>(){
            @Override
            public void onStart() {
                super.onStart();
                loadTaskCallBack.onstart();
            }

            @Override
            protected void onSuccess(IpInfo ipInfo) {
                super.onSuccess(ipInfo);
                loadTaskCallBack.onSuccess(ipInfo);
            }

            @Override
            public void onFinish() {
                super.onFinish();
                loadTaskCallBack.onFinish();
            }

            @Override
            public void onFailure(int errorCode, String msg) {
                super.onFailure(errorCode, msg);
                loadTaskCallBack.onFailed();
            }
        });

    }
}
