package bwie.com.fruitsshop;

import android.content.Intent;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

import bwie.com.fruitsshop.base.BaseActivity;

public class NavigationActivity extends BaseActivity implements View.OnClickListener {
    private Button welcomeBtntimeAll;
    private CountDownTimer mTimer;


    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                welcomeBtntimeAll.setText("跳过" + millisUntilFinished / 1000 + "s");
            }

            @Override
            public void onFinish() {
                welcomeBtntimeAll.setText("跳过");
                startActivity(new Intent(NavigationActivity.this, MainActivity.class));
                finish();
            }
        }.start();

        welcomeBtntimeAll = (Button) findViewById(R.id.welcome_btntime_all);
        welcomeBtntimeAll.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    public void onClick(View v) {
        mTimer.cancel();
        startActivity(new Intent(NavigationActivity.this, MainActivity.class));
        finish();
    }
}
