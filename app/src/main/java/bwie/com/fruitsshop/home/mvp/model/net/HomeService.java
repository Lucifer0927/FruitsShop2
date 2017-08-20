package bwie.com.fruitsshop.home.mvp.model.net;

import android.util.Log;

import bwie.com.fruitsshop.core.NetCallBack;
import bwie.com.fruitsshop.home.mvp.model.beans.DetailsBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/9
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class HomeService {
    private static volatile HomeService instance;

    private HomeService() {

    }

    public static HomeService getInstance() {
        if (instance == null) {
            synchronized (HomeService.class) {
                if (instance == null) {
                    instance = new HomeService();
                }
            }
        }
        return instance;
    }

    public Call<String> getConfig(String id, final NetCallBack<DetailsBean> callback) {
        Call<String> call = ApiHome.getInstance().getConfigService(id);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d("a", "a");
                if (response != null && response.isSuccessful() && response.body() != null) {
                    String detail = response.body().toString();
                    callback.onNetSuccess(DetailsBean.objectFromData(detail));
                } else {
                    callback.onNetFail(null);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                callback.onNetFail(null);
            }
        });
        return call;
    }


}
