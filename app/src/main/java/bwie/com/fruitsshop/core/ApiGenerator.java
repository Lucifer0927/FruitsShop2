package bwie.com.fruitsshop.core;

import bwie.com.fruitsshop.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/9
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class ApiGenerator {

    static Retrofit build = new Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    public static ApiService getApiService() {
        return build.create(ApiService.class);
    }
}
