package bwie.com.fruitsshop.home.mvp.view.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import bwie.com.fruitsshop.R;
import bwie.com.fruitsshop.home.mvp.model.beans.HomeBean;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/19
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    private Context mContext;

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


    public HomeAdapter(Context context) {
        mContext = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.home_adapter_item, null);
        MyViewHolder myViewHolder = new MyViewHolder(inflate);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if (position == 0) {
            holder.mTxt_home_title.setImageResource(R.mipmap.redai);
//            holder.mTxt_home_title.setText(list.get(position));
            holder.mRecycle_item.setLayoutManager(new GridLayoutManager(mContext, 3));
            holder.mRecycle_item.setAdapter(new Child_Adapter(mContext, tropicalTitleText, tropicalTitleImg));
        } else if (position == 1) {
            holder.mTxt_home_title.setImageResource(R.mipmap.dangjishiling);
//            holder.mTxt_home_title.setText(list.get(position));
            holder.mRecycle_item.setLayoutManager(new GridLayoutManager(mContext, 3));
            holder.mRecycle_item.setAdapter(new Child_Adapter(mContext, hotTitleText, hotTitleImg));
        } else if (position == 2) {
            holder.mTxt_home_title.setImageResource(R.mipmap.jingpin);
//            holder.mTxt_home_title.setText(list.get(position));
            holder.mRecycle_item.setLayoutManager(new LinearLayoutManager(mContext));
            holder.mRecycle_item.setAdapter(new Child_Adapter(mContext, recommendTitleText, recommendTitleImg));
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView mTxt_home_title;
        private final RecyclerView mRecycle_item;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTxt_home_title = (ImageView) itemView.findViewById(R.id.txt_home_title);
            mRecycle_item = (RecyclerView) itemView.findViewById(R.id.recycle_item);
        }
    }
}
