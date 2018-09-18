package com.cocoas.subpages;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.cocoas.constraintlayoutdemo.R;

/**
 * 圆形定位测试
 * @author 蒋庆意
 * @Date 2018/9/14
 * @Time 11:44
 */
public class CircularPositioningActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_circular_positioning);
    }
}
