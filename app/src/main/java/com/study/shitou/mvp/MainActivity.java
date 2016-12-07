package com.study.shitou.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.study.shitou.mvp.login.LoginActivity;

/**
 * View: 视图层，对应xml文件
 *Controller: 控制层，对应Activity和Fragment层，进行数据处理
 *Model：实体层，负责获取实体数据
 * MVP--------------------------------------------------
 *View: 视图层，对应xml文件与Activity/Fragment
 *Presenter: 逻辑控制层，同时持有View和Model对象
 *Model: 实体层，负责获取实体数据
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.action_login).setOnMenuItemClickListener(
                new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(intent);
                        return false;
                    }
                });
        return true;
    }

}
