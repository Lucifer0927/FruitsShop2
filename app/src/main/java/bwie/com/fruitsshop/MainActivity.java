package bwie.com.fruitsshop;

import android.Manifest;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import bwie.com.fruitsshop.base.BaseActivity;
import bwie.com.fruitsshop.base.PermissionsResultListener;
import bwie.com.fruitsshop.classify.ClassifyFragment;
import bwie.com.fruitsshop.home.mvp.view.fragment.HomeFragment;
import bwie.com.fruitsshop.my.MyFragment;
import bwie.com.fruitsshop.shopping.ShoppingFragment;
import bwie.com.fruitsshop.utils.ToastUtils;

public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar mBottomNavigationBar;
    private HomeFragment mHomeFragment;
    private ClassifyFragment mClassifyFragment;
    private ShoppingFragment mShoppingFragment;
    private MyFragment mMyFragment;
    private FragmentTransaction mTransaction;
    private static final int PER_REQUEST_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化BottomNavigation
        initView();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        boolean isPermissions = isPermissions();
        mBottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        mBottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.shouyexuan, "首页"))
                .addItem(new BottomNavigationItem(R.drawable.fenleiyixuan, "分类"))
                .addItem(new BottomNavigationItem(R.drawable.gouwucheyixuan, "购物车"))
                .addItem(new BottomNavigationItem(R.drawable.wodeyixuan, "我的"))
                .setFirstSelectedPosition(0)
                .initialise();
        mBottomNavigationBar.setTabSelectedListener(this);
        if (isPermissions) {
            setDefaultFragment();
        }
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    private void setDefaultFragment() {
        mTransaction = getSupportFragmentManager().beginTransaction();
        mHomeFragment = HomeFragment.newInstance("home_fragment");
        mTransaction.replace(R.id.fragment_container, mHomeFragment).commit();
    }

    @Override
    public void onTabSelected(int position) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (position) {
            case 0:
                if (mHomeFragment == null) {
                    mHomeFragment = HomeFragment.newInstance("home_fragment");
                }
                transaction.replace(R.id.fragment_container, mHomeFragment);
                break;
            case 1:
                if (mClassifyFragment == null) {
                    mClassifyFragment = mClassifyFragment.newInstance("classify_fragment");
                }
                transaction.replace(R.id.fragment_container, mClassifyFragment);


               break;
            case 2:
                if (mShoppingFragment == null) {
                    mShoppingFragment = ShoppingFragment.newInstance("shopping_fragment");
                }
                transaction.replace(R.id.fragment_container, mShoppingFragment);
                break;
            case 3:
                if (mMyFragment == null) {
                    mMyFragment = mMyFragment.newInstance("my_fragment");
                }
                transaction.replace(R.id.fragment_container, mMyFragment);
                break;
            default:
                if (mHomeFragment == null) {
                    mHomeFragment = HomeFragment.newInstance("home_fragment");
                }
                transaction.replace(R.id.fragment_container, mHomeFragment);
                break;
        }
        transaction.commit();
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }

    //判断6.0权限
    private boolean isPermissions() {
        //当前设备可以接收到基站的服务信号，便可获得位置信息。 Manifest.permission.ACCESS_COARSE_LOCATION
        performRequestPermissions(getString(R.string.permission_desc), new String[]{Manifest.permission.READ_PHONE_STATE}
                , PER_REQUEST_CODE, new PermissionsResultListener() {
                    @Override
                    public void onPermissionGranted() {
                        ToastUtils.showShortToast("已申请权限");
//                        Toast.makeText(MainActivity.this, "已申请权限", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onPermissionDenied() {
                        ToastUtils.showShortToast("已申请权限");
//                        Toast.makeText(MainActivity.this, "已申请权限", Toast.LENGTH_SHORT).show();
                    }
                });

        return true;
    }


}
