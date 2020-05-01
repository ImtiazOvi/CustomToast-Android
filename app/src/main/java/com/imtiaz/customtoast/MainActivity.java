package com.imtiaz.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private Button btnSuccess, btnPlainText, btnWarning, btnError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // context
        mContext = MainActivity.this;
        // button init
        btnSuccess = findViewById(R.id.btn_success);
        btnPlainText = findViewById(R.id.btn_plan_text);
        btnWarning = findViewById(R.id.btn_warning);
        btnError = findViewById(R.id.btn_error);

        // onClick button success
        btnSuccess.setOnClickListener((View v) -> {
            MIUToast.success(mContext, getString(R.string.txt_success_toast));
        });
        // onClick button plain text
        btnPlainText.setOnClickListener((View v) -> {
            MIUToast.plainText(mContext, getString(R.string.txt_plain_toast));
        });
        // onClick button warning
        btnWarning.setOnClickListener((View v) -> {
            MIUToast.warning(mContext, getString(R.string.txt_warning_toast));
        });
        // onClick button error
        btnError.setOnClickListener((View v) -> {
            MIUToast.error(mContext, getString(R.string.txt_error_toast));
        });
    }
}
