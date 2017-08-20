package bwie.com.fruitsshop.home.mvp.presenter;

import bwie.com.fruitsshop.core.NetCallBack;
import bwie.com.fruitsshop.home.mvp.model.beans.DetailsBean;
import bwie.com.fruitsshop.home.mvp.model.net.HomeService;
import bwie.com.fruitsshop.home.mvp.view.fragment.IHomeView;
import retrofit2.Call;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/9
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class HomePresenterImp implements IHomePresenter {
    private IHomeView mIHomeView;
    private Call mCall;

    private HomePresenterImp() {

    }

    public HomePresenterImp(IHomeView iHomeView) {
        this.mIHomeView = iHomeView;
    }

    @Override
    public void loadStart() {

    }

    @Override
    public void detachView() {
        if (mIHomeView != null) {
            mIHomeView = null;
        }
        if (mCall != null && mCall.isCanceled()) {
            mCall.cancel();
            mCall = null;
        }
    }

    @Override
    public void loadConfig() {

    }

    @Override
    public void loadDetail(String id) {
        HomeService instance = HomeService.getInstance();
        mCall = instance.getConfig(id, new NetCallBack<DetailsBean>() {
            @Override
            public void onStart() {
                if (mIHomeView != null) {
                    mIHomeView.showOrHideLoading(true);
                    mIHomeView.showOrHideErrorView(false);
                }
            }

            @Override
            public void onNetSuccess(DetailsBean detailsBean) {
                if (mIHomeView != null) {
                    mIHomeView.showOrHideLoading(false);
                    mIHomeView.refreshView(detailsBean);
                }
            }

            @Override
            public void onNetFail(DetailsBean detailsBean) {
                mIHomeView.showOrHideErrorView(true);
            }
        });
    }
}
