package bwie.com.fruitsshop.core;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/9
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public interface NetCallBack<T> {
    //开始loading
    void onStart();

    //加载数据成功
    void onNetSuccess(T t);

    //加载数据失败
    void onNetFail(T t);
}
