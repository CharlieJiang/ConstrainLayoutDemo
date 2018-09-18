package com.cocoas.subpages;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.cocoas.constraintlayoutdemo.R;

/**
 * 约束布局的magin测试（主要测试相对gone的视图）
 * @author 蒋庆意
 * @Date 2018/9/13
 * @Time 15:33
 */

public class MarginsActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_maigins);
    }
}
