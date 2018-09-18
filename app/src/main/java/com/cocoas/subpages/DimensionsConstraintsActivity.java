package com.cocoas.subpages;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import com.cocoas.constraintlayoutdemo.R;

/**
 * 尺寸约束测试
 * @author 蒋庆意
 * @Date 2018/9/14
 * @Time 14:21
 */
public class DimensionsConstraintsActivity extends Activity {

    private EditText et;
    private Button btn;
    private Button btn02;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dimensions_constraints);

        et = findViewById(R.id.dimensionsCons_et_01);
        btn = findViewById(R.id.dimensionsCons_btn_01);
        btn02 = findViewById(R.id.dimensionsCons_btn_02);

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                btn.setText(charSequence);
                btn02.setText(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
