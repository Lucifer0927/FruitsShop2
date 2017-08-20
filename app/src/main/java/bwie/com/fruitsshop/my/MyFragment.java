package bwie.com.fruitsshop.my;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bwie.com.fruitsshop.Constants;
import bwie.com.fruitsshop.LoginActivity;
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

public class MyFragment extends BaseFragment implements View.OnClickListener {
    private TextView daifahuo;

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_my_layout;
    }

    @Override
    protected void initView() {
        daifahuo=(TextView)getView().findViewById(R.id.daifahuo);
        getView().findViewById(R.id.img_fragment_login).setOnClickListener(this);
        getView().findViewById(R.id.fragment_wodedingdan).setOnClickListener(this);
        getView().findViewById(R.id.fragment_chakan).setOnClickListener(this);
        getView().findViewById(R.id.daifukuan).setOnClickListener(this);
        getView().findViewById(R.id.daifahuo).setOnClickListener(this);
        getView().findViewById(R.id.daishouhuo).setOnClickListener(this);
        getView().findViewById(R.id.tuikuan).setOnClickListener(this);
        getView().findViewById(R.id.wodeguanzhu).setOnClickListener(this);
        getView().findViewById(R.id.xiugaimima).setOnClickListener(this);
        getView().findViewById(R.id.shouhuoxinxi).setOnClickListener(this);
        getView().findViewById(R.id.guanyuwomen).setOnClickListener(this);
        getView().findViewById(R.id.lianxiwomen).setOnClickListener(this);
        getView().findViewById(R.id.yonghushezhi).setOnClickListener(this);

        Drawable drawable = getResources().getDrawable(R.mipmap.daifahuo);
        drawable.setBounds(0, 0, 25, 25);
        daifahuo.setCompoundDrawables(null,drawable,null,null);

    }


    public static MyFragment newInstance(String s) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_ARGS, s);
        MyFragment fragment = new MyFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
        switch (v.getId()) {
            case R.id.img_fragment_login:
                break;
            case R.id.fragment_wodedingdan:
                break;
            case R.id.fragment_chakan:
                break;
            case R.id.daifukuan:
                break;
            case R.id.daifahuo:
                break;
            case R.id.daishouhuo:
                break;
            case R.id.tuikuan:
                break;
            case R.id.wodeguanzhu:
                break;
            case R.id.xiugaimima:
                break;
            case R.id.shouhuoxinxi:
                break;
            case R.id.guanyuwomen:
                break;
            case R.id.lianxiwomen:
                break;
            case R.id.yonghushezhi:
                break;

        }
    }

}
