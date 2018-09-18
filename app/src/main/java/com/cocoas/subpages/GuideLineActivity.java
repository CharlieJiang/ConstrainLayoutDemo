package com.cocoas.subpages;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.cocoas.constraintlayoutdemo.R;

/**
 * 测试约束布局的GuideLine控件
 * @author 蒋庆意
 * @Date 2018/9/18
 * @Time 14:05
 */
public class GuideLineActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_guideline);
    }
}
