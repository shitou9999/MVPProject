package com.study.shitou.mvp.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.study.shitou.mvp.R;

/**
 *  *View: 视图层，对应xml文件与Activity/Fragment
 *  Presenter: 逻辑控制层，同时持有View和Model对象
 *  Model: 实体层，负责获取实体数据
 */
public class LoginActivity extends AppCompatActivity implements ILoginView{

    private LinearLayout loginLayout;
    private ProgressBar progressBar;

    private Button loginBtn;

    private ILoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        loginLayout = (LinearLayout) findViewById(R.id.login_layout);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        loginBtn = (Button) findViewById(R.id.loginBtn);

        loginPresenter = new LoginPresenter(this);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //模拟登陆，不需要账号密码
                loginPresenter.loginToServer("","");
            }
        });

    }


    @Override
    public void showProgress(boolean enable) {
        if (enable){
            progressBar.setVisibility(View.VISIBLE);
            loginLayout.setVisibility(View.GONE);
        }else {
            progressBar.setVisibility(View.GONE);
            loginLayout.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void showLoginView() {
        Toast.makeText(LoginActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
        finish();
    }

}



































