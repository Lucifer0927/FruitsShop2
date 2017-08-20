package bwie.com.fruitsshop.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import bwie.com.fruitsshop.R;
import bwie.com.fruitsshop.home.mvp.model.beans.HomeBean;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/18
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class MyTropicalAdapter extends RecyclerView.Adapter<MyTropicalAdapter.ViewHolder> {
    //热带水果
    private List<HomeBean.FirstBean> firstBeen = new ArrayList<>();
    int[] tropicalTitleImg = new int[]{R.mipmap.banana, R.mipmap.banana, R.mipmap.banana,
            R.mipmap.xiyou, R.mipmap.xiyou, R.mipmap.xiyou};
    String[] tropicalTitleText = new String[]{"山东大苹果", "山东大苹果", "山东大苹果", "山东大苹果", "山东大苹果", "山东大苹果"};

    //当季时令爆款
    private List<HomeBean.SecondBean> secondBeen = new ArrayList<>();
    int[] hotTitleImg = new int[]{R.mipmap.banana, R.mipmap.banana, R.mipmap.banana,
            R.mipmap.xiyou, R.mipmap.xiyou, R.mipmap.xiyou};
    String[] hotTitleText = new String[]{"菠萝", "菠萝", "菠萝", "菠萝", "菠萝", "菠萝"};

    //精品推荐
    private List<HomeBean.ThirdBean> thirdBeen = new ArrayList<>();
    int[] recommendTitleImg = new int[]{R.mipmap.banana, R.mipmap.banana, R.mipmap.banana,
            R.mipmap.xiyou, R.mipmap.xiyou, R.mipmap.xiyou};
    String[] recommendTitleText = new String[]{"火龙果", "火龙果", "火龙果", "火龙果", "火龙果", "火龙果"};



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {




        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }



    @Override
    public int getItemCount() {
        return 0;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }






}
