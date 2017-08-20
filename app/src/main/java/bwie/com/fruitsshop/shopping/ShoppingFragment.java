package bwie.com.fruitsshop.shopping;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

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

public class ShoppingFragment extends BaseFragment implements View.OnClickListener
        , ShopAdapter.CheckInterface, ShopAdapter.ModifyCountInterface {
    private static final String TAG = "ShoppingCartActivity";
    ImageView back;
    //全选
    CheckBox ckAll;
    //总额
    TextView tvShowPrice;
    //结算
    TextView tvSettlement;
    //编辑
    TextView btnEdit;//tv_edit

    ListView list_shopping_cart;
    private ShopAdapter shoppingCartAdapter;
    private boolean flag = false;
    private List<ShopBean> shoppingCartBeanList = new ArrayList<>();
    private boolean mSelect;
    private double totalPrice = 0.00;// 购买的商品总价
    private int totalCount = 0;// 购买的商品总数量


    @Override
    protected void initView() {
        back = (ImageView) getView().findViewById(R.id.back);
        ckAll = (CheckBox) getView().findViewById(R.id.allxuan);
        tvShowPrice = (TextView) getView().findViewById(R.id.zero);
        tvSettlement = (TextView) getView().findViewById(R.id.pay);
        btnEdit = (TextView) getView().findViewById(R.id.bt_header_right);
        list_shopping_cart = (ListView) getView().findViewById(R.id.mylist);
        btnEdit.setOnClickListener(this);
        ckAll.setOnClickListener(this);
        tvSettlement.setOnClickListener(this);
        back.setOnClickListener(this);
        initData();
    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            ShopBean shoppingCartBean = new ShopBean();

            shoppingCartBean.setDressSize(20);
            shoppingCartBean.setId(i);
            shoppingCartBean.setPrice(20.00);
            shoppingCartBean.setCount(1);
            shoppingCartBeanList.add(shoppingCartBean);
        }

        shoppingCartAdapter = new ShopAdapter(getActivity());
        shoppingCartAdapter.setCheckInterface(this);
        shoppingCartAdapter.setModifyCountInterface(this);
        list_shopping_cart.setAdapter(shoppingCartAdapter);
        shoppingCartAdapter.setShoppingCartBeanList(shoppingCartBeanList);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_shopping_layout;
    }

    public static ShoppingFragment newInstance(String s) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_ARGS, s);
        ShoppingFragment fragment = new ShoppingFragment();
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //全选按钮
            case R.id.allxuan:
                if (shoppingCartBeanList.size() != 0) {
                    if (ckAll.isChecked()) {
                        for (int i = 0; i < shoppingCartBeanList.size(); i++) {
                            shoppingCartBeanList.get(i).setChoosed(true);
                        }
                        shoppingCartAdapter.notifyDataSetChanged();
                    } else {
                        for (int i = 0; i < shoppingCartBeanList.size(); i++) {
                            shoppingCartBeanList.get(i).setChoosed(false);
                        }
                        shoppingCartAdapter.notifyDataSetChanged();
                    }
                }
                statistics();
                break;
            case R.id.bt_header_right:
                flag = !flag;
                if (flag) {
                    btnEdit.setText("完成");
                    shoppingCartAdapter.isShow(false);
                } else {
                    btnEdit.setText("编辑");
                    shoppingCartAdapter.isShow(true);
                }
                break;
            case R.id.pay: //结算
                lementOnder();
                break;
            case R.id.back:

                break;
        }
    }

    /**
     * 结算订单、支付
     */
    private void lementOnder() {
        //选中的需要提交的商品清单
        for (ShopBean bean : shoppingCartBeanList) {
            boolean choosed = bean.isChoosed();
            if (choosed) {
                int count = bean.getCount();
                double price = bean.getPrice();
                int size = bean.getDressSize();
                String attribute = bean.getAttribute();
                int id = bean.getId();

            }
        }
    }

    @Override
    public void checkGroup(int position, boolean isChecked) {
        shoppingCartBeanList.get(position).setChoosed(isChecked);
        if (isAllCheck())
            ckAll.setChecked(true);
        else
            ckAll.setChecked(false);
        shoppingCartAdapter.notifyDataSetChanged();
        statistics();
    }

    private boolean isAllCheck() {

        for (ShopBean group : shoppingCartBeanList) {
            if (!group.isChoosed())
                return false;
        }
        return true;
    }

    public void statistics() {
        totalCount = 0;
        totalPrice = 0.00;
        for (int i = 0; i < shoppingCartBeanList.size(); i++) {
            ShopBean shoppingCartBean = shoppingCartBeanList.get(i);
            if (shoppingCartBean.isChoosed()) {
                totalCount++;
                totalPrice += shoppingCartBean.getPrice() * shoppingCartBean.getCount();
            }
        }
        tvShowPrice.setText(totalPrice + "");
        tvSettlement.setText("结算(" + totalCount + ")");
    }

    @Override
    public void doIncrease(int position, View showCountView, boolean isChecked) {
        ShopBean shoppingCartBean = shoppingCartBeanList.get(position);
        int currentCount = shoppingCartBean.getCount();
        currentCount++;
        shoppingCartBean.setCount(currentCount);
        ((TextView) showCountView).setText(currentCount + "");
        shoppingCartAdapter.notifyDataSetChanged();
        statistics();
    }

    @Override
    public void doDecrease(int position, View showCountView, boolean isChecked) {
        ShopBean shoppingCartBean = shoppingCartBeanList.get(position);
        int currentCount = shoppingCartBean.getCount();
        currentCount--;
        shoppingCartBean.setCount(currentCount);
        ((TextView) showCountView).setText(currentCount + "");
        shoppingCartAdapter.notifyDataSetChanged();
        statistics();
    }


    @Override
    public void childDelete(int position) {
        shoppingCartBeanList.remove(position);
        shoppingCartAdapter.notifyDataSetChanged();
        statistics();
    }
}
