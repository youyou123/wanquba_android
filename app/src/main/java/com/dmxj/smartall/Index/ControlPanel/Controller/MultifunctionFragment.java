package com.dmxj.smartall.Index.ControlPanel.Controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dmxj.smartall.R;
import com.yatoooon.screenadaptation.ScreenAdapterTools;

/**
 * Created by pyy on 2018/8/22.
 */

public class MultifunctionFragment  extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_multifunction, container, false);

    }


    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        initData();
    }
    private  void initView(){

    }
    private  void initData(){

    }


}
