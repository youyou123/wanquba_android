package com.dmxj.smartall.Index.ControlPanel.Controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.dmxj.smartall.Base.BaseActivity;
import com.dmxj.smartall.Index.ControlPanel.Model.ControlPanelAdapter;
import com.dmxj.smartall.R;
import com.yatoooon.screenadaptation.ScreenAdapterTools;

import static com.dmxj.smartall.R.id.iv_point_Multifunction_controlView;

/**
 * Created by pyy on 2018/8/22.
 */


public class ControlPanelActivity extends FragmentActivity {//控制面板
    private ViewPager vp;
    private ImageView point_Multifunction, point_light;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controlpanel);
        ScreenAdapterTools.getInstance().loadView(getWindow().getDecorView());
        initView();
        initFragmentAdmin();


    }

    private void initView() {
        vp = findViewById(R.id.vp_ControlPanel);
        point_Multifunction = findViewById(iv_point_Multifunction_controlView);
        point_light = findViewById(R.id.iv_point_light_controlView);


    }

    private void initFragmentAdmin() {
        FragmentManager manager = getSupportFragmentManager();
        vp.setAdapter(new ControlPanelAdapter(manager));
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                switch (i) {
                    case 0:
                        point_Multifunction.setBackgroundResource(R.drawable.oval_white_point);
                        point_light.setBackgroundResource(R.drawable.oval_gray_point);
                        break;
                    case 1:
                        point_Multifunction.setBackgroundResource(R.drawable.oval_gray_point);
                        point_light.setBackgroundResource(R.drawable.oval_white_point);
                        break;
                }

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


    }


}

