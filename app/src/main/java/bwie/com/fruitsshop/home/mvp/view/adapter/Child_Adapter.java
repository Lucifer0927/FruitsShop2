package bwie.com.fruitsshop.home.mvp.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import bwie.com.fruitsshop.R;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/19
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class Child_Adapter extends RecyclerView.Adapter<Child_Adapter.ChildViewHolder> {

    private Context mContext;
    private String[] str;
    private int[] img;

    public Child_Adapter(Context context, String[] str, int[] img) {
        mContext = context;
        this.str = str;
        this.img = img;
    }

    @Override
    public ChildViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.child_item, null);
        ChildViewHolder childViewHolder = new ChildViewHolder(inflate);
        return childViewHolder;
    }

    @Override
    public void onBindViewHolder(ChildViewHolder holder, int position) {
        holder.mTxt_child_title.setText(str[position]);
        holder.mImg_child.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return str != null ? str.length : 0;
    }

    class ChildViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTxt_child_title;
        private final ImageView mImg_child;

        public ChildViewHolder(View itemView) {
            super(itemView);

            mTxt_child_title = (TextView) itemView.findViewById(R.id.txt_child_title);
            mImg_child = (ImageView) itemView.findViewById(R.id.img_child);
        }
    }
}
