package com.cocoas.constraintlayoutdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.cocoas.subpages.CenteringPositioningActivity;
import com.cocoas.subpages.ChainsActivity;
import com.cocoas.subpages.CircularPositioningActivity;
import com.cocoas.subpages.DimensionsConstraintsActivity;
import com.cocoas.subpages.GuideLineActivity;
import com.cocoas.subpages.MarginsActivity;
import com.cocoas.subpages.RelativePositioningActivity;

/**
 * ConstraintLayout测试
 * @author 蒋庆意
 * @Date 2018/9/13
 * @Time 9:24
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnRelativePositioning;
    private Button btnMargins;
    private Button btnCenteringPositioning;
    private Button btnSircularPositioning;
    private Button btnDimensionsConstraints;
    private Button btnChains;
    private Button btnGuideLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRelativePositioning = (Button)findViewById(R.id.main_btn_relativePositioning);
        btnRelativePositioning.setOnClickListener(this);
        btnMargins = (Button)findViewById(R.id.main_btn_margins);
        btnMargins.setOnClickListener(this);
        btnCenteringPositioning = (Button)findViewById(R.id.main_btn_centeringPositioning);
        btnCenteringPositioning.setOnClickListener(this);
        btnSircularPositioning = (Button)findViewById(R.id.main_btn_circularPositioning);
        btnSircularPositioning.setOnClickListener(this);
        btnDimensionsConstraints = (Button)findViewById(R.id.main_btn_dimensionsConstraints);
        btnDimensionsConstraints.setOnClickListener(this);
        btnChains = (Button)findViewById(R.id.main_btn_chains);
        btnChains.setOnClickListener(this);
        btnGuideLine = (Button)findViewById(R.id.main_btn_guideline);
        btnGuideLine.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int clickViewId = view.getId();
        switch(clickViewId){
            case R.id.main_btn_relativePositioning:
                //相对定位测试页面
                pageJump(MainActivity.this, RelativePositioningActivity.class);
                break;
            case R.id.main_btn_margins:
                //margins测试页面
                pageJump(MainActivity.this, MarginsActivity.class);
                break;
            case R.id.main_btn_centeringPositioning:
                //居中定位测试页面
                pageJump(MainActivity.this, CenteringPositioningActivity.class);
                break;
            case R.id.main_btn_circularPositioning:
                //圆形定位测试页面
                pageJump(MainActivity.this, CircularPositioningActivity.class);
                break;
            case R.id.main_btn_dimensionsConstraints:
                //尺寸约束测试页面
                pageJump(MainActivity.this, DimensionsConstraintsActivity.class);
                break;
            case R.id.main_btn_chains:
                //链式布局测试页面
                pageJump(MainActivity.this, ChainsActivity.class);
                break;
            case R.id.main_btn_guideline:
                //参考线控件测试页面
                pageJump(MainActivity.this, GuideLineActivity.class);
                break;
            default:
                Log.w("Main","未知事件");
                break;
        }
    }

    /**
     * 页面跳转
     * @param fromPage  当前页面
     * @param toPage    跳转到的页面
     */
    private void  pageJump(Context fromPage,Class toPage){
        Intent intent = new Intent(fromPage,toPage);
        MainActivity.this.startActivity(intent);
    }
}
