package com.github.fwh007.attackanddefense;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText passwordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passwordET = findViewById(R.id.et_password);
        findViewById(R.id.btn_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (passwordET.getText().toString().equals("thereisnospoon")) {
                    verifySuccess();
                } else {
                    verifyFail();
                }
            }
        });
    }

    private void verifySuccess() {
        startActivity(new Intent(MainActivity.this, SuccessActivity.class));
    }

    private void verifyFail() {
        Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_SHORT).show();
    }
}
