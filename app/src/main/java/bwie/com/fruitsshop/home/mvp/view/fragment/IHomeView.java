package bwie.com.fruitsshop.home.mvp.view.fragment;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/9
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public interface IHomeView<T> {

    void showOrHideLoading(boolean flag);

    void showOrHideErrorView(boolean flag);

    void refreshView(T t);
}
