package bwie.com.fruitsshop.home.mvp.model.net;

import bwie.com.fruitsshop.Constants;
import bwie.com.fruitsshop.core.ApiGenerator;
import bwie.com.fruitsshop.core.ApiService;
import retrofit2.Call;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/9
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 * <p>
 * 作用:
 * 拼接URL
 * 组装参数
 * 主要对应 接口文档
 */

public class ApiHome {
    private static volatile ApiHome instance;
    private ApiService mApiService;

    private ApiHome() {
        mApiService = ApiGenerator.getApiService();
    }

    public static ApiHome getInstance() {
        if (instance == null) {
            synchronized (ApiHome.class) {
                if (instance == null) {
                    instance = new ApiHome();
                }
            }
        }
        return instance;
    }

    public Call<String> getConfigService(String id) {
        if (mApiService == null) {
            mApiService = ApiGenerator.getApiService();
        }
        return mApiService.baseGetService(getConfigUrl(id));
    }

    private String getConfigUrl(String id) {
        return new StringBuffer()
                .append(Constants.BASE_URL)
                .append(Constants.BaSE_URL_PASH)
                .append("id=").append(id).toString();
    }
}
