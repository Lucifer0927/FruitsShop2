package bwie.com.fruitsshop.core;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/9
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public interface ApiService {
    @GET
    Call<String> baseGetService(@Url String url);
}
