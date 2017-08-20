package bwie.com.fruitsshop.classify;

import android.os.Bundle;

import bwie.com.fruitsshop.Constants;
import bwie.com.fruitsshop.R;
import bwie.com.fruitsshop.base.BaseFragment;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/6
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class ClassifyFragment extends BaseFragment {

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_classify_layout;
    }

    @Override
    protected void initView() {

    }

    public static ClassifyFragment newInstance(String s) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_ARGS, s);
        ClassifyFragment fragment = new ClassifyFragment();
        fragment.setArguments(bundle);
        return fragment;
    }
}
