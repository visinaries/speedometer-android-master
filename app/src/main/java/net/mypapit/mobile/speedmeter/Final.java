package net.mypapit.mobile.speedmeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }
    public void clickexit(View view) {

        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
