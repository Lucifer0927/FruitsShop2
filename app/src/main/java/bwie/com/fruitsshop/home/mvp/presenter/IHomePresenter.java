package bwie.com.fruitsshop.home.mvp.presenter;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/9
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public interface IHomePresenter {
    //
    void loadStart();

    void detachView();

    //加载配置
    void loadConfig();

    //加载详情
    void loadDetail(String id);

}
