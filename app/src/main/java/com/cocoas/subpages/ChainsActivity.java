package com.cocoas.subpages;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.cocoas.constraintlayoutdemo.R;

/**
 * 测试链式布局：相当于flexbox布局
 * @author 蒋庆意
 * @Date 2018/9/18
 * @Time 11:25
 */

public class ChainsActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chains);
    }
}
