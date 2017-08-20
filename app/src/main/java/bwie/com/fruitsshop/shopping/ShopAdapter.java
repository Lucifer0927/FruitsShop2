package bwie.com.fruitsshop.shopping;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bwie.com.fruitsshop.R;


/**
 * Created by 葛凯旋 on 2017/8/9.
 */

public class ShopAdapter extends BaseAdapter {
    private boolean isShow = true;//是否显示编辑/完成
    private List<ShopBean> shoppingCartBeanList;
    private CheckInterface checkInterface;
    private ModifyCountInterface modifyCountInterface;
    private Context context;

    public ShopAdapter(Context context) {
        this.context = context;
    }

    public void setShoppingCartBeanList(List<ShopBean> shoppingCartBeanList) {
        this.shoppingCartBeanList = shoppingCartBeanList;
        notifyDataSetChanged();
    }

    /**
     * 单选接口
     *
     * @param checkInterface
     */
    public void setCheckInterface(CheckInterface checkInterface) {
        this.checkInterface = checkInterface;
    }

    /**
     * 改变商品数量接口
     *
     * @param modifyCountInterface
     */
    public void setModifyCountInterface(ModifyCountInterface modifyCountInterface) {
        this.modifyCountInterface = modifyCountInterface;
    }

    @Override
    public int getCount() {
        return shoppingCartBeanList == null ? 0 : shoppingCartBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return shoppingCartBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    /**
     * 是否显示可编辑
     *
     * @param flag
     */
    public void isShow(boolean flag) {
        isShow = flag;
        notifyDataSetChanged();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_shopcart_product, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final ShopBean shoppingCartBean = shoppingCartBeanList.get(position);
        boolean choosed = shoppingCartBean.isChoosed();
        if (choosed) {
            holder.ckOneChose.setChecked(true);
        } else {
            holder.ckOneChose.setChecked(false);
        }


        holder.oneprice.setText(shoppingCartBean.getPrice() + "");

        holder.productnum.setText(shoppingCartBean.getCount() + "");

        //单选框按钮
        holder.ckOneChose.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        shoppingCartBean.setChoosed(((CheckBox) v).isChecked());
                        checkInterface.checkGroup(position, ((CheckBox) v).isChecked());//向外暴露接口
                    }
                }
        );
        //增加按钮
        holder.ivAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modifyCountInterface.doIncrease(position, holder.oneprice, holder.ckOneChose.isChecked());//暴露增加接口
            }
        });
        //删减按钮
        holder.ivSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modifyCountInterface.doDecrease(position, holder.oneprice, holder.ckOneChose.isChecked());//暴露删减接口
            }
        });
        //删除弹窗
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alert = new AlertDialog.Builder(context).create();
                alert.setTitle("操作提示");
                alert.setMessage("您确定要将这些商品从购物车中移除吗？");
                alert.setButton(DialogInterface.BUTTON_NEGATIVE, "取消",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                return;
                            }
                        });
                alert.setButton(DialogInterface.BUTTON_POSITIVE, "确定",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                modifyCountInterface.childDelete(position);//删除 目前只是从item中移除

                            }
                        });
                alert.show();
            }
        });
        //判断是否在编辑状态下
if(isShow){

    holder.rlEdit.setVisibility(View.GONE);
    holder.productnum.setVisibility(View.VISIBLE);
    holder.delete.setVisibility(View.GONE);
} else {

    holder.rlEdit.setVisibility(View.VISIBLE);
    holder.productnum.setVisibility(View.GONE);
    holder.delete.setVisibility(View.VISIBLE);
}
        return convertView;
    }

    //初始化控件
    class ViewHolder {

        TextView oneprice, productnum, ivSub, ivAdd;
        CheckBox ckOneChose;
        LinearLayout rlEdit;
        ImageView  delete;

        public ViewHolder(View itemView) {
            ckOneChose = (CheckBox) itemView.findViewById(R.id.onecheck);
            ivSub = (TextView) itemView.findViewById(R.id.jian);
            ivAdd = (TextView) itemView.findViewById(R.id.jia);
            oneprice = (TextView) itemView.findViewById(R.id.oneprice);
            productnum = (TextView) itemView.findViewById(R.id.productnum);
            rlEdit = (LinearLayout) itemView.findViewById(R.id.rl_edit);
            delete = (ImageView) itemView.findViewById(R.id.tv_commodity_delete);
        }
    }

    /**
     * 复选框接口
     */
    public interface CheckInterface {
        /**
         * 组选框状态改变触发的事件
         *
         * @param position  元素位置
         * @param isChecked 元素选中与否
         */
        void checkGroup(int position, boolean isChecked);
    }


    /**
     * 改变数量的接口
     */
    public interface ModifyCountInterface {
        /**
         * 增加操作
         *
         * @param position      元素位置
         * @param showCountView 用于展示变化后数量的View
         * @param isChecked     子元素选中与否
         */
        void doIncrease(int position, View showCountView, boolean isChecked);

        /**
         * 删减操作
         *
         * @param position      元素位置
         * @param showCountView 用于展示变化后数量的View
         * @param isChecked     子元素选中与否
         */
        void doDecrease(int position, View showCountView, boolean isChecked);

        /**
         * 删除子item
         *
         * @param position
         */
        void childDelete(int position);
    }

}

