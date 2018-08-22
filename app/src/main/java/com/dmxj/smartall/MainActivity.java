package com.dmxj.smartall;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dmxj.smartall.Base.BaseActivity;
import com.dmxj.smartall.Index.IndexFragment;
import com.yatoooon.screenadaptation.ScreenAdapterTools;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private List<Fragment> fragments;
    private FrameLayout mFrameContent;
    private FrameLayout frameContent;
    private ImageView ivTabbarIndex;
    /**
     * 首页
     */
    private TextView tvTabbarIndex;
    private LinearLayout llTabbarIndex;
    private ImageView ivTabbarFind;
    /**
     * 发现
     */
    private TextView tvTabbarFind;
    private LinearLayout llTabbarFind;
    private ImageView ivTabbarCircle;
    /**
     * 圈子
     */
    private TextView tvTabbarCircle;
    private LinearLayout llTabbarCircle;
    private ImageView ivTabbarMine;
    /**
     * 我的
     */
    private TextView tvTabbarMine;
    private LinearLayout llTabbarMine;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ScreenAdapterTools.getInstance().loadView(getWindow().getDecorView());
        initFragment();
    }

    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(IndexFragment.newInstance("首页", ""));
        fragments.add(TestFragment.newInstance("发现", ""));
        fragments.add(TestFragment.newInstance("圈子", ""));
        fragments.add(TestFragment.newInstance("我的", ""));

        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_content, fragments.get(0));
        transaction.commit();
    }

    private void initView() {
        frameContent = (FrameLayout) findViewById(R.id.frame_content);
        ivTabbarIndex = (ImageView) findViewById(R.id.iv_tabbar_index);
        tvTabbarIndex = (TextView) findViewById(R.id.tv_tabbar_index);
        llTabbarIndex = (LinearLayout) findViewById(R.id.ll_tabbar_index);
        llTabbarIndex.setOnClickListener(this);
        ivTabbarFind = (ImageView) findViewById(R.id.iv_tabbar_find);
        tvTabbarFind = (TextView) findViewById(R.id.tv_tabbar_find);
        llTabbarFind = (LinearLayout) findViewById(R.id.ll_tabbar_find);
        llTabbarFind.setOnClickListener(this);
        ivTabbarCircle = (ImageView) findViewById(R.id.iv_tabbar_circle);
        tvTabbarCircle = (TextView) findViewById(R.id.tv_tabbar_circle);
        llTabbarCircle = (LinearLayout) findViewById(R.id.ll_tabbar_circle);
        llTabbarCircle.setOnClickListener(this);
        ivTabbarMine = (ImageView) findViewById(R.id.iv_tabbar_mine);
        tvTabbarMine = (TextView) findViewById(R.id.tv_tabbar_mine);
        llTabbarMine = (LinearLayout) findViewById(R.id.ll_tabbar_mine);
        llTabbarMine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.ll_tabbar_index:
                switchFragment(R.id.ll_tabbar_index);
                break;
            case R.id.ll_tabbar_find:
                switchFragment(R.id.ll_tabbar_find);
                break;
            case R.id.ll_tabbar_circle:
                switchFragment(R.id.ll_tabbar_circle);
                break;
            case R.id.ll_tabbar_mine:
                switchFragment(R.id.ll_tabbar_mine);
                break;
        }
    }

    private void switchFragment(int resId) {
        ivTabbarIndex.setSelected(false);
        tvTabbarIndex.setSelected(false);
        ivTabbarFind.setSelected(false);
        tvTabbarFind.setSelected(false);
        ivTabbarCircle.setSelected(false);
        tvTabbarCircle.setSelected(false);
        ivTabbarMine.setSelected(false);
        tvTabbarMine.setSelected(false);
        transaction = manager.beginTransaction();
        switch (resId) {
            default:
                break;
            case R.id.ll_tabbar_index:
                transaction.replace(R.id.frame_content, fragments.get(0));
                ivTabbarIndex.setSelected(true);
                tvTabbarIndex.setSelected(true);
                break;
            case R.id.ll_tabbar_find:
                transaction.replace(R.id.frame_content, fragments.get(1));
                ivTabbarFind.setSelected(true);
                tvTabbarFind.setSelected(true);
                break;
            case R.id.ll_tabbar_circle:
                transaction.replace(R.id.frame_content, fragments.get(2));
                ivTabbarCircle.setSelected(true);
                tvTabbarCircle.setSelected(true);
                break;
            case R.id.ll_tabbar_mine:
                transaction.replace(R.id.frame_content, fragments.get(3));
                ivTabbarMine.setSelected(true);
                tvTabbarMine.setSelected(true);
                break;
        }
        transaction.commit();
    }
}
