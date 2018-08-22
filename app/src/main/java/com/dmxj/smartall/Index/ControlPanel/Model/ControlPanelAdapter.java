package com.dmxj.smartall.Index.ControlPanel.Model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dmxj.smartall.Index.ControlPanel.Controller.LightMenuFragment;
import com.dmxj.smartall.Index.ControlPanel.Controller.MultifunctionFragment;

/**
 * Created by pyy on 2018/8/22.
 */

public class ControlPanelAdapter extends FragmentPagerAdapter {
    public ControlPanelAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int arg0) {
        switch (arg0) {
            case 0:
                MultifunctionFragment multifunctionFragment=new MultifunctionFragment();
                return multifunctionFragment;
            case 1:
                LightMenuFragment lightMunuFragment=new LightMenuFragment();
                return lightMunuFragment;


            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 2;
    }

}



