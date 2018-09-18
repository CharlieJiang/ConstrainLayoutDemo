package com.cocoas.subpages;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.cocoas.constraintlayoutdemo.R;

/**
 *  相对定位测试
 * @author 蒋庆意
 * @Date 2018/9/13
 * @Time 11:09
 */

public class RelativePositioningActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative_positioning);
    }
}
