package com.tianzhuan.proxydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tianzhuan.proxydemo.annotation.ClickBehavior;
import com.tianzhuan.proxydemo.annotation.LoginCheck;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="MainActivity >>> ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //登录点击事件（需要做用户行为统计）
    @ClickBehavior("登录")
    @LoginCheck
    public void login(View view) {
        Log.e(TAG,"模拟接口请求。。。验证通过，登录成功！");
    }

    //需要做用户行为统计
    @ClickBehavior("我的专区")
    @LoginCheck
    public void area(View view) {
        //开始统计代码
        Log.e(TAG,"开始跳转---》我的专区");
        startActivity(new Intent(this,OtherActivity.class));
        //结束统计代码
    }
    //需要做用户行为统计
    @ClickBehavior("我的优惠券")
    @LoginCheck
    public void coupon(View view) {
        Log.e(TAG,"开始跳转---》我的优惠券");
        startActivity(new Intent(this,OtherActivity.class));

    }
    //需要做用户行为统计
    @ClickBehavior("我的积分")
    @LoginCheck
    public void score(View view) {
        Log.e(TAG,"开始跳转---》我的积分");
        startActivity(new Intent(this,OtherActivity.class));
    }
}
