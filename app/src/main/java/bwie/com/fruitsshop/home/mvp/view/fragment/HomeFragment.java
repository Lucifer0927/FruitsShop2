package bwie.com.fruitsshop.home.mvp.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import bwie.com.fruitsshop.Constants;
import bwie.com.fruitsshop.R;
import bwie.com.fruitsshop.base.BaseFragment;
import bwie.com.fruitsshop.home.mvp.model.beans.DetailsBean;
import bwie.com.fruitsshop.home.mvp.model.beans.HomeBean;
import bwie.com.fruitsshop.home.mvp.presenter.HomePresenterImp;
import bwie.com.fruitsshop.home.mvp.view.adapter.HomeAdapter;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/6
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class HomeFragment extends BaseFragment implements IHomeView<DetailsBean> {
    private List<HomeBean> homeList = new ArrayList<>();

    private List<String> list = new ArrayList<>();

    private ProgressBar mProgressBar_home_all;
    private View mRelativeLayout_home_error;
    private RecyclerView mRecycle_home;


    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_home_layout;
    }

    @Override
    protected void initView() {
        final HomePresenterImp homePresenterImp = new HomePresenterImp(this);
        homePresenterImp.loadDetail("3");

        mProgressBar_home_all = (ProgressBar) getActivity().findViewById(R.id.progressBar_home_all);
        mRelativeLayout_home_error = getActivity().findViewById(R.id.relativeLayout_home_error);
        mRelativeLayout_home_error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homePresenterImp.loadDetail("3");
            }
        });
        mRecycle_home = (RecyclerView) getView().findViewById(R.id.tropical_recycler);
        mRecycle_home.setLayoutManager(new LinearLayoutManager(mContext));
        list.add("");
        list.add("你好！");
        list.add("你好！");

        HomeAdapter homeAdapter = new HomeAdapter(mContext);
        mRecycle_home.setAdapter(homeAdapter);
    }

    public static HomeFragment newInstance(String s) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_ARGS, s);
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void showOrHideLoading(boolean flag) {
        if (flag) {
            mProgressBar_home_all.setVisibility(View.VISIBLE);
        } else {
            mProgressBar_home_all.setVisibility(View.GONE);
        }
    }

    @Override
    public void showOrHideErrorView(boolean flag) {
        if (flag) {
            mRelativeLayout_home_error.setVisibility(View.VISIBLE);
        } else {
            mRelativeLayout_home_error.setVisibility(View.GONE);
        }
    }

    @Override
    public void refreshView(DetailsBean detailsBean) {

    }
}
