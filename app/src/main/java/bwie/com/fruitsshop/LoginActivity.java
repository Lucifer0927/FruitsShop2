package bwie.com.fruitsshop;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import bwie.com.fruitsshop.base.BaseActivity;

public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private EditText username, userpass;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        findViewById(R.id.img_login_cancel).setOnClickListener(this);
        findViewById(R.id.btn_login_denglu).setOnClickListener(this);
        findViewById(R.id.text_login_zhucezhanghao).setOnClickListener(this);
        findViewById(R.id.text_login_wangjimima).setOnClickListener(this);
        username = (EditText) findViewById(R.id.username);
        userpass = (EditText) findViewById(R.id.userpass);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_login_cancel:
                finish();
                break;
            case R.id.btn_login_denglu:
                login();
                break;
            case R.id.text_login_zhucezhanghao:

                break;
            case R.id.text_login_wangjimima:

                break;
        }
    }

    //登陆
    public void login() {
        String name = username.getText().toString().trim();
        String pass = userpass.getText().toString().trim();
        if (name == null || name == "" || name.isEmpty()) {
            Toast.makeText(LoginActivity.this, "请输入用户码", Toast.LENGTH_SHORT).show();
            return;
        }

        if (pass == null || pass == "" || pass.isEmpty()) {
            Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }


    }
}
